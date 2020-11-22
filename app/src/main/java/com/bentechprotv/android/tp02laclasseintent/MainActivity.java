package com.bentechprotv.android.tp02laclasseintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button _btnComAct, _btnComApp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _btnComAct = (Button) findViewById(R.id.btnComAct);
        _btnComApp = (Button) findViewById(R.id.btnComApp);
        _btnComAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent comAct = new Intent(getApplicationContext(),ComActActivity.class);
                startActivity(comAct);
            }
        });

        _btnComApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent comApp = new Intent(getApplicationContext(),ComAppActivity.class);
                startActivity(comApp);
            }
        });
    }
}