package com.usjt.guilherme.caixaeletronico;

/**
 * Created by guilherme on 23/10/16.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ExtratoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String lista[] = new String[50];
        super.onCreate(savedInstanceState);
        setContentView(R.layout.extrato_activity);
        //ArrayAdapter
        for(int i=0; i<50; i++){
            lista[i] = "Item "+ i;
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, lista);
        ListView listView = (ListView) findViewById(R.id.listViewExtrato);
        listView.setAdapter(adapter);
    }
    public void geraLista(String lista[]){
        for(int i=0; i<=50; i++){
            lista[i] = "Item "+ i;
        }
    }
}

