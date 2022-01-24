package com.example.calldibswebsitetoandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView bisnuWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bisnuWeb = (WebView) findViewById(R.id.bisnuWeb);
        bisnuWeb.loadUrl("https://calldibs.ca/");

        //if you have javaScript in your website then you have to to enable this / For enable JavaScript
        WebSettings webSetting = bisnuWeb.getSettings();
        webSetting.setJavaScriptEnabled(true);

        //When you click any link in your website this link will open inside your app not other browser
        bisnuWeb.setWebViewClient(new WebViewClient());

    }
    //This method for when anyone press back button then it will be back website not exit android app.
    @Override
    public void onBackPressed() {
        if(bisnuWeb.canGoBack()){
            bisnuWeb.goBack();
        }else{
            super.onBackPressed();
        }
    }
}