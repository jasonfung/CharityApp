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
 * Created by student on 4/17/15.
 */
public class Page5 extends ActionBarActivity {
    String cImage;

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page5);

        Bundle extras = getIntent().getExtras();
        cImage = extras.getString("cImage");
        ImageView image = (ImageView) findViewById(R.id.imageView4);
        int resId = getResources().getIdentifier(cImage, "drawable", getPackageName());
        image.setImageResource(resId);

        final Intent myIntent = new Intent(this, MainActivity.class);
        Button b = (Button) findViewById(R.id.button9);
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
                Intent intent1 = new Intent(Page5.this, MainHelp.class);
                startActivity(intent1);
                return true;
            case R.id.menuTwo:
                Intent intent2 = new Intent(Page5.this, MainAbout.class);
                startActivity(intent2);
                return true;
            case R.id.menuThree:
                Intent intent4 = new Intent(Page5.this, Donation.class);
                startActivity(intent4);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }

}
