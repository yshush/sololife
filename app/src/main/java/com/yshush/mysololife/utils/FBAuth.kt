package com.yshush.mysololife.utils

import com.google.firebase.auth.FirebaseAuth

// uid를 얻어오는 부분
class FBAuth {

    companion object {

        private lateinit var auth: FirebaseAuth

        fun getUid() : String {

            auth = FirebaseAuth.getInstance()

            return auth.currentUser?.uid.toString()

        }
    }
}