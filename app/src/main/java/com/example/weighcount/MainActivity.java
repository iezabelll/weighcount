package com.example.weighcount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etberat = findViewById(R.id.isiberat);
        EditText ettinggi = findViewById(R.id.isitinggi);
        Button btnenter = findViewById(R.id.enter);

        btnenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double bb = Double.parseDouble(etberat.getText().toString());
                double tb = Double.parseDouble(ettinggi.getText().toString());
                double hasil = bb / (tb * tb);
                String status;

                if (hasil < 18.5){
                    status = "cacingan";
                } else if (hasil >= 18.5 && hasil <= 24.9){
                    status = "Normal (Ideal)";
                }else if (hasil >= 25.0 && hasil <= 29.9){
                    status = "Kelebihan Berat Badan";
                }else if (hasil >= 30.0){
                    status = "Kamu Gendut";
                }else{
                    status = "data diri mu tidak terbaca kamu bukan manusia";
                }

                btnenter.setText(status);

            }
        });
    }





}