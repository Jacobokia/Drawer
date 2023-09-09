package com.cobs.drawer.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.cobs.drawer.R
import com.cobs.drawer.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<WebView>(R.id.text_home).apply {
            loadUrl("https://www.google.com/")
            settings.allowContentAccess = true
            settings.safeBrowsingEnabled = true
            settings.javaScriptEnabled = true
            settings.useWideViewPort = true
        }

    }

}