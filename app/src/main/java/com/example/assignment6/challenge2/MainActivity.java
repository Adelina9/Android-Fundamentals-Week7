package com.example.assignment6.challenge2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.LevelListDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.assignment6.R;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    LevelListDrawable lld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c2_activity_main);

        imageView = findViewById(R.id.imageViewBattery);
        lld = (LevelListDrawable)imageView.getDrawable();
    }

    public void decreaseBatteryLevel(View view) {
        int currentLevel = lld.getLevel();
        if (currentLevel > 0) {
            lld.setLevel(currentLevel - 1);
            imageView.setImageDrawable(lld);
        }

    }

    public void increaseBatteryLevel(View view) {
        int currentLevel = lld.getLevel();
        if (currentLevel < 3) {
            lld.setLevel(currentLevel + 1);
            imageView.setImageDrawable(lld);
        }
    }
}