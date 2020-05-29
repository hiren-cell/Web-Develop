package in.learncodeonline.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewDicy;

    private ImageView imageViewDicyy;

    private Random myRandomNumber = new Random();

    private Random getMyRandomNumber1 = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDicy = findViewById(R.id.imageButton);
        imageViewDicyy = findViewById(R.id.image);


//        Button abc =(Button) new Button(findViewById(R.id.button));
    }
    public  void button(View view){
        rollOurDice();
        rollOurDicee();
    }

    private void rollOurDice() {
        int myRanNumber = getMyRandomNumber1.nextInt(6) + 1;

        switch (myRanNumber) {
            case 1:
                imageViewDicy.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDicy.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDicy.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDicy.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDicy.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDicy.setImageResource(R.drawable.dice6);
                break;
        }
    } private void rollOurDicee() {
        int myRanNumber = myRandomNumber.nextInt(6) + 1;

        switch (myRanNumber) {
            case 1:
                imageViewDicyy.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDicyy.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDicyy.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDicyy.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDicyy.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDicyy.setImageResource(R.drawable.dice6);
                break;
        }
    }
}
