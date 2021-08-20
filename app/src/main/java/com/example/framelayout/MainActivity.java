package com.example.framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txtNumber;
    EditText edtNumber1,edtNumber2;
    Button btnRandom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        btnRandom.setOnClickListener(new View.OnClickListener() {
            // chua bat 2 loi, loi1: nguoi dung chi nhap mot so; loi2: nguoi dung nhap chu
            @Override
            public void onClick(View v) {
                String chuoi1 = edtNumber1.getText().toString();
                String chuoi2 = edtNumber2.getText().toString();

                // ep kieu chuoi sang so
                int min = Integer.parseInt(chuoi1);
                int max = Integer.parseInt(chuoi2);
                // tao so ngau nhien
                Random random = new Random();
                int number =random.nextInt(max-min +1)+ min;// 0 ->4
                txtNumber.setText(String.valueOf(number));// hoac (nuber +"")
            }
        });
    }
    private void AnhXa(){
        txtNumber = (TextView) findViewById(R.id.textView);
        btnRandom = (Button) findViewById(R.id.buttonrandom);
        edtNumber1 = (EditText) findViewById(R.id.editTextNumberOne);
        edtNumber2 = (EditText) findViewById(R.id.editTextNumberTwo);
    }
}