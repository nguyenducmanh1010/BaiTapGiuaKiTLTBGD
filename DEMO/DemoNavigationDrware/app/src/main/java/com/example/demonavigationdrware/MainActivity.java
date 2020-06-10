package com.example.demonavigationdrware;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener {
Toolbar toolbar;
DrawerLayout drawerLayout;
ActionBar actionBar;
NavigationView navigationView;
    FragmentManager fragmentManager;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar =findViewById(R.id.toolbar);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView =findViewById(R.id.navigarion_view);


        setSupportActionBar(toolbar);

        // dể có giấu 3 gachj
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(MainActivity.this,drawerLayout,R.string.open,R.string.close);
        actionBarDrawerToggle.syncState();

        actionBar =getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    // set sự kiên click
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sự kiên mở drawer
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
        navigationView.setNavigationItemSelectedListener(this);

        fragmentManager = getSupportFragmentManager();
    }

    @Override
    public boolean onNavigationItemSelected( MenuItem menuItem) {
        int i = menuItem.getItemId();
        switch (i){
            case R.id.camera:

                FragmentTransaction transaction = fragmentManager.beginTransaction();
                Fragment_Camera fragmentCamera =new Fragment_Camera();
                transaction.replace(R.id.content_layout,fragmentCamera);
                drawerLayout.closeDrawer(GravityCompat.START);
                transaction.commit();
                break;
            case R.id.gallery:

                FragmentTransaction fragmentTransaction1 = fragmentManager.beginTransaction();
                Frament_gallery frament_gallery =new Frament_gallery();
                fragmentTransaction1.replace(R.id.content_layout,frament_gallery);
                drawerLayout.closeDrawer(GravityCompat.START);
                fragmentTransaction1.commit();
                break;
            case R.id.slideshow:
                break;
            case R.id.manager:
                break;
            case R.id.share:
                break;
            case R.id.send:
                break;
        }
            return false;
    }
}
