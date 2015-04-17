package com.ebookfrenzy.charityapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by student on 4/17/15.
 */
public class EnterAmount extends ActionBarActivity {

    String cImage;
    String amount;

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enteramount);

        Bundle extras = getIntent().getExtras();
        cImage = extras.getString("cImage");

    //    Toast.makeText(getApplicationContext(), amount, Toast.LENGTH_LONG).show();

        final Intent myIntent = new Intent(this, Page4.class);
        myIntent.putExtra("cImage", cImage);


        Button b = (Button) findViewById(R.id.button10);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText inputTxt = (EditText) findViewById(R.id.editText);
                amount = inputTxt.getText().toString();
                myIntent.putExtra("amount", amount);
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
                Intent intent1 = new Intent(EnterAmount.this, MainHelp.class);
                startActivity(intent1);
                return true;
            case R.id.menuTwo:
                Intent intent2 = new Intent(EnterAmount.this, MainAbout.class);
                startActivity(intent2);
                return true;
            case R.id.menuThree:
                Intent intent4 = new Intent(EnterAmount.this, Donation.class);
                startActivity(intent4);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }

}
