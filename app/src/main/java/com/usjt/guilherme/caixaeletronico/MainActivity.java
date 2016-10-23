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
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        final Intent intentExtrato = new Intent(this, ExtratoActivity.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intentSaldo = new Intent(MainActivity.this, SaldoActivity.class);
                startActivity(new Intent(MainActivity.this, SaldoActivity.class));
            }
        });
    }
}
