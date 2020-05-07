package com.example.googleauthenticationfirebasekotlin

import android.content.Context
import android.widget.Toast

fun Context.showToast(message: String, time:Int= Toast.LENGTH_SHORT){

    Toast.makeText(applicationContext,message,time).show()

}