package com.binaryveda_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.binaryveda_kotlin.adapters.MainRVAdapter
import com.binaryveda_kotlin.models.Home

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MainRVAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.main_rv)

        val registerBtn : LinearLayout = findViewById(R.id.register_btn)
        registerBtn.setOnClickListener {
            val intent = Intent(this, LandingActivity::class.java)
            startActivity(intent)
        }

        createDataSet()

    }

    private fun createDataSet() {
        val list = ArrayList<Home>()
        list.add(Home(getString(R.string.lorem_ipsum_nis_used), getString(R.string.lorem_ipsum_2), R.drawable.ic_image1))
        list.add(Home(getString(R.string.lorem_ipsum_nis_used), getString(R.string.lorem_ipsum_2), R.drawable.ic_image2))
        list.add(Home(getString(R.string.lorem_ipsum_nis_used), getString(R.string.lorem_ipsum_2), R.drawable.ic_image3))
        list.add(Home(getString(R.string.lorem_ipsum_nis_used), getString(R.string.lorem_ipsum_2), R.drawable.ic_image4))
        list.add(Home(getString(R.string.lorem_ipsum_nis_used), getString(R.string.lorem_ipsum_2), R.drawable.ic_image5))
        list.add(Home(getString(R.string.lorem_ipsum_nis_used), getString(R.string.lorem_ipsum_2), R.drawable.ic_image6))
        list.add(Home(getString(R.string.lorem_ipsum_nis_used), getString(R.string.lorem_ipsum_2), R.drawable.ic_image7))
        list.add(Home(getString(R.string.lorem_ipsum_nis_used), getString(R.string.lorem_ipsum_2), R.drawable.ic_image8))

        adapter = MainRVAdapter(list)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter
    }
}