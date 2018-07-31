package com.priya.layoutexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button_a;
    private Button button_b;
    private Button button_c;
    private Button button_d;

    private boolean button_aClicked;
    private boolean button_bClicked;
    private boolean button_cClicked;
    private boolean button_dClicked;

    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         textView=findViewById(R.id.textview);
         textView.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                textView.setText("CLICKED ON TEXT VIEW");
             }
         });

        button_a=findViewById(R.id.button_a);
        button_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_aClicked == true){
                    button_a.setText("BUTTON A");
                    button_aClicked = false;

                }else {
                    button_a.setText("CLICKED ON BUTTON A");
                    button_aClicked = true;
                }
            }
        });

        button_b=findViewById(R.id.button_b);
        button_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_bClicked == true) {
                     button_b .setText("BUTTON B");
                     button_bClicked = false;


                }else{
                       button_b.setText("CLICKED ON BUTTON B");
                       button_bClicked = true;
                }
            }
        });

        button_c=findViewById(R.id.button_c);
        button_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_cClicked == true) {
                    button_c.setText("BUTTON C");
                    button_cClicked = false;


                }else {
                    button_c.setText("CLICKED ON BUTTON C");
                    button_cClicked = true;
                }
            }
        });

        button_d=findViewById(R.id.button_d);
        button_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_dClicked == true){
                    button_d.setText("BUTTON D");
                    button_dClicked = false;

                }else {
                    button_d.setText("CLICKED ON BUTTON D");
                    button_dClicked = true;
                }
            }
        });




    }
}
