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

    private FloatingActionButton button1, button2, button3, button4, button5, button6, button7, button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (FloatingActionButton) findViewById(R.id.button_kategori_lomba);
        button2 = (FloatingActionButton) findViewById(R.id.button_kategori_pengajian);
        button3 = (FloatingActionButton) findViewById(R.id.button_kategori_seminar);
        button4 = (FloatingActionButton) findViewById(R.id.button_kategori_talkshow);
        button5 = (FloatingActionButton) findViewById(R.id.button_kategori_nigtlive);
        button6 = (FloatingActionButton) findViewById(R.id.button_kategori_sosial);
        button7 = (FloatingActionButton) findViewById(R.id.button_kategori_makanan);
        button8 = (FloatingActionButton) findViewById(R.id.button_kategori_workshop);


        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivityLomba();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivityLomba();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivityLomba();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivityLomba();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivityLomba();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivityLomba();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivityLomba();
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {

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
