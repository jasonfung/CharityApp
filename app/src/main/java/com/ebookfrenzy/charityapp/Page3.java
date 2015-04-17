package com.ebookfrenzy.charityapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by student on 4/16/15.
 */
public class Page3 extends ActionBarActivity {

    String cImage;

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page3);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            cImage = extras.getString("cImage");
        }

        ImageView image = (ImageView) findViewById(R.id.imageView2);
        int resId = getResources().getIdentifier(cImage, "drawable", getPackageName());
        image.setImageResource(resId);

        final Intent myIntent = new Intent(this, Page4.class);
        myIntent.putExtra("cImage", cImage);

        Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                myIntent.putExtra("amount", "5");
                startActivity(myIntent);
            }
        });

        Button b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                myIntent.putExtra("amount", "10");
                startActivity(myIntent);
            }
        });

        Button b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                myIntent.putExtra("amount", "15");
                startActivity(myIntent);
            }
        });

        Button b5 = (Button) findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                myIntent.putExtra("amount", "25");
                startActivity(myIntent);
            }
        });

        Button b6 = (Button) findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                myIntent.putExtra("amount", "50");
                startActivity(myIntent);
            }
        });

        Button b7 = (Button) findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final Intent mt = new Intent(Page3.this, EnterAmount.class);
                mt.putExtra("cImage", cImage);
                startActivity(mt);
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
                Intent intent1 = new Intent(Page3.this, MainHelp.class);
                startActivity(intent1);
                return true;
            case R.id.menuTwo:
                Intent intent2 = new Intent(Page3.this, MainAbout.class);
                startActivity(intent2);
                return true;
            case R.id.menuThree:
                Intent intent4 = new Intent(Page3.this, Donation.class);
                startActivity(intent4);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }
}
