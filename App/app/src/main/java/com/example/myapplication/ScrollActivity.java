package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ScrollActivity extends AppCompatActivity {
    private WebView MyWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);
        MyWebView = findViewById(R.id.webview_example);
        WebSettings myWebSettings = MyWebView.getSettings();
        myWebSettings.setJavaScriptEnabled(true);
        MyWebView.setWebViewClient(new MyBrowser());
        MyWebView.loadUrl("http://www.cnn.com");
    }

    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            view.loadUrl(url);
            return true;
        }

    }
}
