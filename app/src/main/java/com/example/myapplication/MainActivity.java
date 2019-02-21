package com.example.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton mm;
    Button bn;
    Switch gg;
    LinearLayout ev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mm = (ToggleButton) findViewById(R.id.mm);
        bn = (Button) findViewById(R.id.btn1);
        gg = (Switch) findViewById(R.id.gg);
        ev = (LinearLayout) findViewById(R.id.ev);

    }

    public void go(View view) {
        if (mm.isChecked()) {
            if (gg.isChecked()) {
                ev.setBackgroundColor(Color.BLACK);
            } else {
                ev.setBackgroundColor(Color.BLUE);
            }
        } else {
            if (gg.isChecked()) {
                ev.setBackgroundColor(Color.YELLOW);
            } else {
                ev.setBackgroundColor(Color.LTGRAY);
            }
        }
    }
}
