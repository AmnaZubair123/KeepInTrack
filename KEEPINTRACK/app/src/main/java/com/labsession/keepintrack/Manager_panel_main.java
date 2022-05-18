package com.labsession.keepintrack;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.labsession.keepintrack.ui.calender.Calender_main;
import com.labsession.keepintrack.ui.order.Order_main;
import com.labsession.keepintrack.ui.purchase.Purchase_main;
import com.labsession.keepintrack.ui.register.Register_driver;

public class Manager_panel_main extends AppCompatActivity {
    NavigationView nav;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_panel_main);
        imageView=findViewById(R.id.imageView2);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);


        nav= (NavigationView) findViewById(R.id.navmenu);
        drawerLayout=(DrawerLayout) findViewById(R.id.drawer_layout);

        toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_home:
                        Intent intent1 = new Intent(getApplicationContext(),Manager_panel_main.class);
                        startActivity(intent1);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_order:
                        Intent intent2 = new Intent(getApplicationContext(), Order_main.class);
                        startActivity(intent2);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_purchase:
                        Intent intent3 = new Intent(getApplicationContext(), Purchase_main.class);
                        startActivity(intent3);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_calender:
                        Intent intent4 = new Intent(getApplicationContext(), Calender_main.class);
                        startActivity(intent4);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.register_driver:
                        Intent intent5 = new Intent(getApplicationContext(), Register_driver.class);
                        startActivity(intent5);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.signout:
                        Intent intent6 = new Intent(getApplicationContext(), SignInEng.class);
                        startActivity(intent6);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                }

                return true;
            }
        });

    }
}