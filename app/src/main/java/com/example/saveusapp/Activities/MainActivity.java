package com.example.saveusapp.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import android.nfc.Tag;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.saveusapp.Fragments.MainFragment;
import com.example.saveusapp.Fragments.Onboarding1Fragment;
import com.example.saveusapp.Fragments.Onboarding2Fragment;
import com.example.saveusapp.Fragments.Onboarding3Fragment;
import com.example.saveusapp.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

}