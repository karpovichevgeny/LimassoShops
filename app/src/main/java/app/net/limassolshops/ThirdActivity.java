package app.net.limassolshops;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;


public class ThirdActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://issuu.com/offerscy/docs");
        myWebView.reload();
    }


}
