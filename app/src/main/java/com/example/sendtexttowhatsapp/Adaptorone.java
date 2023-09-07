package com.example.sendtexttowhatsapp;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sendtexttowhatsapp.databinding.ItemsBinding;

import java.util.ArrayList;

public class Adaptorone extends RecyclerView.Adapter<Adaptorone.ViewHolder> {
    ArrayList<Modelclassone> list;

    public Adaptorone(ArrayList<Modelclassone> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.items,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Modelclassone obj=list.get(position);
        holder.binding.buttonitem.setText(obj.getButton());
        holder.binding.buttonitem.setOnClickListener(v -> {
            Intent whatsapp= new Intent(Intent.ACTION_SEND);
            whatsapp.setType("text/plane");
            whatsapp.setPackage("com.whatsapp");
            whatsapp.putExtra(Intent.EXTRA_TEXT,"i want to buy this");

        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
           ItemsBinding binding;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding=ItemsBinding.bind(itemView);
        }
    }
}
