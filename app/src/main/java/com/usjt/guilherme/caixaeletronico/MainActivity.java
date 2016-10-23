package com.usjt.guilherme.caixaeletronico;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        final Intent intentExtrato = new Intent(this, ExtratoActivity.class);
        final Intent intentSaldo = new Intent(MainActivity.this, SaldoActivity.class);
        final Intent intentMenu = new Intent(this, MenuActivity.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentMenu);
            }
        });
    }
}
