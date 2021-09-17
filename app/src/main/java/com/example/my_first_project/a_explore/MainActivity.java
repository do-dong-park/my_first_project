package com.example.my_first_project.a_explore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;


import android.os.Bundle;
import android.view.Menu;


import com.example.my_first_project.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public BottomNavigationView bottomNavigationView;
    public Toolbar toolbar;
    ViewPager viewpager;


//    xml에 있는 툴바를 현재 코드로 가져옴.


    //  앱이 처음 실행되었을 때, toolbar에 쓰려는 파일(menu로 쓸 파일)을 불러옴.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.appbar_action, menu);
        return true;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Toolbar
        toolbar = findViewById(R.id.app_toolbar);
        setSupportActionBar(toolbar);

//        viewpager, xml 위의 viewpager에 adapter를 연결
        viewpager = findViewById(R.id.viewpager);
        ViewpagerAdapter adapter = new ViewpagerAdapter(getSupportFragmentManager());
        viewpager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.tab_bar);
        tabLayout.setupWithViewPager(viewpager);
    }

}

