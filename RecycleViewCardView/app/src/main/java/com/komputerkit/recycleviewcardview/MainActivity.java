package com.komputerkit.recycleviewcardview;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    SiswaAdapter adapter;
    List<Siswa> siswaList;
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
        isiData();
    }
    public void load(){
        recyclerView = findViewById(R.id.rcvSiswa);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void isiData(){
        siswaList = new ArrayList<Siswa>();
        siswaList.add(new Siswa("Asep","Sidoarjo"));
        siswaList.add(new Siswa("Andre","Sidoarjo"));
        siswaList.add(new Siswa("Arbles","Sidoarjo"));
        siswaList.add(new Siswa("Kirito","Sidoarjo"));
        siswaList.add(new Siswa("Heimdal","Sidoarjo"));
        siswaList.add(new Siswa("Dafa","Sidoarjo"));
        siswaList.add(new Siswa("Asep2","Sidoarjo"));
        siswaList.add(new Siswa("Asep3","Sidoarjo"));
        siswaList.add(new Siswa("Asep4","Sidoarjo"));
        siswaList.add(new Siswa("Asep5","Sidoarjo"));
        siswaList.add(new Siswa("Asep6","Sidoarjo"));
        siswaList.add(new Siswa("Asep7","Sidoarjo"));
        siswaList.add(new Siswa("Asep8","Sidoarjo"));
        siswaList.add(new Siswa("Asep9","Sidoarjo"));
        siswaList.add(new Siswa("Asep10","Sidoarjo"));
        siswaList.add(new Siswa("Asep11","Sidoarjo"));
        siswaList.add(new Siswa("Asep12","Sidoarjo"));
        siswaList.add(new Siswa("Asep13","Sidoarjo"));
        siswaList.add(new Siswa("Asep14","Sidoarjo"));
        siswaList.add(new Siswa("Asep15","Sidoarjo"));
        siswaList.add(new Siswa("Asep16","Sidoarjo"));
        siswaList.add(new Siswa("Asep17","Sidoarjo"));
        siswaList.add(new Siswa("Asep18","Sidoarjo"));
        siswaList.add(new Siswa("Asep19","Sidoarjo"));
        siswaList.add(new Siswa("Asep20","Sidoarjo"));
        siswaList.add(new Siswa("Asep21","Sidoarjo"));
        siswaList.add(new Siswa("Asep22","Sidoarjo"));
        siswaList.add(new Siswa("Asep23","Sidoarjo"));
        siswaList.add(new Siswa("Asep24","Sidoarjo"));
        siswaList.add(new Siswa("Asep25","Sidoarjo"));
        siswaList.add(new Siswa("Asep26","Sidoarjo"));

        adapter = new SiswaAdapter(this,siswaList);
        recyclerView.setAdapter(adapter);
    }

    public void btnTambah(View view) {
        siswaList.add(new Siswa("Asep Gemink","Sidoarjo"));
        adapter.notifyDataSetChanged();
    }
}