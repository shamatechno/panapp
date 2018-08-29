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

public class indian extends AppCompatActivity {
    Button reissue,reprint,change,newpan;AdView mAdview;
    InterstitialAd interstitialAd,interstitialAd2,interstitialAd3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Button  newpan  =(Button)findViewById(R.id.newpan);
        Button reissue=(Button)findViewById(R.id.reissue);
        Button reprint=(Button)findViewById(R.id.reprint);
        Button change=(Button)findViewById(R.id.change);
        MobileAds.initialize(this,"ca-app-pub-9326266365527831~6272689149");

        mAdview=(AdView)findViewById(R.id.adView2);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);

        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId("ca-app-pub-9326266365527831/8679360638");
        interstitialAd.loadAd(new AdRequest.Builder().build());
        interstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                Intent home=new Intent(indian.this,newpan.class);
                startActivity(home);
                interstitialAd.loadAd(new AdRequest.Builder().build());
            }

        });


        interstitialAd2 = new InterstitialAd(this);
        interstitialAd2.setAdUnitId("ca-app-pub-9326266365527831/3427033959");
        interstitialAd2.loadAd(new AdRequest.Builder().build());
        interstitialAd2.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                Intent home=new Intent(indian.this,change.class);
                startActivity(home);
                interstitialAd2.loadAd(new AdRequest.Builder().build());
            }

        });
        interstitialAd3 = new InterstitialAd(this);
        interstitialAd3.setAdUnitId("ca-app-pub-9326266365527831/2528476138");
        interstitialAd3.loadAd(new AdRequest.Builder().build());
        interstitialAd3.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                Intent home=new Intent(indian.this,reissue.class);
                startActivity(home);
                interstitialAd3.loadAd(new AdRequest.Builder().build());
            }

        });
        newpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (interstitialAd.isLoaded()) {
                    interstitialAd.show();
                } else {
                    Intent home = new Intent(indian.this, newpan.class);
                    startActivity(home);
                }
            }
        });

        reissue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (interstitialAd3.isLoaded()) {
                    interstitialAd3.show();
                } else {
                    Intent home = new Intent(indian.this, reissue.class);
                    startActivity(home);
                }
            }
        });
        reprint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home=new Intent(indian.this,reprint.class);
                startActivity(home);
            }
        });
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (interstitialAd2.isLoaded()) {
                    interstitialAd2.show();
                } else {
                    Intent home = new Intent(indian.this, change.class);
                    startActivity(home);
                }
            }
        });


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == android.R.id.home) {
            Intent intent = new Intent(indian.this, applynow.class);
            startActivity(intent);
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
