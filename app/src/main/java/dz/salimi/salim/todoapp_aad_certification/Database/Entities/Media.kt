package dz.salimi.salim.todoapp_aad_certification.Database.Entities

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "medias")
data class Media (
    @PrimaryKey(autoGenerate = true)
    var id:Int,

    var path:String,

    var memoId:Int
)