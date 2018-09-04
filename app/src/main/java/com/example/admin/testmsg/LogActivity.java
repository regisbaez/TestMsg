package com.example.admin.testmsg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LogActivity extends AppCompatActivity {

    private EditText etn, etp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        etn = (EditText)findViewById(R.id.txt_nombre);
        etp = (EditText)findViewById(R.id.txt_password);
    }

    //Método para el botón
    public void Registrar(View view){

        String nombre = etn.getText().toString();
        String password = etp.getText().toString();

        if(nombre.length() == 0){
            Toast.makeText(this, "Debes de ingresar un nombre", Toast.LENGTH_SHORT).show();
        }
        if(password.length() == 0){
            Toast.makeText(this, "Debes de ingresar una password", Toast.LENGTH_SHORT).show();
        }
        if(nombre.contains("20140324") && password.contains("1234")){
            Toast.makeText(this, "Bienvenido", Toast.LENGTH_SHORT).show();
            Intent next1 = new Intent (this, Principal.class);
            startActivity(next1);
        }
        else{ Toast.makeText(this, "Nombre o Password incorrecto", Toast.LENGTH_SHORT).show(); }
    }
}

