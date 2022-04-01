package com.yshush.mysololife.utils

import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

// Firebase reference를 넣어주는 부분
class FBRef {

    companion object {

        private val database = Firebase.database

        val bookmarkRef = database.getReference("bookmark_list")
    }

}