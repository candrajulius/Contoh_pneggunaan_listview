package com.candra.ujankedua_dicoding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.candra.ujankedua_dicoding.DataAdpater.Film;

import org.w3c.dom.Text;

import java.util.Objects;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Candra Julius Sinaga");
            getSupportActionBar().setSubtitle("Deskripsi");
        }

        Intent intent = getIntent();
        Film film = intent.getParcelableExtra("saya");

        int image = Objects.requireNonNull(film).getPhoto();
        String waktu1 = film.getWaktu();
        String waktu = film.getTahun();
        String judul = film.getJudul();
        String pg = film.getPg();
        String tahun = film.getTanggalTahunBulan();
        String negara = film.getNegara();
        String drama = film.getDrama();
        String sreenplay = film.getPetugasScreen();
        String direktur = film.getDirektur();
        String deskripsi = film.getDeskripsi();

        ImageView image1 = findViewById(R.id.gambar);
        TextView satu = findViewById(R.id.satu);
        TextView dua = findViewById(R.id.dua);
        TextView tiga = findViewById(R.id.tiga);
        TextView empat = findViewById(R.id.empat);
        TextView lima = findViewById(R.id.lima);
        TextView enam = findViewById(R.id.enam);
        TextView screen = findViewById(R.id.screenPlay);
        TextView direk = findViewById(R.id.direkutr);
        TextView des = findViewById(R.id.deskripsi);
        TextView tuju = findViewById(R.id.tujuh);

        image1.setImageResource(image);
        satu.setText(judul);
        dua.setText(waktu);
        tiga.setText(waktu1);
        empat.setText(pg);
        lima.setText(tahun);
        enam.setText(negara);
        tuju.setText(drama);
        screen.setText(sreenplay);
        direk.setText(direktur);
        des.setText(deskripsi);

    }
}
