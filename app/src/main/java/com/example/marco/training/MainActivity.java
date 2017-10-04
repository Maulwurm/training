package com.example.marco.training;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void openSnackbar(View view,String type){
        Snackbar.make(view, "Replace with your own " + type, Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Activity","onCreate");

        Button butt1 = (Button) findViewById(R.id.button);
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSnackbar(view,"butt");
            }
        });

        Button btLoad = (Button) findViewById(R.id.buttonLoad);

        final EditText etInsert = (EditText) findViewById(R.id.edittextInsert);

        final TextView tvShow = (TextView) findViewById(R.id.textviewShow);

        btLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //1. lade Text in die Variable

                String textAusgabe;

                textAusgabe = etInsert.getText().toString();

                //2. Lade Text ins TextView

                tvShow.setText(textAusgabe);

            }
        });















        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSnackbar(view,"fab");
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
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity","onStart");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("Activiy","onResume");
    }

    @Override
    protected void onPause() {
        Log.d("Activity","onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("Activity","onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("Activy","onDestroy");
        super.onDestroy();
    }
}
