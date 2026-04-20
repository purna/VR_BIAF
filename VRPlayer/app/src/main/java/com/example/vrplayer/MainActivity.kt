package com.example.vrplayer

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.webView)

        // Enable WebView features for VR/WebXR support
        webView.settings.apply {
            javaScriptEnabled = true
            domStorageEnabled = true
            databaseEnabled = true
            setSupportMultipleWindows(true)
            javaScriptCanOpenWindowsAutomatically = true
            loadWithOverviewMode = true
            useWideViewPort = true
            mediaPlaybackRequiresUserGesture = false
            // Important for WebXR/VR support
            // Mixed content needed if any HTTP resources are used
            mixedContentMode = android.webkit.WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        }

        // Set WebViewClient to stay inside the WebView
        webView.webViewClient = WebViewClient()

        // Set WebChromeClient for console messages and WebXR support
        webView.webChromeClient = WebChromeClient()

        // Load the VR web app
        webView.loadUrl("https://purna.github.io/VR_BIAF/")
    }

    override fun onBackPressed() {
        // Allow back button to navigate WebView history
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}
