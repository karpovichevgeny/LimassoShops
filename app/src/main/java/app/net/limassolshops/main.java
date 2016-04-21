package app.net.limassolshops;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class main extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToCarefour(View view){
        goToUrl("http://www.carrefour.com.cy/index.php?id=9");
    }
    public void goToAlphamega (View view){
        goToUrl("https://www.alphamega.com.cy/el/content/grocery-offers-11416-20416");
    }
    public void goToPapantoniou (View view)
    {
        goToUrl("http://www.papantoniou.com.cy/Portals/0/Documents/Offers.pdf");
    }
    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

}

