package com.example.cryptoapp.Activities.Adapter;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.cryptoapp.Activities.domain.cryptoWallet;
import com.example.cryptoapp.R;
import com.majorik.sparklinelibrary.SparkLineLayout;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class CryptoAdapters extends RecyclerView.Adapter<CryptoAdapters.Viewholder> {
    ArrayList<cryptoWallet> cryptoWallets;
    DecimalFormat formatter;

    public CryptoAdapters(ArrayList<cryptoWallet> cryptoWallets) {
        this.cryptoWallets = cryptoWallets;
        formatter = new  DecimalFormat("###,###,###,###");
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_wallet, parent,false);
        return new Viewholder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.cryptonameTxt.setText(cryptoWallets.get(position).getCryptoname());
        holder.cryptoPriceTxt.setText("$"+formatter.format(cryptoWallets.get(position).getCryptoPrice()));
        holder.changePercentTxt.setText(cryptoWallets.get(position).getCryptoPercent()+"%");
        holder.propertyAmountTxt.setText("$"+formatter.format(cryptoWallets.get(position).getPropertyAmount()));
        holder.propertySizeTxt.setText(cryptoWallets.get(position).getPropertySize()+cryptoWallets.get(position).getCryptoSymbol());

        if(cryptoWallets.get(position).getCryptoPercent() > 0){
            holder.changePercentTxt.setTextColor(Color.parseColor("#12c737"));
            holder.lineChart.setSparkLineColor(Color.parseColor("#12c737"));
        } else if (cryptoWallets.get(position).getCryptoPercent() < 0) {
            holder.changePercentTxt.setTextColor(Color.parseColor("#fc0000"));
            holder.lineChart.setSparkLineColor(Color.parseColor("#fc0000"));
        } else {
            holder.changePercentTxt.setTextColor(Color.parseColor("#ffffff"));
            holder.lineChart.setSparkLineColor(Color.parseColor("#ffffff"));
        }
        int drawableResourceID = holder.itemView.getContext().getResources()
                .getIdentifier(cryptoWallets.get(position).getCryptoname(), "drawable", holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext())
                .load(drawableResourceID)
                .into(holder.logoCrypto);
        holder.lineChart.setData(cryptoWallets.get(position).getLineData());
    }



    @Override
    public int getItemCount() {
        return cryptoWallets.size();
    }
    public class Viewholder extends RecyclerView.ViewHolder{
        TextView cryptonameTxt,cryptoPriceTxt,changePercentTxt,propertySizeTxt,propertyAmountTxt;
        ImageView logoCrypto;
        SparkLineLayout lineChart;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            cryptonameTxt = itemView.findViewById(R.id.textView13);
            cryptoPriceTxt = itemView.findViewById(R.id.textView14);
            changePercentTxt = itemView.findViewById(R.id.textView15);
            propertySizeTxt =  itemView.findViewById(R.id.textView16);
            propertyAmountTxt = itemView.findViewById(R.id.textView17);
            logoCrypto = itemView.findViewById(R.id.bitcoinLogo);
            lineChart = itemView.findViewById(R.id.spark);
        }
    }
}
