package com.binaryveda_kotlin.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.binaryveda_kotlin.UploadFragment

class ViewPagerAdapter(fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager) {

    private val list = arrayListOf<Fragment>(UploadFragment(), UploadFragment(), UploadFragment())
    private val titles = arrayListOf("Uploads", "Exhibitions", "Revenue")

    override fun getCount(): Int {
        return  list.size
    }

    override fun getPageTitle(position: Int): CharSequence {
        return titles[position]
    }

    override fun getItem(position: Int): Fragment{
        return list[position]
    }
}