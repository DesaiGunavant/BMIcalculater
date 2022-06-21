package com.example.bmicalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String data, age, weight, hight;
    int Age;
    double Hight, Weight, bmi;
    TextView txtBMI, txthight, txtweight, txtage, txtWeight1, txtHight1, txtBmi, txtBmi1, txtBmi2;
    EditText edthight, edtweight, edtage;
    Button btnshow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBinding();
        initOnClick();
    }

    void initBinding() {
        txtBMI = findViewById(R.id.txtBMI);
        txthight = findViewById(R.id.txthight);
        txtweight = findViewById(R.id.txtweight);
        edthight = findViewById(R.id.edthight);
        edtweight = findViewById(R.id.edtweight);
        txtage = findViewById(R.id.txtage);
        edtage = findViewById(R.id.edtage);
        btnshow = findViewById(R.id.btnshow);
        txtWeight1 = findViewById(R.id.txtWeight1);
        txtHight1 = findViewById(R.id.txtHight1);
        txtBmi = findViewById(R.id.txtBmi);
        txtBmi1 = findViewById(R.id.txtBmi1);


    }

    void initOnClick() {

        btnshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                age = edtage.getText().toString();
                hight = edthight.getText().toString();
                weight = edtweight.getText().toString();

                Age = Integer.parseInt(age);
                Hight = Double.parseDouble(hight);
                Weight = Double.parseDouble(weight);
                Hight = Hight * 0.3048;
                bmi = Weight / (Hight * Hight);
                txtWeight1.setText("" + Weight);
                txtHight1.setText("" + Hight);
                txtBmi1.setText("" + bmi);
            }
        });
    }
}