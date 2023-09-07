package com.example.sendtexttowhatsapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sendtexttowhatsapp.databinding.FragmentFragment1Binding;

import java.util.ArrayList;


public class fragment1 extends Fragment {

    public fragment1() {

    }
    FragmentFragment1Binding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

           binding=FragmentFragment1Binding.inflate(inflater,container,false);
        ArrayList<Modelclassone> list;

        list=new ArrayList<>();

        list.add(new Modelclassone("buy",R.drawable.shoe));

        list.add(new Modelclassone("buy",R.drawable.shoe));

        list.add(new Modelclassone("buy",R.drawable.shoe));

        LinearLayoutManager layoutManager= new LinearLayoutManager(getContext());
        Adaptorone adaptorone= new Adaptorone(list);


        binding.Recycler.setLayoutManager(layoutManager);
        binding.Recycler.setAdapter(adaptorone);
        return binding.getRoot();
    }
}