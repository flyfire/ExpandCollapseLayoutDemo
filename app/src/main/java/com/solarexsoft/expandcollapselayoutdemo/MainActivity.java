package com.solarexsoft.expandcollapselayoutdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean isExpand = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_expand);
        TextView material = findViewById(R.id.material);
        TextView photo = findViewById(R.id.photo);
        TextView cover = findViewById(R.id.cover);
        material.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isExpand = !isExpand;
                if (isExpand) {
                    photo.setVisibility(View.VISIBLE);
                    cover.setVisibility(View.VISIBLE);
                } else {
                    photo.setVisibility(View.GONE);
                    cover.setVisibility(View.GONE
                    );
                }
            }
        });
    }

}