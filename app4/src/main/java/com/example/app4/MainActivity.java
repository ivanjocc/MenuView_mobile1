package com.example.app4;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView w;
    private WebViewClient webc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        w = findViewById(R.id.webView);
        w.getSettings().setJavaScriptEnabled(true);
        webc = new WebViewClient();
        w.setWebViewClient(webc);
        w.loadUrl("https://www.google.com");
    }
}
