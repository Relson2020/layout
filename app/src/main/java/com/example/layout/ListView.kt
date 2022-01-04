package com.example.layout

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.core.view.get
import androidx.databinding.DataBindingUtil
import com.example.layout.databinding.ActivityListViewBinding

class ListView : AppCompatActivity() , AdapterView.OnItemSelectedListener{

    private lateinit var binding : ActivityListViewBinding
    private lateinit var spinner : Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_list_view)

        val listView = binding.listView

        val arrayList : ArrayList<String> = arrayListOf()
        arrayList.add("hey")
        arrayList.add("hello")
        arrayList.add("hlo")
        arrayList.add("hii")
        arrayList.add("hey")
        arrayList.add("hey")
        arrayList.add("hey")
        arrayList.add("hey")
        arrayList.add("hey")
        arrayList.add("hey")
        arrayList.add("hey")
        arrayList.add("hey")
        arrayList.add("hey")
        arrayList.add("hey")
        arrayList.add("hey")
        arrayList.add("hey")
        arrayList.add("hey")
        arrayList.add("hey")
        arrayList.add("hey")
        arrayList.add("hey")
        arrayList.add("hey")
        arrayList.add("hey")
        arrayList.add("hey")

        listView.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList)

        spinner = binding.spinner
        val adapter = ArrayAdapter.createFromResource(this,R.array.spinner,android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = this

        val gridView = binding.gridView
        val adapter2 = ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList)
        gridView.adapter = adapter2
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        Toast.makeText(this, parent?.getItemAtPosition(position).toString(),Toast.LENGTH_SHORT).show()
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }
}
