package com.example.hope10;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;

public class MainActivity extends AppCompatActivity {

    // Khai báo các thành phần
     DrawerLayout drawerLayout;
    Toolbar tooblar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tooblar = findViewById(R.id.toolbar);
        setSupportActionBar(tooblar);

        drawerLayout = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle tongle = new ActionBarDrawerToggle(this,drawerLayout,tooblar,R.string.nav_drawer_open,R.string.nav_drawer_close );
        drawerLayout.addDrawerListener(tongle);
        tongle.syncState();

    }
}