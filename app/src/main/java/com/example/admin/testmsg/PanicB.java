package com.example.admin.testmsg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class PanicB extends AppCompatActivity {

    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panic_b);

    }

    public void EF (View view) {

        Toast.makeText( this,  "Emergencia de fuego enviada",Toast.LENGTH_SHORT).show();
    }

    public void EM (View view) {
        Toast.makeText( this,  "Emergencia medica enviada",Toast.LENGTH_SHORT).show();
    }

    public void ET (View view) {

        Toast.makeText( this,  "Emergencia de armas enviada",Toast.LENGTH_SHORT).show();
    }
    public void Return ( View view){
        Intent next = new Intent (this, Principal.class);
        startActivity(next);

    }
}
