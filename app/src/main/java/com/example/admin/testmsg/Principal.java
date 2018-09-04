package com.example.admin.testmsg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }
    public void Mapa (View view) {
        Intent next6 = new Intent (this, MapaElec.class);
        startActivity(next6);

    }
    public void Location (View view) {
        //Intent next6 = new Intent (this, MapsActivity.class);
       // startActivity(next6);
        Toast.makeText( this,  "No esta disponible",Toast.LENGTH_SHORT).show();
    }

    public void Chat(View view) {
        Toast.makeText( this,  "No esta disponible",Toast.LENGTH_SHORT).show();
    }

    public void Fotos (View view) {

        Intent next5 = new Intent (this, Foto.class);
        startActivity(next5);
    }
    public void Panico ( View view){
        Intent next2 = new Intent (this, PanicB.class);
        startActivity(next2);
    }
    public void Salir( View view){
        Intent next3 = new Intent (this, LogActivity.class);
        startActivity(next3);
    }

}
