package com.komputerkit.kalkulator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView tvHasil;
    EditText etBil1, etBil2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        load();
    }
    public void load(){
        tvHasil = findViewById(R.id.tvHasil);
        etBil1 = findViewById(R.id.etBil1);
        etBil2 = findViewById(R.id.etBil2);
    }
    public void btnJumlah(View view){
        if (etBil1.getText().toString().equals("") || etBil2.getText().toString().equals("")){
            Toast.makeText(this, "Ada Bilangan Kosong", Toast.LENGTH_SHORT).show();
        }else {

            double bil1 = Double.parseDouble(etBil1.getText().toString());
            double bil2 = Double.parseDouble(etBil2.getText().toString());

            double hasil = bil1 + bil2;

            tvHasil.setText(hasil + "");
        }
    }
    public void btnPengurangan(View view){
        if (etBil1.getText().toString().equals("") || etBil2.getText().toString().equals("")){
            Toast.makeText(this, "Ada Bilangan Kosong", Toast.LENGTH_SHORT).show();
        }else {

            double bil1 = Double.parseDouble(etBil1.getText().toString());
            double bil2 = Double.parseDouble(etBil2.getText().toString());

            double hasil = bil1 - bil2;

            tvHasil.setText(hasil + "");
        }
    }
    public void btnPerkalian(View view){
        if (etBil1.getText().toString().equals("") || etBil2.getText().toString().equals("")){
            Toast.makeText(this, "Ada Bilangan Kosong", Toast.LENGTH_SHORT).show();
        }else {

            double bil1 = Double.parseDouble(etBil1.getText().toString());
            double bil2 = Double.parseDouble(etBil2.getText().toString());

            double hasil = bil1 * bil2;

            tvHasil.setText(hasil + "");
        }
    }
    public void btnPembagian(View view){
        if (etBil1.getText().toString().equals("") || etBil2.getText().toString().equals("")){
            Toast.makeText(this, "Ada Bilangan Kosong", Toast.LENGTH_SHORT).show();
        }else {

            double bil1 = Double.parseDouble(etBil1.getText().toString());
            double bil2 = Double.parseDouble(etBil2.getText().toString());

            double hasil = bil1 / bil2;

            tvHasil.setText(hasil + "");
        }
    }
}