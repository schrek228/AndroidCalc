package com.example.androidcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    private Button b0, b1, b2, b3, b4, b5, b6;
    private Button b7, b8, b9, b_plus, b_minus;
    private Button b_multiple, b_devide, b_sqr, b_log;
    private Button b_power, b_pm, b_c, b_equal;
    public double first;
    public double second;
    public String result;
    public byte act =0;
    public TextView resultfield;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        // calling data from design
        resultfield = findViewById(R.id.resultfield);
        b0 = findViewById(R.id.button0);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
        b_plus = findViewById(R.id.button_plus);
        b_minus = findViewById(R.id.button_minus);
        b_multiple = findViewById(R.id.button_multiple);
        b_devide = findViewById(R.id.button_devide);
        b_sqr = findViewById(R.id.button_sqr);
        b_log = findViewById(R.id.button_log);
        b_power = findViewById(R.id.button_power);
        b_pm = findViewById(R.id.button_pm);
        b_c = findViewById(R.id.button_c);
        b_equal = findViewById(R.id.button_equal);
        result = String.valueOf(resultfield.getText());

        // inesrting numbers
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (act == 0) {
                    result = result + "1";
                    resultfield.setText(result);
                    first = Double.parseDouble(result);
                } else {
                    result = result + "1";
                    resultfield.setText(result);
                    second = Double.parseDouble(result);
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (act == 0) {
                    result = result + "2";
                    resultfield.setText(result);
                    first = Double.parseDouble(result);
                } else {
                    result = result + "2";
                    resultfield.setText(result);
                    second = Double.parseDouble(result);
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (act == 0) {
                    result = result + "3";
                    resultfield.setText(result);
                    first = Double.parseDouble(result);
                } else {
                    result = result + "3";
                    resultfield.setText(result);
                    second = Double.parseDouble(result);
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (act == 0) {
                    result = result + "4";
                    resultfield.setText(result);
                    first = Double.parseDouble(result);
                } else {
                    result = result + "4";
                    resultfield.setText(result);
                    second = Double.parseDouble(result);
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (act == 0) {
                    result = result + "5";
                    resultfield.setText(result);
                    first = Double.parseDouble(result);
                } else {
                    result = result + "5";
                    resultfield.setText(result);
                    second = Double.parseDouble(result);
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (act == 0) {
                    result = result + "6";
                    resultfield.setText(result);
                    first = Double.parseDouble(result);
                } if(act!=0) {
                    result = result + "6";
                    resultfield.setText(result);
                    second = Double.parseDouble(result);
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (act == 0) {
                    result = result + "7";
                    resultfield.setText(result);
                    first = Double.parseDouble(result);
                } else {
                    result = result + "7";
                    resultfield.setText(result);
                    second = Double.parseDouble(result);
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (act == 0) {
                    result = result + "8";
                    resultfield.setText(result);
                    first = Double.parseDouble(result);
                } else {
                    result = result + "8";
                    resultfield.setText(result);
                    second = Double.parseDouble(result);
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (act == 0) {
                    result = result + "9";
                    resultfield.setText(result);
                    first = Double.parseDouble(result);
                } else {
                    result = result + "9";
                    resultfield.setText(result);
                    second = Double.parseDouble(result);
                }
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (act == 0) {
                    result = result + "0";
                    resultfield.setText(result);
                    first = Double.parseDouble(result);
                } else {
                    result = result + "0";
                    resultfield.setText(result);
                    second = Double.parseDouble(result);
                }
            }
        });
        // Full-cleaning
        b_c.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                    first = 0;
                    second = 0;
                    act = 0;
                    result ="";
                    resultfield.setText(result);
            }
        });
        // Choosing math operation
            b_plus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    act = 1;
                    resultfield.setText("");result = "";
                    resultfield.setText(result);
                }
            });
        b_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                act = 2;
                result = "";
                resultfield.setText(result);
            }
        });
        b_multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                act = 3;
                resultfield.setText("");result = "";
                resultfield.setText(result);
            }
        });
        b_devide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                act = 4;
                result = "";
                resultfield.setText(result);
            }
        });
        b_power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                act = 5;
                result = "";
                resultfield.setText(result);
            }
        });
        b_sqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                act = 6;
                result = "";
                resultfield.setText(result);
            }
        });
        b_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                act = 7;
                result = "";
                resultfield.setText(result);
            }
        });
        b_pm.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (act == 0) {
                    first = first*(-1);
                    resultfield.setText(String.valueOf(first));
                } else {
                    second = second *(-1);
                    resultfield.setText(String.valueOf(second));
                }
            }
        });

        b_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (act){
                    case(1):
                        result = String.valueOf(first+second);
                        resultfield.setText(result);
                        first = Double.parseDouble(result);
                        break;
                    case(2):
                        result = String.valueOf(first-second);
                        resultfield.setText(result);
                        first = Double.parseDouble(result);

                        break;
                    case(3):
                        result = String.valueOf(first*second);
                        resultfield.setText(result);
                        first = Double.parseDouble(result);

                        break;
                    case(4):
                        result = String.valueOf(first/second);
                        resultfield.setText(result);
                        first = Double.parseDouble(result);

                        break;
                    case(5):
                        result = String.valueOf(Math.pow(first,second));
                        resultfield.setText(result);
                        first = Double.parseDouble(result);

                        break;
                    case(6):
                        result = String.valueOf(Math.pow(first,(1/second)));
                        resultfield.setText(result);
                        first = Double.parseDouble(result);

                        break;
                    case(7):
                        result = String.valueOf(logarifm(first,second ));
                        resultfield.setText(result);
                        first = Double.parseDouble(result);

                        break;

                }

            }

        });


    }

    private double logarifm(double first, double second) {

        return Math.log(first)/Math.log(second);
    }
}