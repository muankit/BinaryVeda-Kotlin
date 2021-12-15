package com.binaryveda_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.content.res.AppCompatResources
import com.binaryveda_kotlin.adapters.ViewPagerAdapter
import com.binaryveda_kotlin.utils.CustomViewPager
import com.google.android.material.tabs.TabLayout

class LandingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)

        val viewPager : CustomViewPager = findViewById(R.id.view_pager)
        val tabLayout : TabLayout = findViewById(R.id.tab_layout)

        val viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        viewPager.adapter = viewPagerAdapter
        tabLayout.setupWithViewPager(viewPager)

        tabLayout.getTabAt(0)?.icon = AppCompatResources.getDrawable(this, R.drawable.ic_upload_black)
        tabLayout.getTabAt(1)?.icon = AppCompatResources.getDrawable(this, R.drawable.ic_exhibitions)
        tabLayout.getTabAt(2)?.icon = AppCompatResources.getDrawable(this, R.drawable.ic_revenue)
    }
}