package com.example.drumpadapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    MediaPlayer m1;
    ImageButton b1, b2;

//    @Override
//    public void onBackPressed() {
//        finish();
//        System.exit(0);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        b1 = findViewById(R.id.imageButton1);
//        b2 = findViewById(R.id.imageButton2);
//

//        m2 = MediaPlayer.create(this, R.raw.two);
//
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                m1.start();
//            }
//        });
//        b2.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        m2.start();
//                    }
//                });

    }


    public void play(View view) {
        switch (view.getId()) {
            case R.id.imageButton1:
                m1 = MediaPlayer.create(this, R.raw.one);
                m1.start();
                break;
            case R.id.imageButton2:
                m1 = MediaPlayer.create(this, R.raw.two);
                m1.start();
                break;
            case R.id.imageButton3:
                m1 = MediaPlayer.create(this, R.raw.three);
                m1.start();
                break;
            case R.id.imageButton4:
                m1 = MediaPlayer.create(this, R.raw.four);
                m1.start();
                break;
            case R.id.imageButton5:
                m1 = MediaPlayer.create(this, R.raw.fv);
                m1.start();
                break;
            case R.id.imageButton6:
                m1 = MediaPlayer.create(this, R.raw.sixth);
                m1.start();
                break;
            case R.id.imageButton7:
                m1 = MediaPlayer.create(this, R.raw.seventh);
                m1.start();
                break;
            case R.id.imageButton8:
                m1 = MediaPlayer.create(this, R.raw.eighth);
                m1.start();
                break;
            case R.id.imageButton9:
                m1 = MediaPlayer.create(this, R.raw.one);
                m1.start();
                break;
            case R.id.imageButton10:
                m1 = MediaPlayer.create(this, R.raw.two);
                m1.start();
                break;
            case R.id.imageButton11:
                m1 = MediaPlayer.create(this, R.raw.three);
                m1.start();
                break;
            case R.id.imageButton12:
                m1 = MediaPlayer.create(this, R.raw.four);
                m1.start();
                break;
        }
    }
}
