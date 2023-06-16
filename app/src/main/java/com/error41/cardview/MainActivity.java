package com.error41.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
         RecyclerView recyclerView;

    // 1 -data :

       ArrayList<GameModel> gameModelArrayList;
    //2 -AdapterView:

    MYAdapter adapter;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     recyclerView=findViewById(R.id.recyclerview);

     gameModelArrayList= new ArrayList<>();
      gameModelArrayList.add( new GameModel("Bangladesh",R.drawable.bangladesh));
      gameModelArrayList.add( new GameModel("China",R.drawable.china));
      gameModelArrayList.add( new GameModel("Germany",R.drawable.german));
      gameModelArrayList.add( new GameModel("India",R.drawable.india));
      gameModelArrayList.add( new GameModel("Italy",R.drawable.italy));
      gameModelArrayList.add( new GameModel("Nepal",R.drawable.nepal));
      gameModelArrayList.add( new GameModel("Rasia",R.drawable.rasia));


      adapter = new MYAdapter(this,gameModelArrayList);

      RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this,
              LinearLayoutManager.VERTICAL,false);

                recyclerView.setLayoutManager(layoutManager);
               recyclerView.setAdapter(adapter);


    }
}