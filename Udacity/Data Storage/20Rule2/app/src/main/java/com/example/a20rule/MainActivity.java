package com.example.a20rule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private static final long START_TIME_IN_MILLIS = 6000;
    private static final long START_TIME_IN_MILLIS1 = 7000;
    private static final long START_TIME_IN_MILLIS2 = 8000;

    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;
    private long bigBreak = START_TIME_IN_MILLIS1;
    private long smallBreaks = START_TIME_IN_MILLIS2;

    private TextView update;
    private Button start;
    private Button breakTen;
    private Button breakSmall;

    private CountDownTimer mCountDownTimer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = findViewById(R.id.button);

        breakTen = findViewById(R.id.button2);

        breakSmall = findViewById(R.id.smallBreak);

        update = findViewById(R.id.update);


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    resetTimer();
                    startTimer();
            }
        });
        breakTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    resetTimer();
                    startTimer2();
            }
        });
        breakSmall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    resetTimer();
                    startTimer3();
            }
        });

    }

    private void startTimer() {
        mCountDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                update.setText("Break");
            }
        }.start();

    }
    private void startTimer2() {
        mCountDownTimer = new CountDownTimer(bigBreak, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                bigBreak = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                update.setText("Start");
            }
        }.start();

    }
    private void startTimer3() {
        mCountDownTimer = new CountDownTimer(smallBreaks, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                smallBreaks = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                update.setText("Start");
            }
        }.start();

    }





    private void resetTimer() {
        startTimer();
        updateCountDownText();
    }

    private void updateCountDownText() {
        int minutes = (int) (mTimeLeftInMillis / 1000) / 60;
        int seconds = (int) (mTimeLeftInMillis / 1000) % 60;

        String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);

        update.setText(timeLeftFormatted);

    }
}