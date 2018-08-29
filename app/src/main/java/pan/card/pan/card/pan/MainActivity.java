package pan.card.pan.card.pan;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity {
Button applynow,modify,track,search,faq,proofs;
Intent irate;
ImageView i1,i2,i3,i4,i5,i6;
    InterstitialAd interstitialAd,interstitialAd2,interstitialAd3,interstitialAd4,interstitialAd5,interstitialAd6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    applynow=(Button)findViewById(R.id.applynow);
        modify=(Button)findViewById(R.id.modify);
        track=(Button)findViewById(R.id.trackpan);
        search=(Button)findViewById(R.id.searchpan);
        faq=(Button)findViewById(R.id.faq);
        proofs=(Button)findViewById(R.id.requiredproofs);

        i1=(ImageView)findViewById(R.id.imageView);
        i2=(ImageView)findViewById(R.id.imageView2);
        i3=(ImageView)findViewById(R.id.imageView3);
        i4=(ImageView)findViewById(R.id.imageView4);
        i5=(ImageView)findViewById(R.id.imageView5);
        i6=(ImageView)findViewById(R.id.imageView6);


        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home=new Intent(MainActivity.this,applynow.class);
                startActivity(home);
            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home=new Intent(MainActivity.this,modify.class);
                startActivity(home);
            }
        });

        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home=new Intent(MainActivity.this,proofs.class);
                startActivity(home);
            }
        });

        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent apply = new Intent(MainActivity.this, track.class);
                startActivity(apply);
            }
        });

        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent apply = new Intent(MainActivity.this, search.class);
                startActivity(apply);
            }
        });

        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent apply = new Intent(MainActivity.this, faq.class);
                startActivity(apply);
            }
        });


        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId("ca-app-pub-9326266365527831/9086145620");
        interstitialAd.loadAd(new AdRequest.Builder().build());
        interstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                Intent home=new Intent(MainActivity.this,applynow.class);
                startActivity(home);
                interstitialAd.loadAd(new AdRequest.Builder().build());
            }

        });


        interstitialAd2 = new InterstitialAd(this);
        interstitialAd2.setAdUnitId("ca-app-pub-9326266365527831/1950300757");
        interstitialAd2.loadAd(new AdRequest.Builder().build());
        interstitialAd2.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                Intent home=new Intent(MainActivity.this,modify.class);
                startActivity(home);
                interstitialAd2.loadAd(new AdRequest.Builder().build());
            }

        });

        interstitialAd3 = new InterstitialAd(this);
        interstitialAd3.setAdUnitId("ca-app-pub-9326266365527831/9445647390");
        interstitialAd3.loadAd(new AdRequest.Builder().build());
        interstitialAd3.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                Intent home=new Intent(MainActivity.this,proofs.class);
                startActivity(home);
                interstitialAd3.loadAd(new AdRequest.Builder().build());
            }

        });

        interstitialAd4 = new InterstitialAd(this);
        interstitialAd4.setAdUnitId("ca-app-pub-9326266365527831/8132565720");
        interstitialAd4.loadAd(new AdRequest.Builder().build());
        interstitialAd4.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                Intent home=new Intent(MainActivity.this,search.class);
                startActivity(home);
                interstitialAd4.loadAd(new AdRequest.Builder().build());
            }

        });

        interstitialAd5 = new InterstitialAd(this);
        interstitialAd5.setAdUnitId("ca-app-pub-9326266365527831/9026435871");
        interstitialAd5.loadAd(new AdRequest.Builder().build());
        interstitialAd5.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                Intent home=new Intent(MainActivity.this,track.class);
                startActivity(home);
                interstitialAd5.loadAd(new AdRequest.Builder().build());
            }

        });

        interstitialAd6 = new InterstitialAd(this);
        interstitialAd6.setAdUnitId("ca-app-pub-9326266365527831/6400272530");
        interstitialAd6.loadAd(new AdRequest.Builder().build());
        interstitialAd6.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                Intent home=new Intent(MainActivity.this,faq.class);
                startActivity(home);
                interstitialAd6.loadAd(new AdRequest.Builder().build());
            }

        });

        applynow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (interstitialAd.isLoaded()) {
                    interstitialAd.show();
                } else {
                    Intent apply = new Intent(MainActivity.this, applynow.class);
                    startActivity(apply);
                }
            }
        });

        modify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (interstitialAd2.isLoaded()) {
                    interstitialAd2.show();
                } else {
                    Intent apply = new Intent(MainActivity.this, modify.class);
                    startActivity(apply);
                }
            }
        });

        track.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (interstitialAd5.isLoaded()) {
                    interstitialAd5.show();
                } else {
                    Intent apply = new Intent(MainActivity.this, track.class);
                    startActivity(apply);
                }
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (interstitialAd4.isLoaded()) {
                    interstitialAd4.show();
                } else {
                    Intent apply = new Intent(MainActivity.this, search.class);
                    startActivity(apply);
                }
            }
        });
        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (interstitialAd6.isLoaded()) {
                    interstitialAd6.show();
                } else {
                    Intent apply = new Intent(MainActivity.this, faq.class);
                    startActivity(apply);
                }
            }
        });

        proofs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (interstitialAd3.isLoaded()) {
                    interstitialAd3.show();
                } else {
                    Intent apply = new Intent(MainActivity.this, proofs.class);
                    startActivity(apply);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == R.id.aboutus){
Intent abt=new Intent(MainActivity.this,Aboutus.class);
startActivity(abt);
        }
        if(item.getItemId() == R.id.rate){
            irate = new Intent(Intent.ACTION_VIEW);
            irate.setData(Uri.parse("https://play.google.com/store/apps/details?id=pancard.india.pancard.pancard.pancard"));
            startActivity(irate);

        }
        if(item.getItemId() == R.id.contact){
            Intent abt=new Intent(MainActivity.this,contactus.class);
            startActivity(abt);
        }

        return super.onOptionsItemSelected(item);
    }
}
