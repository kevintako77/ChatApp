package com.android.teaching.chatapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.BaseAdapter;

public class listaDeChat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_chat);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarLista); // Conectamos el Layout al objeto Toolbar
        setSupportActionBar(toolbar);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater myInflater = getMenuInflater();
        myInflater.inflate(R.menu.menu_lista, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Open LoginActivity
        Intent loginIntent = new Intent(this, escribirMensaje.class);
        startActivity(loginIntent);
        return super.onOptionsItemSelected(item);
    }

}





