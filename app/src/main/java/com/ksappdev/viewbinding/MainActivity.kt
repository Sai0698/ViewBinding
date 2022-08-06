package com.ksappdev.viewbinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ksappdev.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var viewbinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewbinding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewbinding.root)
        viewbinding.listView.setOnClickListener {

            var lvintent= Intent(this,LvActivity::class.java)
            startActivity(lvintent)
        }
        viewbinding.spinner.setOnClickListener {

            var spnrintent= Intent(this,spnrActivity::class.java)
            startActivity(spnrintent)
        }
        viewbinding.actView.setOnClickListener {

            var actintent= Intent(this,actActivity::class.java)
            startActivity(actintent)
        }
    }
}