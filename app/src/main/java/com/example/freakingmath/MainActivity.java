package com.example.freakingmath;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txtDeBai, txtDapAn, txtDiem;
    ImageButton btnDung, btnSai;
    Random random = new Random();
    int soHang_1, soHang_2, tong, diem = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtDiem = findViewById(R.id.textViewDiem);
        txtDapAn = findViewById(R.id.textViewDapAn);
        txtDeBai = findViewById(R.id.textViewDeBai);
        btnDung = findViewById(R.id.buttonDung);
        btnSai = findViewById(R.id.buttonSai);

        showDebai_DapAn();
        txtDiem.setText("Diem: " + Integer.toString(diem));

        btnDung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tong == (soHang_1+soHang_2)){
                    diem++;
                    txtDiem.setText("Diem: " + Integer.toString(diem));
                    Toast.makeText(MainActivity.this, "Ban da tra loi dung",Toast.LENGTH_SHORT).show();
                    showDebai_DapAn();
                }else{
                    Toast.makeText(MainActivity.this, "Ban da tra loi sai",Toast.LENGTH_SHORT).show();
                    showDebai_DapAn();
                }
            }
        });

        btnSai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tong != (soHang_1+soHang_2)){
                    diem++;
                    txtDiem.setText("Diem: " + Integer.toString(diem));
                    Toast.makeText(MainActivity.this, "Ban da tra loi dung",Toast.LENGTH_SHORT).show();
                    showDebai_DapAn();
                }else{
                    Toast.makeText(MainActivity.this, "Ban da tra loi sai",Toast.LENGTH_SHORT).show();
                    showDebai_DapAn();
                }
            }
        });

    }
    public void showDebai_DapAn(){
        soHang_1 = random.nextInt(10);
        soHang_1 = random.nextInt(10);
        txtDeBai.setText(Integer.toString(soHang_1) + " + "+ Integer.toString(soHang_2));

        tong = random.nextInt(20);
        txtDapAn.setText("= "+Integer.toString(tong));
    }

}