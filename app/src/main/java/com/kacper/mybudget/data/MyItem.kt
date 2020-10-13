package com.kacper.mybudget.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.kacper.mybudget.utilities.DATABASE_TABLE_MY_ITEM
import java.util.*

@Entity(tableName = DATABASE_TABLE_MY_ITEM)
data class MyItem(var type : String) {
    @PrimaryKey(autoGenerate = true) var uid: Int = 0
    var name : String = type
    var cost : Double = 0.0
    var calendar : Calendar = Calendar.getInstance()
}