package com.candra.ujankedua_dicoding.DataAdpater;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.candra.ujankedua_dicoding.R;

import java.io.FileInputStream;
import java.util.ArrayList;

public class DataAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Film> kamu = new ArrayList<>();

    public void setContext(Context context) {
        this.context = context;
    }

    public void setKamu(ArrayList<Film> kamu) {
        this.kamu = kamu;
    }

    public DataAdapter(Context context, ArrayList<Film> kamu) {
        this.context = context;
        this.kamu = kamu;
    }

    @Override
    public int getCount() {
        return kamu.size();
    }

    @Override
    public Object getItem(int position) {
        return kamu.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View layout = convertView;
        if (layout == null) {
            layout = LayoutInflater.from(context).inflate(R.layout.my_item_row, parent, false);
        }
        ViewHolder viewHolder = new ViewHolder(layout);
        Film film = (Film) getItem(position);
        viewHolder.bind(film);
        return layout;
    }

    private class ViewHolder{
        private ImageView poster1;
        private TextView satu,dua,tiga,empat,lima,enam;
        ViewHolder(View layout){
            poster1 = layout.findViewById(R.id.poster);
            satu = layout.findViewById(R.id.judul);
            dua = layout.findViewById(R.id.tanggal);
            tiga = layout.findViewById(R.id.pg);
            empat = layout.findViewById(R.id.tanggal2);
            lima = layout.findViewById(R.id.asal);
            enam = layout.findViewById(R.id.aksi);

        }
        void bind (Film film){
            poster1.setImageResource(film.getPhoto());
            satu.setText(film.getJudul());
            dua.setText(film.getTahun());
            tiga.setText(film.getPg());
            empat.setText(film.getTanggalTahunBulan());
            lima.setText(film.getNegara());
            enam.setText(film.getDrama());
        }
    }


}
