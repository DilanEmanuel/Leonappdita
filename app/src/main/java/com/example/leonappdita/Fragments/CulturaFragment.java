package com.example.leonappdita.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.leonappdita.R;

//Tiene que heredar de Fragment
public class CulturaFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //Crear View con el layout
        View v = inflater.inflate(R.layout.fragment_cultura,container,false);
        return v;
    }
}
