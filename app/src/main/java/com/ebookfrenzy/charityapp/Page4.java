package com.ebookfrenzy.charityapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by student on 4/17/15.
 */
public class Page4 extends ActionBarActivity {

    String cImage;
    String a;

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page4);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            a = extras.getString("amount");
        }
        TextView txt = (TextView) findViewById(R.id.textView8);
        txt.setText("$" + a);

        cImage = extras.getString("cImage");
        ImageView image = (ImageView) findViewById(R.id.imageView3);
        int resId = getResources().getIdentifier(cImage, "drawable", getPackageName());
        image.setImageResource(resId);


        final Intent myIntent = new Intent(this, Page5.class);
        myIntent.putExtra("cImage", cImage);
        Button b = (Button) findViewById(R.id.button8);
        b.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(myIntent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        switch (item.getItemId()) {

            case R.id.menuOne:
                Intent intent1 = new Intent(Page4.this, MainHelp.class);
                startActivity(intent1);
                return true;
            case R.id.menuTwo:
                Intent intent2 = new Intent(Page4.this, MainAbout.class);
                startActivity(intent2);
                return true;
            case R.id.menuThree:
                Intent intent4 = new Intent(Page4.this, Donation.class);
                startActivity(intent4);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }
}
