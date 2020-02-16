package dz.salimi.salim.todoapp_aad_certification.Database.Entities

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.time.LocalDateTime

@Entity (tableName= "memos")
data class Memo(
    @PrimaryKey(autoGenerate = true)
    var memoId: Int,

    var tite:String,

    var detail:String,

    var date:LocalDateTime

)