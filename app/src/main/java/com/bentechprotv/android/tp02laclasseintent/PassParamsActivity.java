package com.bentechprotv.android.tp02laclasseintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class PassParamsActivity extends AppCompatActivity {

    TextView _txtParam1Recu, _txtParam2Recu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass_params);
        _txtParam1Recu = (TextView) findViewById(R.id.txtParam1Recu);
        _txtParam2Recu = (TextView) findViewById(R.id.txtParam2Recu);

        Bundle extras = getIntent().getExtras();
      _txtParam1Recu.setText(extras.getString("Value1"));
      _txtParam2Recu.setText(extras.getString("Value2"));
    }
}