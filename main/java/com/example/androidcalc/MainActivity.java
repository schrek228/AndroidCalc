package com.example.androidcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;


import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText name, age, mass, height;
    private Button button;
    private TextView water,calories;
    public static double dmass,dheight,dage,caloriesrec;
    public static boolean sex;

    private CheckBox gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // calling data from design
        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        mass = findViewById(R.id.mass);
        height = findViewById(R.id.height);
        button = findViewById(R.id.button);
        water = findViewById(R.id.water);
        calories = findViewById(R.id.calories);
        gender = findViewById(R.id.gender);





        // converting datatypes, fuck you java!
        String sname = (name.getText()==null?"":name.getText().toString());
        String sage = (age.getText()==null?"":age.getText().toString());
        String smass = (mass.getText()==null?"":mass.getText().toString());
        String sheight = (height.getText()==null?"":height.getText().toString());


        gender.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonview, boolean isChecked){
                if(isChecked){
                    sex = true;
                }
                else{sex  = false;}
            }




        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().toString().trim().equals("") | age.getText().toString().trim().equals("") | mass.getText().toString().trim().equals("") | height.getText().toString().trim().equals(""))
                    Toast.makeText(MainActivity.this, R.string.noinput, Toast.LENGTH_LONG).show();


                else {
                    // recording values to use it later
                    String sname = (name.getText()==null?"":name.getText().toString());
                    dmass = (mass.getText()==null?0:Double.parseDouble(mass.getText().toString()));
                    dheight = (height.getText()==null?0:Double.parseDouble(height.getText().toString()));
                    dage = (age.getText()==null?0:Double.parseDouble(age.getText().toString()));
                }
                String waterrec = String.valueOf(dmass*40);
                waterrec = waterrec + " мл воды";
                if(sex){
                    caloriesrec = (10*dmass + 6.25 * dheight - 5 * dage - 161) * 1.55;
                }
                else{
                    caloriesrec =(10*dmass + 6.25 * dheight - 5 * dage + 5) * 1.55;
                }
                String scaloriesrec = String.valueOf(caloriesrec);
                scaloriesrec = caloriesrec + " ккал";
                water.setText(waterrec);
                calories.setText(scaloriesrec);


            }


        });
    }
}