package com.example.cryptoapp.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cryptoapp.Activities.Adapter.CryptoAdapters;
import com.example.cryptoapp.Activities.domain.cryptoWallet;
import com.example.cryptoapp.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewWallet();
    }

    private void recyclerViewWallet() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView = findViewById(R.id.view);
        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<cryptoWallet> cryptoWalletArrayList = new ArrayList<>();
        ArrayList<Integer> lineData = new ArrayList<>();
        lineData.add(1000);
        lineData.add(1100);
        lineData.add(1200);
        lineData.add(1100);

        ArrayList<Integer> lineData2 = new ArrayList<>();
        lineData2.add(2100);
        lineData2.add(2500);
        lineData2.add(2000);
        lineData2.add(1000);

        ArrayList<Integer> lineData3 = new ArrayList<>();
        lineData3.add(500);
        lineData3.add(800);
        lineData3.add(900);
        lineData3.add(1000);

        ArrayList<Integer> lineData4 = new ArrayList<>();
        lineData4.add(500);
        lineData4.add(800);
        lineData4.add(900);
        lineData4.add(1000);


        cryptoWalletArrayList.add(new cryptoWallet("bitcoin","BTC", 27000.00,25.3, lineData, 12343.56, 0.123));
        cryptoWalletArrayList.add(new cryptoWallet("ethereum","ETH", 12000.00,-0.23, lineData2, 2343.56, 0.1234));
        cryptoWalletArrayList.add(new cryptoWallet("trox","UT", 700.00,-3.23, lineData3, 1233.56, 0.123));
        cryptoWalletArrayList.add(new cryptoWallet("usdt","UT", 700.00,-3.23, lineData4, 1233.56, 0.123));
        cryptoWalletArrayList.add(new cryptoWallet("bnb","UT", 700.00,-3.23, lineData3, 1233.56, 0.123));

        adapter = new CryptoAdapters(cryptoWalletArrayList);
        recyclerView.setAdapter(adapter);
    }
}