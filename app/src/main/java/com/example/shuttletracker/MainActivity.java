package com.example.shuttletracker;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView = (WebView) findViewById(R.id.webview);

        // Enable Javascript
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);

        webSettings.setSupportZoom(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(true);
        webSettings.setLoadWithOverviewMode(true);
//        mWebView.setInitialScale(800);
        webSettings.setUseWideViewPort(true);


        mWebView.setWebViewClient(new WebViewClient()
        {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url)
            {
                view.loadUrl(url);
//                System.out.println("hello");
                return true;
            }
        });

        mWebView.loadUrl("https://esfm.dialog.lk/pro/applications/locator/?key=8b64f84b0b87681b0ac92a81a565670b&objects=473755&map=roadmap&tail_size=1800");
//        mWebView.loadUrl("https://www.whatismybrowser.com/detect/is-javascript-enabled");
//        mWebView.loadUrl("https://www.google.com");

//        mWebView.zoomBy(10);
    }


}
