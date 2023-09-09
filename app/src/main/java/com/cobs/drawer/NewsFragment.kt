package com.cobs.drawer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient


class NewsFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<WebView>(R.id.news_web_view).apply {
            loadUrl("https://www.monitor.co.ug/")
            settings.allowContentAccess = true
            settings.safeBrowsingEnabled = true
            settings.javaScriptEnabled = true
            settings.useWideViewPort = true
        }

        }

}