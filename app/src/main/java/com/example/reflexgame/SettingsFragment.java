package com.example.reflexgame;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


public class SettingsFragment extends Fragment {

    private Button saveSettings;
    private ImageButton prev, next;
    private TextView gridSize, headText;

    public SettingsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_settings, container, false);

        saveSettings = view.findViewById(R.id.saveChanges);
        prev = view.findViewById(R.id.prevVal);
        next = view.findViewById(R.id.nextVal);
        gridSize = view.findViewById(R.id.gridValue);
        headText = view.findViewById(R.id.text_settings);

        headText.setShadowLayer(1.3f, 4.0f, 4.0f, Color.parseColor("#FFA500"));

        saveSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle value = new Bundle();
                value.putString("gridSize", gridSize.getText().toString());
                MainMenu fr = new MainMenu();
                fr.setArguments(value);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.menuFragment, fr, null).commit();

            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = gridSize.getText().toString();

                if(str.equals("3")){
                    gridSize.setText("4");
                }
                else if(str.equals("4")) {
                    gridSize.setText("3");
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = gridSize.getText().toString();
                if(str.equals("3")) {
                    gridSize.setText("4");
                }
                else if(str.equals("4")) {
                    gridSize.setText("3");
                }
            }
        });

        return view;
    }
}