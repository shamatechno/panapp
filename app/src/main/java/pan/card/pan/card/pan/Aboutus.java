package pan.card.pan.card.pan;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Aboutus extends AppCompatActivity {
    Intent irate;
    Button rate,share;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);

        share= (Button)findViewById(R.id.share);



        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_SEND);
                i.setType("Text/plain");
                String shareBody="your body here";
                String shareSub="your subject here";
                i.putExtra(Intent.EXTRA_SUBJECT,shareSub);
                i.putExtra(Intent.EXTRA_TEXT,shareBody);
                startActivity(Intent.createChooser(i,"Share Using"));
            }
        });
    }
}
