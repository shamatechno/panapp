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

public class foreign extends AppCompatActivity {
    Button reissue2,reprint2,change2,newpan2;AdView mAdview;
    InterstitialAd interstitialAd,interstitialAd2,interstitialAd3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foreign);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Button newpan2 =(Button)findViewById(R.id.newpan2);
        Button reissue2=(Button)findViewById(R.id.reissue2);
        Button reprint2=(Button)findViewById(R.id.reprint2);
        Button change2=(Button)findViewById(R.id.change2);
        MobileAds.initialize(this,"ca-app-pub-9326266365527831~6272689149");

        mAdview=(AdView)findViewById(R.id.adView3);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);

        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId("ca-app-pub-9326266365527831/4847641428");
        interstitialAd.loadAd(new AdRequest.Builder().build());
        interstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                Intent home=new Intent(foreign.this,newpan2.class);
                startActivity(home);
                interstitialAd.loadAd(new AdRequest.Builder().build());
            }

        });


        interstitialAd2 = new InterstitialAd(this);
        interstitialAd2.setAdUnitId("ca-app-pub-9326266365527831/7282233073");
        interstitialAd2.loadAd(new AdRequest.Builder().build());
        interstitialAd2.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                Intent home=new Intent(foreign.this,change2.class);
                startActivity(home);
                interstitialAd2.loadAd(new AdRequest.Builder().build());
            }

        });
        interstitialAd3 = new InterstitialAd(this);
        interstitialAd3.setAdUnitId("ca-app-pub-9326266365527831/1690871332");
        interstitialAd3.loadAd(new AdRequest.Builder().build());
        interstitialAd3.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                Intent home=new Intent(foreign.this,reissue2.class);
                startActivity(home);
                interstitialAd3.loadAd(new AdRequest.Builder().build());
            }

        });
        newpan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home=new Intent(foreign.this,newpan2.class);
                startActivity(home);
            }
        });

        reissue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home=new Intent(foreign.this,reissue2.class);
                startActivity(home);
            }
        });
        reprint2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home=new Intent(foreign.this,reprint2.class);
                startActivity(home);
            }
        });
        change2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home=new Intent(foreign.this,change2.class);
                startActivity(home);
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == android.R.id.home) {
            Intent intent = new Intent(foreign.this, applynow.class);
            startActivity(intent);
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
