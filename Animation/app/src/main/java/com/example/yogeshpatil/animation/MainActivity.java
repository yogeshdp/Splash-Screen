package com.example.yogeshpatil.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView apple = (ImageView) findViewById(R.id.apple);
        apple.animate().rotation(180).setDuration(5000);
        apple.animate().rotationX(360).setDuration(7000);
        apple.animate().translationY(250).setDuration(3000);
        apple.animate().alphaBy(0.1f).setDuration(4000);


        
    }
}
