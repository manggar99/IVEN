package com.example.iven;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.iven.utils.Tools;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (FloatingActionButton) findViewById(R.id.button_kategori_lomba);
        button = (FloatingActionButton) findViewById(R.id.button_kategori_pengajian);
        button = (FloatingActionButton) findViewById(R.id.button_kategori_seminar);
        button = (FloatingActionButton) findViewById(R.id.button_kategori_talkshow);
        button = (FloatingActionButton) findViewById(R.id.button_kategori_nigtlive);
        button = (FloatingActionButton) findViewById(R.id.button_kategori_sosial);
        button = (FloatingActionButton) findViewById(R.id.button_kategori_makanan);
        button = (FloatingActionButton) findViewById(R.id.button_kategori_workshop);


        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivityLomba();
            }
        });
    }

    public void openActivityLomba(){
        Intent intent = new Intent(this,EventList.class);
        startActivity(intent);
    }
}
