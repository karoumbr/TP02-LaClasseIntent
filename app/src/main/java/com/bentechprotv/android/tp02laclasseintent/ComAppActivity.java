package com.bentechprotv.android.tp02laclasseintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class ComAppActivity extends AppCompatActivity {

    ImageView _btnChrome,_btnGoogleMap,_btnTelephone, _btnCamera,_btnGalerie,_btnGmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_com_app);
        _btnChrome = (ImageView) findViewById(R.id.btnChrome);
        _btnChrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ichrome = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=woB4E3innbE&list=PL6bOvrvJX9SSGE2vAk5eHnNpA5uP78KyD"));
                startActivity(ichrome);
            }
        });

        _btnGoogleMap= (ImageView) findViewById(R.id.btnGoogleMap);
        _btnGoogleMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iGoogleMap = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:36.800204,10.1862744"));
                startActivity(iGoogleMap);
            }
        });
        _btnTelephone = (ImageView) findViewById(R.id.btnTelephone);
        _btnTelephone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iTelephone = new Intent(Intent.ACTION_VIEW,Uri.parse("tel:21699888777"));
                startActivity(iTelephone);
            }
        });
        _btnCamera = (ImageView) findViewById(R.id.btnCamera);
        _btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iCamera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(iCamera);
            }
        });
        _btnGalerie = (ImageView) findViewById(R.id.btnGalerie);
        _btnGalerie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iGalerie = new Intent(Intent.ACTION_VIEW,Uri.parse("content://media/external/images/media/"));
                startActivity(iGalerie);
            }
        });
        _btnGmail = (ImageView) findViewById(R.id.btnGmail);
        _btnGmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] TO = {"karoumbr@yahoo.fr"};
                String[] CC= {""};
                Intent iGmail = new Intent(Intent.ACTION_SEND);
                iGmail.setData(Uri.parse("mailto:"));
                iGmail.setType("text/plain");
                iGmail.putExtra(Intent.EXTRA_EMAIL,TO);
                iGmail.putExtra(Intent.EXTRA_CC, CC);
                iGmail.putExtra(Intent.EXTRA_SUBJECT, "Sujet Email");
                iGmail.putExtra(Intent.EXTRA_TEXT, "N'oubliez pas de vous inscrire sur la chaîne Youtube \"BEN TECH PRO TV\" et appuyer sur le bouton de notification.\n Karim Ben Romdhane. ");
                try {
                        startActivity(Intent.createChooser(iGmail,"Envoi de email..."));
                        finish();;
                } catch (android.content.ActivityNotFoundException ex){
                    Toast.makeText(getApplicationContext(),"Installez un client email.",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}