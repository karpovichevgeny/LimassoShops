package app.net.limassolshops;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class secondActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seond);
        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://issuu.com/offerscy/docs");

    }
}

