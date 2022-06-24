package com.example.androidcalc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WaterFoodProgress extends AppCompatActivity {
    private Button addglass;
    private EditText glassvol;
    public double vol;
    public double drink = 0;
    private TextView watprog;
    String strwatprog;
    double mass = MainActivity.dmass;
    double waterrec = mass*40;
    private Button ok;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_food_progress);
        glassvol = findViewById(R.id.glassvol);
        ok = findViewById(R.id.ok);
        watprog = findViewById(R.id.watprog);
        addglass = findViewById(R.id.addglass);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(glassvol.getText().toString().trim().equals("")){
                    vol = 200;
                }
                else
                {
                    vol = Double.parseDouble(glassvol.getText().toString());
                }
            }
        });
        addglass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    drink = drink + vol;

                strwatprog = "Выпито " + drink +" мл воды, это " + (drink / waterrec)*100 +" % суточной нормы";
                watprog.setText(strwatprog);
            }
        });
    }

}