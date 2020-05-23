package com.candra.ujankedua_dicoding.DataAdpater;

import android.os.Parcel;
import android.os.Parcelable;

public class Film implements Parcelable {
    private String judul;
    private String waktu;
    private String pg;
    private String negara;
    private String tahun;
    private String tanggalTahunBulan;
    private String judulKecil;
    private int photo;
    private String deskripsi;
    private String petugasScreen;
    private String direktur;
    private String drama;

    public Film() {

    }

    public void setDrama(String drama) {
        this.drama = drama;
    }

    public String getDrama() {
        return drama;
    }

    public String getJudul() {
        return judul;
    }

    public String getWaktu() {
        return waktu;
    }

    public String getPg() {
        return pg;
    }

    public String getNegara() {
        return negara;
    }

    public String getTahun() {
        return tahun;
    }

    public String getTanggalTahunBulan() {
        return tanggalTahunBulan;
    }

    public String getJudulKecil() {
        return judulKecil;
    }

    public int getPhoto() {
        return photo;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getPetugasScreen() {
        return petugasScreen;
    }

    public String getDirektur() {
        return direktur;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public void setPg(String pg) {
        this.pg = pg;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public void setTanggalTahunBulan(String tanggalTahunBulan) {
        this.tanggalTahunBulan = tanggalTahunBulan;
    }

    public void setJudulKecil(String judulKecil) {
        this.judulKecil = judulKecil;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void setPetugasScreen(String petugasScreen) {
        this.petugasScreen = petugasScreen;
    }

    public void setDirektur(String direktur) {
        this.direktur = direktur;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(judul);
        dest.writeString(waktu);
        dest.writeString(pg);
        dest.writeString(negara);
        dest.writeString(tahun);
        dest.writeString(tanggalTahunBulan);
        dest.writeString(judulKecil);
        dest.writeInt(photo);
        dest.writeString(deskripsi);
        dest.writeString(petugasScreen);
        dest.writeString(direktur);
    }
    protected Film(Parcel in) {
        judul = in.readString();
        waktu = in.readString();
        pg = in.readString();
        negara = in.readString();
        tahun = in.readString();
        tanggalTahunBulan = in.readString();
        judulKecil = in.readString();
        photo = in.readInt();
        deskripsi = in.readString();
        petugasScreen = in.readString();
        direktur = in.readString();
        drama = in.readString();
    }

    public static Creator<Film> getCREATOR() {
        return CREATOR;
    }

    public static final Creator<Film> CREATOR = new Creator<Film>() {
        @Override
        public Film createFromParcel(Parcel in) {
            return new Film(in);
        }

        @Override
        public Film[] newArray(int size) {
            return new Film[size];
        }
    };
}
