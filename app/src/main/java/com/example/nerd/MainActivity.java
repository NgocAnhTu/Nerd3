package com.example.nerd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nerd.databinding.ActivityMainBinding;
import com.example.utils.General;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    TextView txtName;
    String username = General.Us.getUsername();
    ImageView imvavatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        showInfo();
        bottomNav();
        changePage();

    }

    private void showInfo() {
        txtName.setText(General.ADB.ShowInfo(username).getString(3));
        //convert photo
        byte[] photo = General.ADB.ShowInfo(username).getBlob(7);
        Bitmap bitmap = BitmapFactory.decodeByteArray(photo,0,photo.length);
        imvavatar.setImageBitmap(bitmap);
    }

    private void bottomNav() {
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.homepage);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.courses:
                        Intent courses = new Intent(MainActivity.this, DetailCourse.class);
                        startActivity(courses);
                        return true;

                    case R.id.homepage:
                        return true;

                    case R.id.user:
                        Intent user = new Intent(MainActivity.this, UserPage.class);
                        startActivity(user);
                        return true;
                    case R.id.calendar:
                        Intent calendar = new Intent(MainActivity.this, Calendars.class);
                        startActivity(calendar);
                        return true;
                }

                return false;
            }
        });

    }


    private void changePage() {

        binding.imbCourse1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent course1 = new Intent(MainActivity.this, Course.class);
                startActivity(course1);
            }
        });
    }


}