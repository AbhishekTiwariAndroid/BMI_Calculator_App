package com.example.bmical;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtWeight,edtWeightFt,edtWeightIn;
        Button buttonCal;
        TextView txtResult;

        edtWeight = findViewById(R.id.edtWeight);
        edtWeightFt = findViewById(R.id.edtWeightFt);
        edtWeightIn = findViewById(R.id.edtWeightIn);
        buttonCal = findViewById(R.id.buttonCal);
        txtResult = findViewById(R.id.txtResult);

        buttonCal.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {
                int wt = Integer.parseInt(edtWeight.getText().toString());
                int ft = Integer.parseInt(edtWeightFt.getText().toString());
                int in = Integer.parseInt(edtWeightIn.getText().toString());

                int totalIn = ft*12 + in;

                double totalCm = totalIn*2.53;

                double totalM = totalCm/100;

                double bmi = wt/(totalM*totalM);

                if (bmi>25){
                    txtResult.setText("You're OverWeight!");
                } else if (bmi<18){
                    txtResult.setText("You're UnderWeight!");
                } else {
                    txtResult.setText("You're Healthy!");
                }

            }
        });

    }
}