package com.example.testovoe7

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class FavouriteActivity : AppCompatActivity() {

    private lateinit var check1: CheckBox
    private lateinit var check2: CheckBox
    private lateinit var check3: CheckBox
    private lateinit var check4: CheckBox
    private lateinit var check5: CheckBox
    private lateinit var check6: CheckBox
    private lateinit var check7: CheckBox
    private lateinit var check8: CheckBox
    private lateinit var check9: CheckBox
    private lateinit var check10: CheckBox

    private lateinit var imageViewFon2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favourite)

        check1 = findViewById(R.id.check1)
        check2 = findViewById(R.id.check2)
        check3 = findViewById(R.id.check3)
        check4 = findViewById(R.id.check4)
        check5 = findViewById(R.id.check5)
        check6 = findViewById(R.id.check6)
        check7 = findViewById(R.id.check7)
        check8 = findViewById(R.id.check8)
        check9 = findViewById(R.id.check9)
        check10 = findViewById(R.id.check10)
        imageViewFon2 = findViewById(R.id.imageViewFon2)

        val sharedPreferences = getSharedPreferences("my_preferences", Context.MODE_PRIVATE)
        var icheck1 = sharedPreferences.getBoolean("check1", false)
        var icheck2 = sharedPreferences.getBoolean("check2", false)
        var icheck3 = sharedPreferences.getBoolean("check3", false)
        var icheck4 = sharedPreferences.getBoolean("check4", false)
        var icheck5 = sharedPreferences.getBoolean("check5", false)
        var icheck6 = sharedPreferences.getBoolean("check6", false)
        var icheck7 = sharedPreferences.getBoolean("check7", false)
        var icheck8 = sharedPreferences.getBoolean("check8", false)
        var icheck9 = sharedPreferences.getBoolean("check9", false)
        var icheck10 = sharedPreferences.getBoolean("check10", false)

        if (icheck1){
            check1.isChecked = true
        }
        if (icheck2){
            check2.isChecked = true
        }
        if (icheck3){
            check3.isChecked = true
        }
        if (icheck4){
            check4.isChecked = true
        }
        if (icheck5){
            check5.isChecked = true
        }
        if (icheck6){
            check6.isChecked = true
        }
        if (icheck7){
            check7.isChecked = true
        }
        if (icheck8){
            check8.isChecked = true
        }
        if (icheck9){
            check9.isChecked = true
        }
        if (icheck10){
            check10.isChecked = true
        }

        var currentNumber = sharedPreferences.getInt("currentNumber", 1)
        if(currentNumber==1) {
            Glide.with(this)
                .load("http://135.181.248.237/7/fon2.png")
                .into(imageViewFon2)
        } else if (currentNumber==2){
            Glide.with(this)
                .load("http://135.181.248.237/7/fon3.png")
                .into(imageViewFon2)
        } else if (currentNumber==3){
            Glide.with(this)
                .load("http://135.181.248.237/7/fon4.png")
                .into(imageViewFon2)
        }

        check1.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                val editor = getSharedPreferences("my_preferences", Context.MODE_PRIVATE).edit()
                editor.putBoolean("check1", true)
                editor.apply()
            } else {
                val editor = getSharedPreferences("my_preferences", Context.MODE_PRIVATE).edit()
                editor.putBoolean("check1", false)
                editor.apply()
            }
        }
        check2.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                val editor = getSharedPreferences("my_preferences", Context.MODE_PRIVATE).edit()
                editor.putBoolean("check2", true)
                editor.apply()
            } else {
                val editor = getSharedPreferences("my_preferences", Context.MODE_PRIVATE).edit()
                editor.putBoolean("check2", false)
                editor.apply()
            }
        }

        check3.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                val editor = getSharedPreferences("my_preferences", Context.MODE_PRIVATE).edit()
                editor.putBoolean("check3", true)
                editor.apply()
            } else {
                val editor = getSharedPreferences("my_preferences", Context.MODE_PRIVATE).edit()
                editor.putBoolean("check3", false)
                editor.apply()
            }
        }

        check4.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                val editor = getSharedPreferences("my_preferences", Context.MODE_PRIVATE).edit()
                editor.putBoolean("check4", true)
                editor.apply()
            } else {
                val editor = getSharedPreferences("my_preferences", Context.MODE_PRIVATE).edit()
                editor.putBoolean("check4", false)
                editor.apply()
            }
        }

        check5.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                val editor = getSharedPreferences("my_preferences", Context.MODE_PRIVATE).edit()
                editor.putBoolean("check5", true)
                editor.apply()
            } else {
                val editor = getSharedPreferences("my_preferences", Context.MODE_PRIVATE).edit()
                editor.putBoolean("check5", false)
                editor.apply()
            }
        }

        check6.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                val editor = getSharedPreferences("my_preferences", Context.MODE_PRIVATE).edit()
                editor.putBoolean("check6", true)
                editor.apply()
            } else {
                val editor = getSharedPreferences("my_preferences", Context.MODE_PRIVATE).edit()
                editor.putBoolean("check6", false)
                editor.apply()
            }
        }

        check7.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                val editor = getSharedPreferences("my_preferences", Context.MODE_PRIVATE).edit()
                editor.putBoolean("check7", true)
                editor.apply()
            } else {
                val editor = getSharedPreferences("my_preferences", Context.MODE_PRIVATE).edit()
                editor.putBoolean("check7", false)
                editor.apply()
            }
        }

        check8.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                val editor = getSharedPreferences("my_preferences", Context.MODE_PRIVATE).edit()
                editor.putBoolean("check8", true)
                editor.apply()
            } else {
                val editor = getSharedPreferences("my_preferences", Context.MODE_PRIVATE).edit()
                editor.putBoolean("check8", false)
                editor.apply()
            }
        }

        check9.setOnCheckedChangeListener { buttonView, isChecked ->
            // Ваш код здесь
            if (isChecked) {
                val editor = getSharedPreferences("my_preferences", Context.MODE_PRIVATE).edit()
                editor.putBoolean("check9", true)
                editor.apply()
            } else {
                val editor = getSharedPreferences("my_preferences", Context.MODE_PRIVATE).edit()
                editor.putBoolean("check9", false)
                editor.apply()
            }
        }

        check10.setOnCheckedChangeListener { buttonView, isChecked ->
            // Ваш код здесь
            if (isChecked) {
                val editor = getSharedPreferences("my_preferences", Context.MODE_PRIVATE).edit()
                editor.putBoolean("check10", true)
                editor.apply()
            } else {
                val editor = getSharedPreferences("my_preferences", Context.MODE_PRIVATE).edit()
                editor.putBoolean("check10", false)
                editor.apply()
            }
        }
    }
}