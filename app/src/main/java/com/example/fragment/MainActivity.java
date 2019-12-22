package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        repliseFragment(new FragmentOne());

        setinitUI();



    }


    private void setinitUI() {


        findViewById(R.id.btn_frg_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                repliseFragment(new FragmentOne());

            }
        });


        findViewById(R.id.btn_frg_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                repliseFragment(new FragmentTwo());

            }
        });
    }


    public void repliseFragment(Fragment fragment) {

        FragmentTransaction transaction = ((FragmentActivity) this).getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout_id, fragment).commit();

    }


}


