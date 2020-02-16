package dz.salimi.salim.todoapp_aad_certification.Database.DAOs

import androidx.lifecycle.LiveData
import androidx.room.*
import dz.salimi.salim.todoapp_aad_certification.Database.Entities.Media

@Dao
interface MediaDao {

    @Insert
    fun insertMedia(media: Media)

    @Update
    fun updateMedia(media: Media)

    @Delete
    fun deleteMedia(media: Media)

    @Query("SELECT * FROM medias")
    fun getAllMedias(): LiveData<List<Media>>

    @Query("SELECT * from medias WHERE id=:id")
    fun getMediaById(id: Int): LiveData<Media>

    
}