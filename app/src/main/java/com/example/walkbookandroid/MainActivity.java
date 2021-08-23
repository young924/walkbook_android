package com.example.walkbookandroid;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        getSupportFragmentManager().beginTransaction().add(R.id.main_frame, new FragmentMap()).commit();

        // 바텀 네비게이션뷰 안의 아이템 설정
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.mapItem:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new FragmentMap()).commit();
                        break;
                    case R.id.postItem:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new FragmentPost()).commit();
                        break;
                    case R.id.newItem:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new FragmentNew()).commit();
                        break;
                    case R.id.profileItem:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new FragmentProfile()).commit();
                        break;
                }
                return true;
            }
        });
    }
}