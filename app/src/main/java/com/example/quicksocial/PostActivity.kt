package com.example.quicksocial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.quicksocial.daos.PostDao

class PostActivity : AppCompatActivity() {

    private lateinit var postDao: PostDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)

        postDao = PostDao()

        val postButton = findViewById<Button>(R.id.postButton)
        postButton.setOnClickListener{
            val postText =  findViewById<EditText>(R.id.postText)
            val input = postText.text.toString().trim()
            if(input.isNotEmpty()){
                postDao.addPost(input)
                finish()
            }
        }
    }
}