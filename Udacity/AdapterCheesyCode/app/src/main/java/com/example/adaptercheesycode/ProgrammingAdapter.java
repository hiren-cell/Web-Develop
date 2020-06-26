package com.example.adaptercheesycode;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProgrammingAdapter extends RecyclerView.Adapter {

    private String[] data;
    public ProgrammingAdapter(String[] data){
        this.data = data;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder{
        public ProgrammingViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
