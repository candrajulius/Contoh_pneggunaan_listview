package com.candra.ujankedua_dicoding;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.candra.ujankedua_dicoding.DataAdpater.DataAdapter;
import com.candra.ujankedua_dicoding.DataAdpater.DataFilm;
import com.candra.ujankedua_dicoding.DataAdpater.Film;

import java.util.ArrayList;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Film> candra = new ArrayList<>();
    private Context context;
    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Candra Julius Sinaga");
            getSupportActionBar().setSubtitle("Home");
        }

        list  = findViewById(R.id.listview);
        candra.addAll(DataFilm.ambilData());
        DataAdapter data = new DataAdapter(this,candra);
        data.setKamu(candra);
        data.setContext(this);
        list.setAdapter(data);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Intent intent = new Intent(MainActivity.this,DetailActivity.class);
               intent.putExtra("saya",candra.get(position));
               startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.kamu){
            Intent candra = new Intent(MainActivity.this,AboutActivity.class);
            startActivity(candra);
        }
        return super.onOptionsItemSelected(item);

    }
}
