package com.example.datetimepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import org.w3c.dom.Text;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TimePicker timePicker;
    DatePicker datePicker;

    TextView textView;
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        datePicker = findViewById(R.id.datepicker);
        textView = findViewById(R.id.textView);

        Calendar calendar = Calendar.getInstance();

        datePicker.init(calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH),
                new DatePicker.OnDateChangedListener() {
                    @Override
                    public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        int a = monthOfYear+Integer.parseInt("1");
                        textView.setText("You selected: " + dayOfMonth + "-" + a + "-" + year);
                    }
                }
        );


        timePicker = findViewById(R.id.timePicker);

        textView1 = findViewById(R.id.textView1);

        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                textView1.setText("Hour" + hourOfDay + "\nminutes : " + minute);

            }
        });
    }
}
