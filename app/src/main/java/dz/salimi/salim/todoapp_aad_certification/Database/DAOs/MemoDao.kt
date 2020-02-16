package dz.salimi.salim.todoapp_aad_certification.Database.DAOs

import androidx.lifecycle.LiveData
import androidx.room.*
import dz.salimi.salim.todoapp_aad_certification.Database.Entities.Memo

@Dao
interface MemoDao {

    @Insert
    fun insertMemo(memo: Memo)

    @Update
    fun updateMemo(memo: Memo)

    @Delete
    fun deleteMemo(memo: Memo)

    @Query("SELECT * FROM memos WHERE memoId=:id")
    fun getMemoById(id: Int)

    @Query("SELECT * from memos")
    fun getAllMemos(): LiveData<List<Memo>>

}