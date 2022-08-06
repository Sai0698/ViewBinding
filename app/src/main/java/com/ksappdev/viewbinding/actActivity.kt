package com.ksappdev.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.viewbinding.ViewBinding
import com.ksappdev.viewbinding.databinding.ActivityActBinding

class actActivity : AppCompatActivity() {
    lateinit var actBinding: ActivityActBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        actBinding=ActivityActBinding.inflate(layoutInflater)
        setContentView(actBinding.root)

        var arrSearch =arrayListOf<String>("Select the names here,").apply {
            add("Vamsi")
            add("SaiRam")
            add("Raghu")
            add("Kumar")
            add("Boya")
            add("SaiPrasad")
            add("Kiran")
            add("Tarun")
            add("Rahul")
            add("sasidhar")
            add("Mahes")
            add("Lohith")
            add("SaiNaveen")
            add("Srikar")
            add("Reddy")
            add("Ganesh") }

        actBinding.apply {

            autocVIew.setAdapter(ArrayAdapter(applicationContext,android.R.layout.simple_list_item_1,arrSearch))
            autocVIew.threshold=0
        }

    }

}