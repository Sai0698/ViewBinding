package com.ksappdev.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.ksappdev.viewbinding.databinding.ActivityLvBinding

class LvActivity : AppCompatActivity() {
    lateinit var lvBinding: ActivityLvBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lvBinding= ActivityLvBinding.inflate(layoutInflater)
        setContentView(lvBinding.root)

        val arr= arrayListOf<String>().apply {
            add("sai")
            add("ram")
            add("vamsi")
            add("rahul")
            add("saiteja")
            add("tharun")
            add("nikhil")
            add("vishnu")
            add("boya")
            add("sai")
            add("ram")
            add("vamsi")
            add("rahul")
            add("saiteja")
            add("tharun")
            add("nikhil")
            add("vishnu")
            add("boya")
            add("sai")
            add("ram")
            add("vamsi")
            add("rahul")
            add("saiteja")
            add("tharun")
            add("nikhil")
            add("vishnu")
            add("boya")
        }

        lvBinding.apply {

            lvView.adapter= ArrayAdapter(applicationContext,android.R.layout.simple_list_item_1,arr)
            lvBinding.lvView.setOnItemClickListener { adapterView, view, i, l ->
                when(i) {
                    i-> Toast.makeText(applicationContext, "$i item clicked ${arr[i]}", Toast.LENGTH_SHORT).show()
                }
        }
        }


    }
}