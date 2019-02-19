package com.faisal.herukun.listview01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Player p1 = new Player();
        p1.setName("Ronaldo");
        p1.setAge(22);
        p1.setPhoto(R.drawable.ronaldo);

        Player p2 = new Player();
        p2.setName("Baggio");
        p2.setAge(26);
        p2.setPhoto(R.drawable.baggio);

        Player p3 = new Player();
        p3.setName("Henry");
        p3.setAge(20);
        p3.setPhoto(R.drawable.henry);

        ArrayList<Player> playerList = new ArrayList<>();

        playerList.add(p1);
        playerList.add(p2);
        playerList.add(p3);

        PlayerAdapter playerAdapter = new PlayerAdapter(getApplicationContext(),playerList,R.layout.player_layout_defult);

        ListView listView = findViewById(R.id.list_view);

        listView.setAdapter(playerAdapter);
    }
}
