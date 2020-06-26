package com.example.truthdare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private ImageView imageView;
    private Random random = new Random();
    private int lastDirection;

    //for layout background
    private ConstraintLayout constraintLayout;

    //https://fb.com.HiteshChoudharyPage

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        imageView = findViewById(R.id.imageView);

        constraintLayout = findViewById(R.id.layout);

        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(3000);
        animationDrawable.setExitFadeDuration(3000);
        animationDrawable.start();

    }

    public void spin(View view){

        int newDirection = random.nextInt(3600)+2000;

        float pivotX = imageView.getWidth()/2;
        float pivotY = imageView.getHeight()/2;

        Animation rotate = new RotateAnimation(lastDirection,newDirection,pivotX,pivotY);
        rotate.setDuration(6500);
        rotate.setFillAfter(true);

        rotate.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                button.setEnabled(false);
//                button.setBackgroundColor(Color.parseColor("#c1c1c1"));
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                button.setEnabled(true);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
//                button.setEnabled();
            }
        });

        lastDirection = newDirection;

        imageView.startAnimation(rotate);

    }

}
