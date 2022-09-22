package com.example.gdroom_c_09653_room

class note {
    @Entity
    data class Note (
        @PrimaryKey(autoGenerate = true)
        val id: Int,
        val title: String,
        val note: String
    )

}