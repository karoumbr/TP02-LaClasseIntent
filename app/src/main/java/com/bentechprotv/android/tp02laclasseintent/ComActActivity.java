package com.bentechprotv.android.tp02laclasseintent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ComActActivity extends AppCompatActivity {

    EditText _txtParam1Envoi,_txtParam2Envoi;
    TextView _txtResultat;
    Button _btnApropos,_btnPassageParams, _btnRecupResultat;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 4){
            String message = data.getStringExtra("MESSAGE");
            _txtResultat.setText(message );
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_com_act);
        _txtParam1Envoi = (EditText) findViewById(R.id.txtParam1Envoi);
        _txtParam2Envoi = (EditText) findViewById(R.id.txtParam2Envoi);
        _btnPassageParams = (Button)findViewById(R.id.btnPassageParams);
        _txtResultat = (TextView)findViewById(R.id.txtResultat);
        _btnPassageParams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pp = new Intent(getApplicationContext(),PassParamsActivity.class);
                pp.putExtra("Value1", _txtParam1Envoi.getText().toString());
                pp.putExtra("Value2",_txtParam2Envoi.getText().toString());
                startActivity(pp);
            }
        });

        _btnApropos = (Button) findViewById(R.id.btnApropos);
        _btnApropos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Aprop = new Intent(getApplicationContext(),AproposActivity.class);
                startActivity(Aprop);
            }
        });

        _btnRecupResultat = (Button)findViewById(R.id.btnRecupResultat);

        _btnRecupResultat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent res = new Intent(getApplicationContext(),RecupResultatActivity.class);
                startActivityForResult(res,4);

            }
        });


    }
}