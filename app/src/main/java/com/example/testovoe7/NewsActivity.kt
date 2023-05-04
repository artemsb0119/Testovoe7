package com.example.testovoe7

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatButton
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.bumptech.glide.Glide
import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.net.URL

class NewsActivity : AppCompatActivity() {

    private lateinit var imageViewFon2: ImageView
    private lateinit var activity: Activity
    private lateinit var adapter: VPAdaper
    private lateinit var news: List<News>
    private lateinit var viewpager: ViewPager2
    private lateinit var buttonNext: AppCompatButton
    private var currentItemIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        buttonNext = findViewById(R.id.buttonNext)
        viewpager = findViewById(R.id.viewpager)
        imageViewFon2 = findViewById(R.id.imageViewFon2)

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

        activity = this
        loadData()
    }

    private fun loadData() {
        GlobalScope.launch(Dispatchers.IO) {
            try {
                val data = URL("http://135.181.248.237/7/news.json").readText()
                val gson = Gson()
                news = gson.fromJson(data, Array<News>::class.java).toList()

                activity.runOnUiThread {
                    adapter = VPAdaper(news)
                    viewpager.adapter = adapter
                    viewpager.clipToPadding = false
                    viewpager.clipChildren = false
                    viewpager.offscreenPageLimit = 2
                    buttonNext.setOnClickListener {
                        currentItemIndex = viewpager.currentItem
                        currentItemIndex++
                        if (currentItemIndex >= news.size) {
                            currentItemIndex = 0
                        }
                        viewpager.setCurrentItem(currentItemIndex, true)
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}