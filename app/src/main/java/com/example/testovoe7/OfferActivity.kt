package com.example.testovoe7

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.EditText
import android.widget.ImageView
import com.bumptech.glide.Glide

class OfferActivity : AppCompatActivity() {

    private lateinit var imageViewFon2: ImageView
    private lateinit var imageViewSend: ImageView
    private lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_offer)

        imageViewSend = findViewById(R.id.imageViewSend)
        imageViewFon2 = findViewById(R.id.imageViewFon2)
        editText = findViewById(R.id.editText)

        val sharedPreferences = getSharedPreferences("my_preferences", Context.MODE_PRIVATE)
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

        imageViewSend.setOnClickListener {
            editText.setText("")
        }
    }
}