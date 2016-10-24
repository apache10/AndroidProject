package com.example.gaurav.webview;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import static android.content.ContentValues.TAG;

public class MainActivity extends Activity {
    Button button;
    EditText edText;
    private WebView webV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.button);
        edText=(EditText)findViewById(R.id.editText);
        webV =(WebView)findViewById(R.id.webView);
        webV.setWebViewClient(new MyBrowser());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = edText.getText().toString();

                webV.getSettings().setLoadsImagesAutomatically(true);
                webV.getSettings().setJavaScriptEnabled(true);
                webV.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                webV.loadUrl("https://"+url);
            }
        });
    }

    private class MyBrowser extends WebViewClient {
        @SuppressWarnings("deprecation")
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            final Uri uri = Uri.parse(url);
            return true;
        }

        @TargetApi(Build.VERSION_CODES.N)
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            final Uri uri = request.getUrl();
            return true;
        }


    }
}
