package com.example.app_celebrations;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ActionBar actionBar;
    Fragment subPantalla1, subPantalla2, subPantalla3, subPantalla4, subPantallaInicio;
    FragmentTransaction intercambio;

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "onDestroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.ic_logo);

        subPantalla1 = new Fragment_Productos();
        subPantalla2 = new Fragment_Servicios();
        subPantalla3 = new Fragment_Sucursales();
        subPantalla4 = new Fragment_Favoritos();
        subPantallaInicio = new Fragment_Inicio();

        getSupportFragmentManager().beginTransaction().add(R.id.contenedor_fragments, subPantallaInicio);

    }

    /**----------------------------Menú de opciones--------------------------------*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.productOpt){
            intercambio = getSupportFragmentManager().beginTransaction();
            intercambio.replace(R.id.contenedor_fragments, subPantalla1).commit();

        }
        if(id == R.id.serviceOpt){
            intercambio = getSupportFragmentManager().beginTransaction();
            intercambio.replace(R.id.contenedor_fragments, subPantalla2).commit();
        }
        if(id == R.id.sucurOpt){
            intercambio = getSupportFragmentManager().beginTransaction();
            intercambio.replace(R.id.contenedor_fragments, subPantalla3).commit();
        }
        if(id == R.id.favorite){
            intercambio = getSupportFragmentManager().beginTransaction();
            intercambio.replace(R.id.contenedor_fragments, subPantalla4).commit();
        }
        return super.onOptionsItemSelected(item);
    }


}