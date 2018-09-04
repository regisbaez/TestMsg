package com.example.admin.testmsg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MapaElec extends AppCompatActivity {

    private RadioButton rb_a1, rb_a2,rb_a3,rb_a4,rb_tep,rb_arq,rb_dep,rb_cb,rb_bibl,rb_mat,rb_j23,rb_pa,rb_reg,rb_pens,rb_punts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_elec);

        rb_a1 = (RadioButton)findViewById(R.id.rb_a1);
        rb_a2 =(RadioButton)findViewById(R.id.rb_a2);
        rb_a3=(RadioButton)findViewById(R.id.rb_a3);
        rb_a4=(RadioButton)findViewById(R.id.rb_a4);
        rb_tep=(RadioButton)findViewById(R.id.rb_tep);
        rb_arq=(RadioButton)findViewById(R.id.rb_arq);
        rb_cb=(RadioButton)findViewById(R.id.rb_cb);
        rb_dep=(RadioButton)findViewById(R.id.rb_dep);
        rb_pens=(RadioButton)findViewById(R.id.rb_pens);
        rb_pa=(RadioButton)findViewById(R.id.rb_pa);
        rb_bibl=(RadioButton)findViewById(R.id.rb_bibl);
        rb_j23=(RadioButton)findViewById(R.id.rb_j23);
        rb_reg =(RadioButton)findViewById(R.id.rb_reg);
        rb_mat=(RadioButton)findViewById(R.id.rb_mat);
        rb_punts=(RadioButton)findViewById(R.id.rb_punts);
    }
    public void  generar(View view){

        if(rb_a1.isChecked()==true)
        {
            Intent next6 = new Intent (this, A1.class);
            startActivity(next6);
        }
        else if(rb_pens.isChecked()==true)
        {
            Intent next6 = new Intent (this, Pens.class);
            startActivity(next6);
        }
        else if(rb_reg.isChecked()==true)
        {
            Intent next6 = new Intent (this, Reg.class);
            startActivity(next6);
        }
        else if(rb_a4.isChecked()==true)
        {
            Intent next6 = new Intent (this, A4.class);
            startActivity(next6);
        }
        else if(rb_a3.isChecked()==true)
        {
            Intent next6 = new Intent (this, A3.class);
            startActivity(next6);
        }
        else if(rb_a2.isChecked()==true)
        {
            Intent next6 = new Intent (this, A2.class);
            startActivity(next6);
        }
        else if(rb_j23.isChecked()==true)
        {
            Intent next6 = new Intent (this, J23.class);
            startActivity(next6);
        }
        else if(rb_bibl.isChecked()==true)
        {
            Intent next6 = new Intent (this, Bibl.class);
            startActivity(next6);
        }
        else if(rb_pa.isChecked()==true)
        {
            Intent next6 = new Intent (this, Pa.class);
            startActivity(next6);

        }
        else  if(rb_cb.isChecked()==true)
        {
            Intent next6 = new Intent (this, Cb.class);
            startActivity(next6);
        }
        else  if(rb_dep.isChecked()==true)
        {
            Intent next6 = new Intent (this, Dep.class);
            startActivity(next6);
        }
        else if(rb_mat.isChecked()==true)
        {
            Intent next6 = new Intent (this, Mat.class);
            startActivity(next6);
        }
        else if(rb_arq.isChecked()==true)
        {
            Intent next6 = new Intent (this, Arq.class);
            startActivity(next6);
        }
        if(rb_tep.isChecked()==true)
        {
            Intent next6 = new Intent (this, Tep.class);
            startActivity(next6);
        }
        if(rb_punts.isChecked()==true)
        {
            Intent next6 = new Intent (this, Puntosreu.class);
            startActivity(next6);
        }
    }


}
