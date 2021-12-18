package com.example.festejos_app.Vista;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.festejos_app.Modelo.Adaptador;
import com.example.festejos_app.Modelo.BaseDatos.MotorBaseDatosSQLite;
import com.example.festejos_app.Modelo.Entidad;
import com.example.festejos_app.R;

import java.util.ArrayList;


public class Fragment_Favoritos extends Fragment {

    View v;
    String TAG = "Fragment_Favoritos";

    ListView listaFavoritos;
    Adaptador adaptador;

    int [] imagen = {R.drawable.fiesta1, R.drawable.fiesta2, R.drawable.fiesta3};

    // CONEXION ALA BASE DE DATOS : SQLite
    MotorBaseDatosSQLite conectar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment__favoritos, container, false);
        //-----------------------------------------------------------------------------
        // content...
        listaFavoritos = (ListView) v.findViewById(R.id.lista_favoritos);
        adaptador = new Adaptador(getTablaFavoritos(), getContext());
        listaFavoritos.setAdapter(adaptador);
        //-----------------------------------------------------------------------------
        return v;
    }

    private ArrayList<Entidad> getTablaFavoritos(){
        ArrayList<Entidad> listaFavoritos = new ArrayList<>();
        conectar = new MotorBaseDatosSQLite(getContext(), "TiendaProductos", null, 1);
        SQLiteDatabase db_leer = conectar.getReadableDatabase();
        Cursor cursor = db_leer.rawQuery("SELECT * FROM favoritos", null);
        Log.v(TAG, "leyendo base de datos");

        while(cursor.moveToNext()){
            Log.v(TAG, "dentro del while");
            listaFavoritos.add(new Entidad(imagen[cursor.getInt(0)], cursor.getString(1), cursor.getString(2)));
            Log.v(TAG, "despues del while");
        }
        return listaFavoritos;
    }
}