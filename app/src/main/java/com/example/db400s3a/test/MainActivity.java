package com.example.db400s3a.test;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    //Bind the Views of the activity_main.xml file
    @Bind(R.id.btn_spotify) Button btn_spotify;
    @Bind(R.id.btn_football) Button btn_football;
    @Bind(R.id.btn_library) Button btn_library;
    @Bind(R.id.btn_build) Button btn_build;
    @Bind(R.id.btn_xyz) Button btn_xyz;
    @Bind(R.id.btn_capstone) Button btn_capstone;

    //The onClick() methods for the buttons
    @OnClick(R.id.btn_spotify)
    public void onClick1(){
        show(btn_spotify);
    }

    @OnClick(R.id.btn_football)
    public void onClick2(){
        show(btn_football);
    }

    @OnClick(R.id.btn_library)
    public void onClick3(){
        show(btn_library);
    }

    @OnClick(R.id.btn_build)
    public void onClick4(){
        show(btn_build);
    }

    @OnClick(R.id.btn_xyz)
    public void onClick5(){
        show(btn_xyz);
    }

    @OnClick(R.id.btn_capstone)
    public void onClick6(){
        show(btn_capstone);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
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

    public void show(Button btn){

        if (btn == btn_spotify)
            Toast.makeText(getApplicationContext(), "This button will launch SPOTIFY STREAMER",
                    Toast.LENGTH_SHORT).show();

        if (btn == btn_football)
            Toast.makeText(getApplicationContext(), "This button will launch FOOTBALL SCORES APP",
                    Toast.LENGTH_SHORT).show();

        if (btn == btn_library)
            Toast.makeText(getApplicationContext(), "This button will launch LIBRARY APP",
                    Toast.LENGTH_SHORT).show();

        if (btn == btn_build)
            Toast.makeText(getApplicationContext(), "This button will launch BUILD IT BIGGER",
                    Toast.LENGTH_SHORT).show();

        if (btn == btn_xyz)
            Toast.makeText(getApplicationContext(), "This button will launch XYZ READER",
                    Toast.LENGTH_SHORT).show();

        if (btn == btn_capstone)
            Toast.makeText(getApplicationContext(), "This button will launch CAPSTONE APP",
                    Toast.LENGTH_SHORT).show();

    }
}