package com.example.studyfarm;


import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    private FragmentHome fragmentHome=new FragmentHome();
//    private FragmentFarm fragmentFarm=new FragmentFarm();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        BottomNavigationHelper.disableShiftMode(bottomNavigationView);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frame_layout, fragmentHome).commitAllowingStateLoss();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                switch (item.getItemId()) {
                    case R.id.action_home:
                        fragment = new FragmentHome();
                        transaction.replace(R.id.frame_layout, fragment);
                        transaction.commit();
                        break;
                    case R.id.action_farm:
                        fragment = new FragmentFarm();
                        transaction.replace(R.id.frame_layout, fragment);
                        transaction.commit();
                        break;
                    case R.id.action_group:
                        fragment = new FragmentGroup();
                        transaction.replace(R.id.frame_layout, fragment);
                        transaction.commit();
                        break;
                    case R.id.action_video:
                        fragment = new FragmentVideo();
                        transaction.replace(R.id.frame_layout, fragment);
                        transaction.commit();
                        break;
                }
                return true;
            }
        });

    }

}


