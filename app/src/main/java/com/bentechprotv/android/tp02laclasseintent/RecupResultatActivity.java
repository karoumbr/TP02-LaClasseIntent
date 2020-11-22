package com.bentechprotv.android.tp02laclasseintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RecupResultatActivity extends AppCompatActivity {


    EditText _txtMessage;
    Button _btnRetournerRe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recup_resultat);
        _txtMessage = (EditText) findViewById(R.id.txtMessage);
        _btnRetournerRe = (Button)findViewById(R.id.btnRetournerRe);
        _btnRetournerRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = _txtMessage.getText().toString();
                Intent i = new Intent();
                i.putExtra("MESSAGE",message);
                setResult(4,i);
                finish();
            }
        });
    }
}