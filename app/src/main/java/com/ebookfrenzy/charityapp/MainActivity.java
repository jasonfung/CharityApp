package com.ebookfrenzy.charityapp;

import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

 //   String p;
    Integer donation = 0;

    /*
     * Change to type CustomAutoCompleteView instead of AutoCompleteTextView
     * since we are extending to customize the view and disable filter
     * The same with the XML view, type will be CustomAutoCompleteView
     */
    CustomAutoCompleteView myAutoComplete;

    // adapter for auto-complete
    ArrayAdapter<String> myAdapter;

    // for database operations
    DatabaseHandler databaseH;

    // just to add some initial value
    String[] item = new String[] {"Please search..."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{

            // instantiate database handler
            databaseH = new DatabaseHandler(MainActivity.this);

            // put sample data to database
            insertSampleData();

            // autocompletetextview is in activity_main.xml
            myAutoComplete = (CustomAutoCompleteView) findViewById(R.id.myautocomplete);

            // add the listener so it will tries to suggest while the user types
            myAutoComplete.addTextChangedListener(new CustomAutoCompleteTextChangedListener(this));

            // set our adapter
            myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, item);
            myAutoComplete.setAdapter(myAdapter);

            myAutoComplete.setOnItemClickListener(
                    new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            String name = String.valueOf(parent.getItemAtPosition(position));

                            Intent intent3 = new Intent( MainActivity.this, Page2.class);
                            intent3.putExtra("charityName", name);
                            startActivity(intent3);
                        }
                    }
            );



        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertSampleData(){

        // CREATE
        databaseH.create( new MyObject("119304855RR0001", "World Vision Canada"));
        databaseH.create( new MyObject("118829803RR0001", "Canadian Cancer Society"));
        databaseH.create( new MyObject("107951618RR0001", "Salvation Army"));
        databaseH.create( new MyObject("119219814RR0001", "Canadian Red Cross"));
        databaseH.create( new MyObject("108084419RR0001", "The Hospital for Sick Children Foundation"));
        databaseH.create( new MyObject("119278216RR0001", "United Way of Greater Toronto"));
        databaseH.create( new MyObject("106846942RR0001", "Heart and Stroke Foundation of Canada"));
        databaseH.create( new MyObject("889007597RR0001", "Princess Margaret Cancer Foundation"));
        databaseH.create( new MyObject("118928993RR0001", "Plan International Canada"));
        databaseH.create( new MyObject("118871516RR0001", "Compassion Canada"));
        databaseH.create( new MyObject("108099979RR0001", "Terry Fox Foundation"));
        databaseH.create( new MyObject("118950120RR0001", "Habitat for Humanity Canada"));
        databaseH.create( new MyObject("127993608RR0001", "Canadian Breast Cancer Society"));
        databaseH.create( new MyObject("118830744RR0001", "Canadian Diabetes Association"));
        databaseH.create( new MyObject("106845100RR0001", "Cystic Fibrosis Canada"));
        databaseH.create( new MyObject("107746174RR0001", "Multiple Sclerosis Society of Canada"));
        databaseH.create( new MyObject("108051541RR0002", "Sunnybrook Health Sciences Centre Foundation"));
        databaseH.create( new MyObject("119048106RR0001", "Mount Sinai Hospital Foundation of Toronto"));
        databaseH.create( new MyObject("100072586RR0001", "Aga Khan Foundation Canada"));
        databaseH.create( new MyObject("131969628RR0001", "War Amputations of Canada"));
        databaseH.create( new MyObject("119264885RR0001", "Tim Horton Childrens Foundation"));
        databaseH.create( new MyObject("137929451RR0002", "Canadian Tire Jumpstart Charities"));
        databaseH.create( new MyObject("885260968RR0001", "Ontario Association of Food Banks"));
        databaseH.create( new MyObject("124038878RR0001", "Childrens Wish Foundation of Canada"));
        databaseH.create( new MyObject("139072060RR0001", "Mothers Against Drunk Driving"));
        databaseH.create( new MyObject("872998471RR0001", "World Wildlife Fund Canada Foundation"));
        databaseH.create( new MyObject("889003240RR0001", "University Hospitals Foundation"));
        databaseH.create( new MyObject("108032533RR0001", "St. Michaels Hospital Foundation"));
        databaseH.create( new MyObject("130373244RR0001", "Alberta Childrens Hospital Foundation"));
        databaseH.create( new MyObject("119215242RR0001", "Baycrest Centre Foundation"));
    }

    // this function is used in CustomAutoCompleteTextChangedListener.java
    public String[] getItemsFromDb(String searchTerm){

        // add items on the array dynamically
        List<MyObject> products = databaseH.read(searchTerm);
        int rowCount = products.size();

        String[] item = new String[rowCount];
        int x = 0;

        for (MyObject record : products) {

            item[x] = record.objectName;
            x++;
        }

        return item;
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
                Intent intent1 = new Intent( MainActivity.this, MainHelp.class);
                startActivity(intent1);
                return true;
            case R.id.menuTwo:
                Intent intent2 = new Intent( MainActivity.this, MainAbout.class);
                startActivity(intent2);
                return true;
            case R.id.menuThree:
                Intent intent4 = new Intent( MainActivity.this, Donation.class);
                startActivity(intent4);
                return true;
            default:
                return super.onOptionsItemSelected(item);


        }

    }

}
