package com.example.reflexgame;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class EndGame extends AppCompatActivity {

    Button restart, exitButton;
    TextView displayReflexTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_game);
        displayReflexTime = (TextView) findViewById(R.id.responseTime);
        restart = (Button) findViewById(R.id.restart);

        Intent intent = getIntent();
        long data = intent.getLongExtra("responseTime", 0);
        displayReflexTime.setText("Your Reflex Score: " + data);

        exitButton = (Button) findViewById(R.id.exitApp);

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(EndGame.this);
                builder.setMessage("Do You Want to Exit?");
                builder.setTitle("Alert!");
                builder.setCancelable(false);

                builder.setPositiveButton("Yes", (DialogInterface.OnClickListener) (dialog, which) -> {
                   finishAffinity();
                });

                builder.setNegativeButton("No", (DialogInterface.OnClickListener) (dialog, which) ->{
                   dialog.cancel();
                });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();

            }
        });

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(), HomeScreen.class);
                startActivity(intent1);
            }
        });

    }
}