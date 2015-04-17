package com.ebookfrenzy.charityapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by student on 2/11/15.
 */
public class MainAbout extends ActionBarActivity {
    @Override
    public void onCreate( Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
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
                Intent intent1 = new Intent( MainAbout.this, MainHelp.class);
                startActivity(intent1);
                return true;
            case R.id.menuTwo:
                Intent intent2 = new Intent( MainAbout.this, MainAbout.class);
                startActivity(intent2);
                return true;
            case R.id.menuThree:
                Intent intent4 = new Intent(MainAbout.this, Donation.class);
                startActivity(intent4);
                return true;
            default:
                return super.onOptionsItemSelected(item);


        }

    }

}