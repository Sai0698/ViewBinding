package com.ksappdev.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.ksappdev.viewbinding.databinding.ActivitySpnrBinding

class spnrActivity : AppCompatActivity() {

    lateinit var spnrBinding: ActivitySpnrBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        spnrBinding= ActivitySpnrBinding.inflate(layoutInflater)
        setContentView(spnrBinding.root)

        val arrNames = arrayListOf<String>("Select the names here,").apply {
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


        spnrBinding.apply {

            SpnrVIew.adapter=ArrayAdapter(applicationContext,android.R.layout.simple_spinner_dropdown_item,arrNames)
            SpnrVIew.onItemSelectedListener=object: AdapterView.OnItemSelectedListener {
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    when(p2){
                        p2->Toast.makeText(applicationContext,"${arrNames[p2]} is selected",Toast.LENGTH_SHORT).show()
                    }
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }

            }


            }
        }

    }
