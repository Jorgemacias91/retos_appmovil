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
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.festejos_app.Modelo.Adaptador;
import com.example.festejos_app.Modelo.BaseDatos.MotorBaseDatosSQLite;
import com.example.festejos_app.Modelo.Entidad;
import com.example.festejos_app.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class Fragment_Servicios extends Fragment {

    int [] imagen = {R.drawable.food, R.drawable.decoration, R.drawable.cleaning };

    String TAG = "Fragment_Servicios";

    View v;

    TextView prueba;

    ListView listaServicios;
    Adaptador adaptador;

    // CONEXIÓN A LA BASE DE DATOS
    MotorBaseDatosSQLite conectar;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment__servicios, container, false);
        //-----------------------------------------------------------------------------
        // content...
        listaServicios = (ListView) v.findViewById(R.id.lista_servicios);
        adaptador = new Adaptador(getTablaServicios(), getContext());

        listaServicios.setAdapter(adaptador);

        prueba = (TextView) v.findViewById(R.id.pruebaServicio);
        //-----------------------------------------------------------------------------
        return v;
    }

    private ArrayList<Entidad> getTablaServicios(){
        ArrayList<Entidad> listaProductos = new ArrayList<>();

        /* ================================================================================================== */
        // meu
        String url = "https://g6ec27d31f0870f-appfestejo.adb.sa-saopaulo-1.oraclecloudapps.com/ords/admin/servicios/servicios";

        RequestQueue requestQueue = Volley.newRequestQueue(getContext());

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                //***********************************************************
                try {
                    JSONArray jsonArray = response.getJSONArray("items");
                    for(int i = 0; i < jsonArray.length(); i++){
                        JSONObject jsonObject = jsonArray.getJSONObject(i);


                        String titulo = jsonObject.getString("titulo");
                        String descripcion = jsonObject.getString("descripcion");
                        String id = jsonObject.getString("id");

                        listaProductos.add(new Entidad(imagen[i], titulo, descripcion));
                        prueba.append(titulo + '\n');

                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                //***********************************************************
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });

        requestQueue.add(jsonObjectRequest);
        /* ================================================================================================== */

        return listaProductos;
    }
}