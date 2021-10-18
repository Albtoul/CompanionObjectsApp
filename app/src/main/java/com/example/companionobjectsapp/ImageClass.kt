package com.example.companionobjectsapp

import android.view.View

class ImageClass {
    companion object{
    val morning=false
    val night=true}


    fun selectBackground(slide: View,obj:Boolean){
        when(obj){
            true->{slide.setBackgroundResource(R.drawable.night)}
            false->{slide.setBackgroundResource(R.drawable.morning)}
        }
    }


}