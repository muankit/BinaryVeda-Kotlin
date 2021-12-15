package com.binaryveda_kotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.binaryveda_kotlin.adapters.UploadRVAdapter
import com.binaryveda_kotlin.models.Home
import com.binaryveda_kotlin.models.Upload


class UploadFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root: View = inflater.inflate(R.layout.fragment_upload, container, false)

        recyclerView = root.findViewById(R.id.upload_rv)

        createDataSet()

        return root
    }

    private fun createDataSet() {
        val list = ArrayList<Upload>()
        list.add(Upload(R.drawable.image_upload))
        list.add(Upload(R.drawable.image_upload))
        list.add(Upload(R.drawable.image_upload))
        list.add(Upload(R.drawable.image_upload))
        list.add(Upload(R.drawable.image_upload))
        list.add(Upload(R.drawable.image_upload))
        list.add(Upload(R.drawable.image_upload))
        list.add(Upload(R.drawable.image_upload))

        val adapter = UploadRVAdapter(list)
        recyclerView.layoutManager = GridLayoutManager(context, 2)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter
    }
}