package com.example.recyclercards;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {

    // 6.2
    private ArrayList<ExampleItem> mExampleList;

    // 1
    public static class ExampleViewHolder extends RecyclerView.ViewHolder {

        // 4
        public ImageView imageView;
        public TextView textView, textView2;

        // 2
        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);

            // 4
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
            textView2 = itemView.findViewById(R.id.textView1);
        }
    }

    // 6.1
    public ExampleAdapter(ArrayList<ExampleItem> exampleList) {
        mExampleList = exampleList;

    }

    // 3 created by implemented methods
    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // 5
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_item, parent, false);
        ExampleViewHolder exampleViewHolder = new ExampleViewHolder(view);
        return exampleViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
        // 7
        ExampleItem currentItem = mExampleList.get(position);
        holder.imageView.setImageResource(currentItem.getmImageResource());
        holder.textView.setText(currentItem.getmText());
        holder.textView2.setText(currentItem.getdText());



    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }


}
