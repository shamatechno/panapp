package pan.card.pan.card.pan;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class applynow extends AppCompatActivity {
Button indian,foreign;  AdView mAdview;
    InterstitialAd interstitialAd,interstitialAd2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_applynow);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        indian=(Button)findViewById(R.id.ind);
        foreign=(Button)findViewById(R.id.foreign);
        MobileAds.initialize(this,"ca-app-pub-9326266365527831~6272689149");

        mAdview=(AdView)findViewById(R.id.adView);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);
        indian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (interstitialAd.isLoaded()) {
                    interstitialAd.show();
                } else {
                    Intent f = new Intent(applynow.this, indian.class);
                    startActivity(f);
                }
            }
        });

        foreign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (interstitialAd2.isLoaded()) {
                    interstitialAd2.show();
                } else {
                    Intent f = new Intent(applynow.this, foreign.class);
                    startActivity(f);
                }
            }
        });

        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId("ca-app-pub-9326266365527831/1375585686");
        interstitialAd.loadAd(new AdRequest.Builder().build());
        interstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                Intent home=new Intent(applynow.this,indian.class);
                startActivity(home);
                interstitialAd.loadAd(new AdRequest.Builder().build());
            }

        });


        interstitialAd2 = new InterstitialAd(this);
        interstitialAd2.setAdUnitId("ca-app-pub-9326266365527831/6459982284");
        interstitialAd2.loadAd(new AdRequest.Builder().build());
        interstitialAd2.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                Intent home=new Intent(applynow.this,foreign.class);
                startActivity(home);
                interstitialAd2.loadAd(new AdRequest.Builder().build());
            }

        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == android.R.id.home) {
            Intent intent = new Intent(applynow.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
