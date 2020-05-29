package com.example.recyclercards;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button buttonAdd, buttonDelete;
    EditText editTextAdd, editTextDelete;
    ExampleItem exampleItem;

    ArrayList<ExampleItem> exampleList;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateFakeData();

        recyclerViewConfig();

        //find buttons
        buttonAdd = findViewById(R.id.buttonadd);
        buttonDelete = findViewById(R.id.buttondelete);

        //find edit text
        editTextAdd = findViewById(R.id.edittextadd);
        editTextDelete = findViewById(R.id.edittextdelete);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: make sure user cannot input blank number
                int position = Integer.parseInt(editTextAdd.getText().toString());
                addCard(position);
            }
        });
        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = Integer.parseInt(editTextDelete.getText().toString());
                deleteCard(position);
            }
        });

    }

    public void generateFakeData() {
        exampleList = new ArrayList<>();

        exampleList.add(new ExampleItem(R.drawable.node, "Clicked at studio", "Dev", R.raw.color_black));
        exampleList.add(new ExampleItem(R.drawable.oner, "Clicked at studio1", "Dev1", R.raw.color_brown));
        exampleList.add(new ExampleItem(R.drawable.twor, "Clicked at studio2", "Dev2", R.raw.color_green));
        exampleList.add(new ExampleItem(R.drawable.threer, "Clicked at studio3", "Dev3", R.raw.family_older_brother));
        exampleList.add(new ExampleItem(R.drawable.fourr, "Clicked at studio4", "Dev4", R.raw.phrase_how_are_you_feeling));
        exampleList.add(new ExampleItem(R.drawable.fiver, "Clicked at studio5", "Dev5", R.raw.phrase_are_you_coming));
    }

    public void recyclerViewConfig() {
        //config for recycler View
        recyclerView = findViewById(R.id.recyclerView);
        //performance
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        adapter = new ExampleAdapter(exampleList);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    public void addCard(int position) {
        exampleList.add(position, new ExampleItem(R.drawable.oner, "new card added", "its devbrat creativity", R.raw.color_brown));
//      adapter.notifyDataSetChanged();
        adapter.notifyItemInserted(position);
    }

    public void deleteCard(int position) {
        exampleList.remove(position);
        adapter.notifyItemRemoved(position);
    }
}
