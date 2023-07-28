package com.example.reflexgame;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainMenu extends Fragment {

    private Button startGame, viewSettings, exitGame;
    private TextView headText;


    public MainMenu() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main_menu, container, false);




        startGame = view.findViewById(R.id.playGame);
        headText = view.findViewById(R.id.main_menu);
        viewSettings = view.findViewById(R.id.openSettings);
        exitGame = view.findViewById(R.id.quitGame);

        headText.setShadowLayer(1.3f, 4.0f, 4.0f, Color.parseColor("#FFA500"));

        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                headText.setVisibility(View.GONE);
                startGame.setVisibility(View.GONE);
                viewSettings.setVisibility(View.GONE);
                exitGame.setVisibility(View.GONE);

                Bundle result = getArguments();
                if(result != null) {
                    String data = result.getString("gridSize");
                    if(data.equals("3")) {
                        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.menuFragment, new DefaultGrid(), null).commit();
                    }
                    else if(data.equals("4")) {
                        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.menuFragment, new Grid4X4(), null).commit();
                    }
                }
                else {
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.menuFragment, new DefaultGrid(), null).commit();
                }

            }
        });

        viewSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                headText.setVisibility(View.GONE);
                startGame.setVisibility(View.GONE);
                viewSettings.setVisibility(View.GONE);
                exitGame.setVisibility(View.GONE);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.menuFragment, new SettingsFragment(), null).commit();
            }
        });

        exitGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().finishAffinity();
            }
        });


        return view;
    }
}