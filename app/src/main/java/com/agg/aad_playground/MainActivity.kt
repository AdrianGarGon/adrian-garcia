package com.agg.aad_playground

import Ut_01.FIlePlayGround
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val colors: MutableList<String> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initColors()
        val filePlayGround = FIlePlayGround(this)
        /**
         * con esto lo llammos directamente
         */
        filePlayGround.saveToFile(colors)
        val lst = filePlayGround.readFromFile()
        lst.forEach {
            Log.d("@dev","$it")
        }



    }

    /**
     * las funciones van fuera del override
     */
    private fun initColors() {
        colors.add("blue")
        colors.add("red")
        colors.add("orange")
        colors.add("green")
    }

}