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



//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
////        val homeViewModel =
////            ViewModelProvider(this).get(HomeViewModel::class.java)
////
////        _binding = FragmentHomeBinding.inflate(inflater, container, false)
////        val root: View = binding.root
////
////        val textView: TextView = binding.textHome
////        homeViewModel.text.observe(viewLifecycleOwner) {
////            textView.text = it
//        return inflater.inflate(R.layout.fragment_home, container, false)
//        }
//
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        view.findViewById<WebView>(R.id.text_home).apply {
//            loadUrl("https://www.monitor.co.ug/")
//            settings.allowContentAccess = true
//            settings.safeBrowsingEnabled = true
//            settings.javaScriptEnabled = true
//            settings.useWideViewPort = true
//        }
//    }
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//
//    }

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