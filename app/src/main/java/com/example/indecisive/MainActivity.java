package com.example.indecisive;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
//import java.util.ArrayList;
//import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button B1;
    Button B2;
    Button B3;
    TextView TV;
    String[] yesno = {"YES", "NO"};
//    List<String> list = new ArrayList<>();
//    list.add("YES");
//    list.add("NO");

    Random r = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B1 = (Button)findViewById(R.id.BTN1);
        B2 = (Button)findViewById(R.id.BTN2);
        B3 = (Button)findViewById(R.id.BTN3);
        TV = (TextView)findViewById(R.id.textView);

        B1.setOnClickListener(this);
        B2.setOnClickListener(this);
        B3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.BTN1) {
            int upperbound = 100;
            int int_random = r.nextInt(upperbound);
            TV.setText("You get: "+int_random);

        }

        if(view.getId()==R.id.BTN2) {
            char c = (char) ('A' + r.nextInt(26));
            TV.setText("You get: "+c);
        }

        if(view.getId()==R.id.BTN3) {
//            int rnd = new Random().nextInt(yesno.length);
//            String yah =return yesno[rnd];
//            TV.setText("You get: " + );
            String randomArray = yesno[r.nextInt(2)];
            TV.setText("You get: " + randomArray);
        }
    }
}