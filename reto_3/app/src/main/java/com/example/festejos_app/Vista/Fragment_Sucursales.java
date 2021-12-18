package com.example.festejos_app.Vista;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.festejos_app.R;

import java.util.ArrayList;


public class Fragment_Sucursales extends Fragment {

    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment__sucursales, container, false);
        //-----------------------------------------------------------------------------
        // content...


        //-----------------------------------------------------------------------------
        return v;
    }
}