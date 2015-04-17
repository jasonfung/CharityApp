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
import android.widget.Toast;

/**
 * Created by student on 4/16/15.
 */
public class Page2 extends ActionBarActivity {

    String p;
    String cImage;

    @Override
    public void onCreate( Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            p = extras.getString("charityName");
        }
            Toast.makeText(getApplicationContext(), p, Toast.LENGTH_LONG).show();
            p = p.trim();

            if (p.equals("Canadian Cancer Society")) {
                ImageView img = (ImageView) findViewById(R.id.imageView);
                img.setImageResource(R.drawable.canadiancancersocietyimage);
                TextView txt = (TextView) findViewById(R.id.textView4);
                txt.setText(R.string.ccsMission);
                cImage = "canadiancancersocietyimage";
            }
            else if (p.equals("World Vision Canada")) {
                ImageView img = (ImageView) findViewById(R.id.imageView);
                img.setImageResource(R.drawable.worldvisionimage);
                TextView txt = (TextView) findViewById(R.id.textView4);
                txt.setText(R.string.worldvisionMission);
                cImage = "worldvisionimage";
            }
            else if (p.equals("Canadian Red Cross")) {
                ImageView img = (ImageView) findViewById(R.id.imageView);
                img.setImageResource(R.drawable.redcrossimage);
                TextView txt = (TextView) findViewById(R.id.textView4);
                txt.setText(R.string.redcrossMission);
                cImage = "redcrossimage";
            }
            else if (p.equals("The Hospital for Sick Children Foundation")) {
                ImageView img = (ImageView) findViewById(R.id.imageView);
                img.setImageResource(R.drawable.sickkidsimage);
                TextView txt = (TextView) findViewById(R.id.textView4);
                txt.setText(R.string.sickkidsMission);
                cImage = "sickkidsimage";
            }
            else if (p.equals("United Way of Greater Toronto")) {
                ImageView img = (ImageView) findViewById(R.id.imageView);
                img.setImageResource(R.drawable.unitedwayimage);
                TextView txt = (TextView) findViewById(R.id.textView4);
                txt.setText(R.string.unitedwayMission);
                cImage = "unitedwayimage";
            }
            else if (p.equals("Heart and Stroke Foundation of Canada")) {
                ImageView img = (ImageView) findViewById(R.id.imageView);
                img.setImageResource(R.drawable.heartimage);
                TextView txt = (TextView) findViewById(R.id.textView4);
                txt.setText(R.string.heartMission);
                cImage = "heartimage";
            }
            else if (p.equals("Princess Margaret Cancer Foundation")) {
                ImageView img = (ImageView) findViewById(R.id.imageView);
                img.setImageResource(R.drawable.princessmargaretimage);
                TextView txt = (TextView) findViewById(R.id.textView4);
                txt.setText(R.string.margaretMission);
                cImage = "princessmargaretimage";
            }
            else if (p.equals("Plan International Canada")) {
                ImageView img = (ImageView) findViewById(R.id.imageView);
                img.setImageResource(R.drawable.planimage);
                TextView txt = (TextView) findViewById(R.id.textView4);
                txt.setText(R.string.planMission);
                cImage = "planimage";
            }
            else if (p.equals("Compassion Canada")) {
                ImageView img = (ImageView) findViewById(R.id.imageView);
                img.setImageResource(R.drawable.compassionimage);
                TextView txt = (TextView) findViewById(R.id.textView4);
                txt.setText(R.string.compassioncanada);
                cImage = "compassionimage";
            }
            else if (p.equals("Terry Fox Foundation")) {
                ImageView img = (ImageView) findViewById(R.id.imageView);
                img.setImageResource(R.drawable.terryfoximage);
                TextView txt = (TextView) findViewById(R.id.textView4);
                txt.setText(R.string.terryMission);
                cImage = "terryfoximage";
            }
            else if (p.equals("Habitat for Humanity Canada")) {
                ImageView img = (ImageView) findViewById(R.id.imageView);
                img.setImageResource(R.drawable.habitatimage);
                TextView txt = (TextView) findViewById(R.id.textView4);
                txt.setText(R.string.habitatMission);
                cImage = "habitatimage";
            }
            else if (p.equals("Canadian Breast Cancer Society")) {
                ImageView img = (ImageView) findViewById(R.id.imageView);
                img.setImageResource(R.drawable.breastimage);
                TextView txt = (TextView) findViewById(R.id.textView4);
                txt.setText(R.string.breastcancerMission);
                cImage = "breastimage";
            }
            else if (p.equals("Canadian Diabetes Association")) {
                ImageView img = (ImageView) findViewById(R.id.imageView);
                img.setImageResource(R.drawable.diabetesimage);
                TextView txt = (TextView) findViewById(R.id.textView4);
                txt.setText(R.string.diabetesMission);
                cImage = "diabetesimage";
            }
            else if (p.equals("Cystic Fibrosis Canada")) {
                ImageView img = (ImageView) findViewById(R.id.imageView);
                img.setImageResource(R.drawable.cfcanadaimage);
                TextView txt = (TextView) findViewById(R.id.textView4);
                txt.setText(R.string.cfcanadaMission);
                cImage = "cfcanadaimage";
            }
            else if (p.equals("Multiple Sclerosis Society of Canada")) {
                ImageView img = (ImageView) findViewById(R.id.imageView);
                img.setImageResource(R.drawable.msscimage);
                TextView txt = (TextView) findViewById(R.id.textView4);
                txt.setText(R.string.mscanadaMission);
                cImage = "msscimage";
            }
            else if (p.equals("Sunnybrook Health Sciences Centre Foundation")) {
                ImageView img = (ImageView) findViewById(R.id.imageView);
                img.setImageResource(R.drawable.sunnybrookimage);
                TextView txt = (TextView) findViewById(R.id.textView4);
                txt.setText(R.string.sunnybrookMission);
                cImage = "sunnybrookimage";
            }
            else if (p.equals("Mount Sinai Hospital Foundation of Toronto")) {
                ImageView img = (ImageView) findViewById(R.id.imageView);
                img.setImageResource(R.drawable.mountsinaiimage);
                TextView txt = (TextView) findViewById(R.id.textView4);
                txt.setText(R.string.mountsinaiMission);
                cImage = "mountsinaiimage";
            }
            else if (p.equals("Aga Khan Foundation Canada")) {
                ImageView img = (ImageView) findViewById(R.id.imageView);
                img.setImageResource(R.drawable.agaimage);
                TextView txt = (TextView) findViewById(R.id.textView4);
                txt.setText(R.string.agaMission);
                cImage = "agaimage";
            }
            else if (p.equals("War Amputations of Canada")) {
                ImageView img = (ImageView) findViewById(R.id.imageView);
                img.setImageResource(R.drawable.warampsimage);
                TextView txt = (TextView) findViewById(R.id.textView4);
                txt.setText(R.string.warMission);
                cImage = "warampsimage";
            }
            else if (p.equals("Tim Horton Childrens Foundation")) {
                ImageView img = (ImageView) findViewById(R.id.imageView);
                img.setImageResource(R.drawable.timhortonsimage);
                TextView txt = (TextView) findViewById(R.id.textView4);
                txt.setText(R.string.timMission);
                cImage = "timhortonsimage";
            }
            else if (p.equals("Canadian Tire Jumpstart Charities")) {
                ImageView img = (ImageView) findViewById(R.id.imageView);
                img.setImageResource(R.drawable.cantireimage);
                TextView txt = (TextView) findViewById(R.id.textView4);
                txt.setText(R.string.cantireMission);
                cImage = "cantireimage";
            }
            else if (p.equals("Ontario Association of Food Banks")) {
                ImageView img = (ImageView) findViewById(R.id.imageView);
                img.setImageResource(R.drawable.foodbanksimage);
                TextView txt = (TextView) findViewById(R.id.textView4);
                txt.setText(R.string.foodbankMission);
                cImage = "foodbanksimage";
            }
            else if (p.equals("Childrens Wish Foundation of Canada")) {
                ImageView img = (ImageView) findViewById(R.id.imageView);
                img.setImageResource(R.drawable.childrenwishimage);
                TextView txt = (TextView) findViewById(R.id.textView4);
                txt.setText(R.string.wishfoundationMission);
                cImage = "childrenwishimage";
            }
            else if (p.equals("Mothers Against Drunk Driving")) {
                ImageView img = (ImageView) findViewById(R.id.imageView);
                img.setImageResource(R.drawable.maddimage);
                TextView txt = (TextView) findViewById(R.id.textView4);
                txt.setText(R.string.MADDMission);
                cImage = "maddimage";
            }
            else if (p.equals("World Wildlife Fund Canada Foundation")) {
                ImageView img = (ImageView) findViewById(R.id.imageView);
                img.setImageResource(R.drawable.wwfcanadaimage);
                TextView txt = (TextView) findViewById(R.id.textView4);
                txt.setText(R.string.WWFMission);
                cImage = "wwfcanadaimage";
            }
            else if (p.equals("University Hospitals Foundation")) {
                ImageView img = (ImageView) findViewById(R.id.imageView);
                img.setImageResource(R.drawable.universityimage);
                TextView txt = (TextView) findViewById(R.id.textView4);
                txt.setText(R.string.UHFMission);
                cImage = "universityimage";
            }
            else if (p.equals("St. Michaels Hospital Foundation")) {
                ImageView img = (ImageView) findViewById(R.id.imageView);
                img.setImageResource(R.drawable.michaelsimage);
                TextView txt = (TextView) findViewById(R.id.textView4);
                txt.setText(R.string.MichaelMission);
                cImage = "michaelsimage";
            }
            else if (p.equals("Alberta Childrens Hospital Foundation")) {
                ImageView img = (ImageView) findViewById(R.id.imageView);
                img.setImageResource(R.drawable.albertaimage);
                TextView txt = (TextView) findViewById(R.id.textView4);
                txt.setText(R.string.AlbertaMission);
                cImage = "albertaimage";
            }
            else if (p.equals("Baycrest Centre Foundation")) {
                ImageView img = (ImageView) findViewById(R.id.imageView);
                img.setImageResource(R.drawable.baycrestimage);
                TextView txt = (TextView) findViewById(R.id.textView4);
                txt.setText(R.string.BaycrestMission);
                cImage = "baycrestimage";
            }
            else {
                ImageView img = (ImageView) findViewById(R.id.imageView);
                img.setImageResource(R.drawable.salvationimage);
                TextView txt = (TextView) findViewById(R.id.textView4);
                txt.setText(R.string.salMission);
                cImage = "salvationimage";
            }

            Button b1 = (Button) findViewById(R.id.button);
            final Intent myIntent = new Intent(this, Page3.class);

            b1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    myIntent.putExtra("cImage", cImage);
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
                Intent intent1 = new Intent(Page2.this, MainHelp.class);
                startActivity(intent1);
                return true;
            case R.id.menuTwo:
                Intent intent2 = new Intent(Page2.this, MainAbout.class);
                startActivity(intent2);
                return true;
            case R.id.menuThree:
                Intent intent4 = new Intent(Page2.this, Donation.class);
                startActivity(intent4);
                return true;
            default:
                return super.onOptionsItemSelected(item);


        }

    }

}
