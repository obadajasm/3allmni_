package com.example.a3allmni;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.a3allmni.Adapters.MyRecyclerViewAdapter;
import com.example.a3allmni.model.letter;

public class LettersActivity extends AppCompatActivity implements MyRecyclerViewAdapter.ItemClickListener {
    MyRecyclerViewAdapter adapter;
    letter[] DATA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letters);
            DATA=lettersProvider.DATA;
        Log.d("", "onCreate: "+DATA[0].getTitle());
        // data to populate the RecyclerView with

        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.letters_recycler_view);
        int numberOfColumns = 3;
        GridLayoutManager myGridlayoutManager;
        myGridlayoutManager= new GridLayoutManager(this, numberOfColumns);
        //myGridlayoutManager.setReverseLayout(true);
        recyclerView.setLayoutManager(myGridlayoutManager);
        adapter = new MyRecyclerViewAdapter( DATA);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        letter CurrentItem= DATA[position];

        Intent i = new Intent(this,SingleLetterActivity.class);
        i.putExtra("letter",CurrentItem);
        startActivity(i);


    }
}

