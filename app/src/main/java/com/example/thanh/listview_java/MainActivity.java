package com.example.thanh.listview_java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lsName;
    ArrayList<String> listName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        listName = new ArrayList<>();

        listName.add("Luffy");
        listName.add("Zoro");
        listName.add("Nami");
        listName.add("Usop");
        listName.add("Sanji");
        listName.add("Choper");
        listName.add("Robin");
        listName.add("Franky");
        listName.add("Brook");

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, listName);
        lsName.setAdapter(adapter);

    }

    private void AnhXa() {
        lsName = (ListView) findViewById(R.id.ListViewName);
    }
}
