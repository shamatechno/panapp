package pan.card.pan.card.pan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class reissue extends AppCompatActivity {
    WebView myview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reissue);

        myview = (WebView) findViewById(R.id.wreissue);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        WebSettings webSettings = myview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myview.getSettings().setBuiltInZoomControls(true);
        myview.setWebViewClient(new MywebViewClient());
        myview.loadUrl("https://www.pancard-online.org/search-pan-number");
    }

    public static class MywebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == android.R.id.home) {
            Intent intent = new Intent(reissue.this, indian.class);
            startActivity(intent);
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}