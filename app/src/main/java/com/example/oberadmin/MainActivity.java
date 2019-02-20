package com.example.oberadmin;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.toolbarLayout);
        drawerLayout=findViewById(R.id.drawerLayout);
        navigationView=findViewById(R.id.navigationView);
        setSupportActionBar(toolbar);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
               switch (menuItem.getItemId())
               {
                   case R.id.nav_home:
                       menuItem.setChecked(true);
                       displayMessage("clicked home");
                       drawerLayout.closeDrawers();
                       return true;
                   case R.id.nav_newOrder:
                       menuItem.setChecked(true);
                       displayMessage("clicked new order");
                       drawerLayout.closeDrawers();
                       return true;
                   case R.id.nav_menulist:
                       menuItem.setChecked(false);
                       displayMessage("clicked menu list");
                       drawerLayout.closeDrawers();
                       return true;
                   case R.id.nav_addTable:
                       menuItem.setChecked(true);
                       displayMessage("clicked add table");
                       drawerLayout.closeDrawers();
                       return true;
                   case R.id.nav_postAdd:
                       menuItem.setChecked(true);
                       displayMessage("clicked advertise");
                       drawerLayout.closeDrawers();
                       return true;
                   case R.id.nav_about:
                       menuItem.setChecked(true);
                       displayMessage("clicked about");
                       drawerLayout.closeDrawers();
                       return true;
               }

                return true;
            }
        });
    }

    private void displayMessage(String message)
    {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
                
    }
}
