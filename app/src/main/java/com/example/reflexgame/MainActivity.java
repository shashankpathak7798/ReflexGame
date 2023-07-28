package com.example.reflexgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static int SPLASH_SCREEN_TIME_OUT = 3000;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView head = (TextView)findViewById(R.id.heading);
        head.setShadowLayer(1.3f, 4.0f, 4.0f, Color.parseColor("#fdab52"));

        ImageView imageView = (ImageView) findViewById(R.id.imageIntro);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        imageView.startAnimation(animation);

        head.startAnimation(animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent I = new Intent(getApplicationContext(), HomeScreen.class);
                startActivity(I);
                finish();
            }
        }, SPLASH_SCREEN_TIME_OUT);

    }
}