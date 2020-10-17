package com.example.signinandsignup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Profile extends AppCompatActivity {
    ImageView iconexit;
    TextView exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

            iconexit = (ImageView) findViewById(R.id.iconlogout);
            exit = (TextView) findViewById(R.id.logout);

            iconexit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Profile.this, MainActivity.class);
                    startActivity(intent);
                }
            });
            exit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Profile.this,MainActivity.class);
                    startActivity(intent);
                }
            });

        BottomNavigationView bottomNavigationView =findViewById(R.id.bottom);
        bottomNavigationView.setSelectedItemId(R.id.nav_home);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_home:
                        startActivity(new Intent(getApplicationContext(),Danhsach.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_pro5:
                        return true;
                }
                return false;
            }
        });
    }
}