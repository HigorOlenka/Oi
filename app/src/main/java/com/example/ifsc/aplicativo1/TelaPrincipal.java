package com.example.ifsc.aplicativo1;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.*;


public class TelaPrincipal extends AppCompatActivity {
    private Button btn_montar_pizza;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_tela_principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btn_montar_pizza = (Button) findViewById(R.id.btn_montar_pizza);
        btn_montar_pizza.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mag = new AlertDialog.Builder(TelaPrincipal.this);
                mag.setMessage("Você caiu no gemidão do zap");
                mag.setNeutralButton("Ok", null);
                mag.show();
            }








        });
    }


}
