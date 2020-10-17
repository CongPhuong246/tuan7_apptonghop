package com.example.signinandsignup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.signinandsignup.adapter.CustomAdapter;
import com.example.signinandsignup.mode.Nhac;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class Danhsach extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danhsach);
        ArrayList<Nhac> arrayList = new ArrayList<>();
        lv = (ListView) findViewById(R.id.lv);
        Nhac coffee1 = new Nhac(Color.parseColor("#03A9F4"),"Ánh Nắng Của Anh","Đức Phúc");
        Nhac coffee2 = new Nhac(Color.parseColor("#03A9F4"),"Đánh Mất Em","Quang Đăng");
        Nhac coffee3 = new Nhac(Color.parseColor("#03A9F4"),"Hoa Nở Không Màu","Hoài Lâm");
        Nhac coffee4 = new Nhac(Color.parseColor("#03A9F4"),"Nàng Thơ","Hoàng Dũng");
        Nhac coffee5 = new Nhac(Color.parseColor("#03A9F4"),"Hoa Hải Đường","Jack");
        Nhac coffee6 = new Nhac(Color.parseColor("#03A9F4"),"Tướng Quân","Nhật Phong");
        Nhac coffee7 = new Nhac(Color.parseColor("#03A9F4"),"Lạ Lùng","15.000 đ");
        Nhac coffee8 = new Nhac(Color.parseColor("#03A9F4"),"Đông Kiếm Em","Vũ");
        CustomAdapter customAdapter = new CustomAdapter(this,R.layout.listview,arrayList);
        arrayList.add(coffee1);
        arrayList.add(coffee2);
        arrayList.add(coffee3);
        arrayList.add(coffee4);
        arrayList.add(coffee5);
        arrayList.add(coffee6);
        arrayList.add(coffee7);
        arrayList.add(coffee8);
        lv.setAdapter(customAdapter);


        BottomNavigationView bottomNavigationView =findViewById(R.id.bottom);
        bottomNavigationView.setSelectedItemId(R.id.nav_home);
bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_home:
                return true;
            case R.id.nav_pro5:
                startActivity(new Intent(getApplicationContext(),Profile.class));
                overridePendingTransition(0,0);
                return true;
        }
        return false;
        }
    });
    }
}