package com.example.matheusfialho.testewebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import br.ufrn.mobile.japi.JApiWebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        WebView myWebView = (WebView) findViewById(R.id.webView);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("https://www.google.com.br/");
        */

        JApiWebView japiWebView = (JApiWebView) findViewById(R.id.japiwebview);
        WebSettings ws = japiWebView.getSettings();
        ws.setJavaScriptEnabled(true);
        japiWebView.loadJapiWebView("https://api.info.ufrn.br/authz-server/oauth/authorize?client_id=AppId&response_type=code&redirect_uri=http://enderecoapp.com.br/pagina",
                "sinfo-android-id", "segredo", this, MainActivity.class);
    }
}
