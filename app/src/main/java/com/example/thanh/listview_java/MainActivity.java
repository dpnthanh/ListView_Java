package com.example.thanh.listview_java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lsName;
    ArrayList<String> listName;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        CreateListView();

        lsName.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, listName.get(i), Toast.LENGTH_SHORT).show();
            }
        });
        lsName.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, listName.get(i) + "One Piece", Toast.LENGTH_SHORT).show();
                return false;
            }
        });

    }


    private void CreateListView() { //Khởi tạo ListView
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

        adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, listName);

        lsName.setAdapter(adapter);
    }

    private void AnhXa() {
        lsName = (ListView) findViewById(R.id.ListViewName);
    }
}
