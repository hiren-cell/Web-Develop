package in.learncodeonline.mybuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

//    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        button = findViewById(R.id.myPurpleButton1);
//        Button button2=findViewById(R.id.myPurpleButton2);

        //first button
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("Test","First button clicked");
//            }
//        });

        //second button
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("Test","Second button clicked");
//            }
//        });
    }

    public void bluePressed(View view){
//        Log.d("Bluee","second method");
//        Context context = getApplicationContext();
//        CharSequence text = "Hell from First";
//        int duration = Toast.LENGTH_SHORT;
//
//        Toast toast = Toast.makeText(context ,text ,duration);
//        toast.show();
        Toast.makeText(getApplicationContext(),"Hello from Devbrat",Toast.LENGTH_SHORT).show();

    }

    public void bluePressed1(View view){
//        Log.d("BLUE","clicked via method");
        Toast.makeText(this,"Hello from Devbrat Dubey",Toast.LENGTH_SHORT).show();
    }

}

