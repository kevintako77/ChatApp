package com.android.teaching.chatapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class escribirMensaje extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escribir_mensaje);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2); // Conectamos el Layout al objeto Toolbar
        setSupportActionBar(toolbar);
        ActionBar ab= getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_lista, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.escribirMensaje) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
