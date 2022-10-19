package com.example.menumakanan;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rec_Makanan;
    private ArrayList <Kuliner> listMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rec_Makanan = findViewById(R.id.rec_Makanan);
        initData();

        // memanggil class KulinerAdapter agar menu muncul
        rec_Makanan.setAdapter(new KulinerAdapter(listMakanan));
        rec_Makanan.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData() {
        this.listMakanan = new ArrayList<>();
        listMakanan.add(new Kuliner("Pecel Lele",
                "Rp. 15.000",
                "Terdiri dari ikan lele dan sambal beserta lalapannya.",
                R.drawable.pecelele));

        listMakanan.add(new Kuliner("Nasi Goreng Mercon",
                "Rp. 14.500",
                "Nasi goreng yang lebih pedas dari nasi goreng biasanya, lvl 1-10",
                R.drawable.nasgormercon));

        listMakanan.add(new Kuliner("Ayam Geprek Keju",
                "Rp. 20.000",
                "Ayam yang digeprek dengan keju di atasnya, lvl 1-10",
                R.drawable.geprekeju));
        listMakanan.add(new Kuliner("Kari Ayam",
                "Rp. 17.500",
                "Ayam yang direbus dalam bawang bombai dan saus dengan rempah-rempah",
                R.drawable.kariayam));
        listMakanan.add(new Kuliner("Tahu Bulat",
                "Rp. 500",
                "Tahu bulat di goreng dadakan",
                R.drawable.tahubulat));
        listMakanan.add(new Kuliner("Salad Buah",
                "Rp. 12.000",
                "Salad dengan berbagai macam pilihan buah",
                R.drawable.saladbuah));
    }


}