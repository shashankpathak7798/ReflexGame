package com.example.reflexgame;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class DefaultGrid extends Fragment {

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    public static int COLOR_TIME_OUT = 3000;

    public DefaultGrid() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_default_grid, container, false);

        btn1 = view.findViewById(R.id.btn1);
        btn2 = view.findViewById(R.id.btn2);
        btn3 = view.findViewById(R.id.btn3);
        btn4 = view.findViewById(R.id.btn4);
        btn5 = view.findViewById(R.id.btn5);
        btn6 = view.findViewById(R.id.btn6);
        btn7 = view.findViewById(R.id.btn7);
        btn8 = view.findViewById(R.id.btn8);
        btn9 = view.findViewById(R.id.btn9);

        int no = 0;
        Random random = new Random();
        while(true) {
            no = random.nextInt(10);
            if(no != 0)
                break;
        }
        switch(no) {
            case 1:
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        btn1.setBackgroundResource(R.drawable.button_color);
                        final long time = System.currentTimeMillis();
                        btn1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                long time1 = System.currentTimeMillis();
                                btn1.setBackgroundResource(R.drawable.round_button);
                                Intent intent = new Intent(getContext(), EndGame.class);
                                intent.putExtra("responseTime", time1-time);
                                startActivity(intent);

                            }
                        });
                    }
                }, COLOR_TIME_OUT);
                break;
            case 2:
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        btn2.setBackgroundResource(R.drawable.button_color);
                        final long time = System.currentTimeMillis();
                        btn2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                long time1 = System.currentTimeMillis();
                                btn2.setBackgroundResource(R.drawable.round_button);
                                Intent intent = new Intent(getActivity(), EndGame.class);
                                intent.putExtra("responseTime", time1-time);
                                startActivity(intent);
                            }
                        });
                    }
                }, COLOR_TIME_OUT);
                break;
            case 3:
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        btn3.setBackgroundResource(R.drawable.button_color);
                        final long time = System.currentTimeMillis();
                        btn3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                long time1 = System.currentTimeMillis();
                                btn3.setBackgroundResource(R.drawable.round_button);
                                Intent intent = new Intent(getActivity(), EndGame.class);
                                intent.putExtra("responseTime", time1-time);
                                startActivity(intent);
                            }
                        });
                    }
                }, COLOR_TIME_OUT);
                break;
            case 4:
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        btn4.setBackgroundResource(R.drawable.button_color);
                        final long time = System.currentTimeMillis();
                        btn4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                long time1 = System.currentTimeMillis();
                                btn4.setBackgroundResource(R.drawable.round_button);
                                Intent intent = new Intent(getActivity(), EndGame.class);
                                intent.putExtra("responseTime", time1-time);
                                startActivity(intent);
                            }
                        });
                    }
                }, COLOR_TIME_OUT);
                break;
            case 5:
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        btn5.setBackgroundResource(R.drawable.button_color);
                        final long time = System.currentTimeMillis();
                        btn5.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                long time1 = System.currentTimeMillis();
                                btn5.setBackgroundResource(R.drawable.round_button);
                                Intent intent = new Intent(getActivity(), EndGame.class);
                                intent.putExtra("responseTime", time1-time);
                                startActivity(intent);
                            }
                        });
                    }
                }, COLOR_TIME_OUT);
                break;
            case 6:
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        btn6.setBackgroundResource(R.drawable.button_color);
                        final long time = System.currentTimeMillis();
                        btn6.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                long time1 = System.currentTimeMillis();
                                btn6.setBackgroundResource(R.drawable.round_button);
                                Intent intent = new Intent(getActivity(), EndGame.class);
                                intent.putExtra("responseTime", time1-time);
                                startActivity(intent);
                            }
                        });
                    }
                }, COLOR_TIME_OUT);
                break;
            case 7:
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        btn7.setBackgroundResource(R.drawable.button_color);
                        final long time = System.currentTimeMillis();
                        btn7.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                long time1 = System.currentTimeMillis();
                                btn7.setBackgroundResource(R.drawable.round_button);
                                Intent intent = new Intent(getActivity(), EndGame.class);
                                intent.putExtra("responseTime", time1-time);
                                startActivity(intent);
                            }
                        });
                    }
                }, COLOR_TIME_OUT);
                break;
            case 8:
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        btn8.setBackgroundResource(R.drawable.button_color);
                        final long time = System.currentTimeMillis();
                        btn8.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                long time1 = System.currentTimeMillis();
                                btn8.setBackgroundResource(R.drawable.round_button);
                                Intent intent = new Intent(getActivity(), EndGame.class);
                                intent.putExtra("responseTime", time1-time);
                                startActivity(intent);
                            }
                        });
                    }
                }, COLOR_TIME_OUT);
                break;
            case 9:
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        btn9.setBackgroundResource(R.drawable.button_color);
                        final long time = System.currentTimeMillis();
                        btn9.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                long time1 = System.currentTimeMillis();
                                btn9.setBackgroundResource(R.drawable.round_button);
                                Intent intent = new Intent(getActivity(), EndGame.class);
                                intent.putExtra("responseTime", time1-time);
                                startActivity(intent);
                            }
                        });
                    }
                }, COLOR_TIME_OUT);
                break;
            default:
                break;
        }

        return view;
    }

}