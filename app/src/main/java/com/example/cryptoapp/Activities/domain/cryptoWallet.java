package com.example.cryptoapp.Activities.domain;

import java.util.ArrayList;

public class cryptoWallet {
    private String cryptoname;
    private String cryptoSymbol;
    private Double cryptoPrice;
    private Double cryptoPercent;
    private ArrayList<Integer> lineData;
    private Double propertyAmount;
    private Double propertySize;

    public cryptoWallet(String cryptoname, String cryptoSymbol, Double cryptoPrice, Double cryptoPercent, ArrayList<Integer> lineData, Double propertyAmount, Double propertySize) {
        this.cryptoname = cryptoname;
        this.cryptoSymbol = cryptoSymbol;
        this.cryptoPrice = cryptoPrice;
        this.cryptoPercent = cryptoPercent;
        this.lineData = lineData;
        this.propertyAmount = propertyAmount;
        this.propertySize = propertySize;
    }

    public String getCryptoname() {
        return cryptoname;
    }

    public void setCryptoname(String cryptoname) {
        this.cryptoname = cryptoname;
    }

    public String getCryptoSymbol() {
        return cryptoSymbol;
    }

    public void setCryptoSymbol(String cryptoSymbol) {
        this.cryptoSymbol = cryptoSymbol;
    }

    public Double getCryptoPrice() {
        return cryptoPrice;
    }

    public void setCryptoPrice(Double cryptoPrice) {
        this.cryptoPrice = cryptoPrice;
    }

    public Double getCryptoPercent() {
        return cryptoPercent;
    }

    public void setCryptoPercent(Double cryptoPercent) {
        this.cryptoPercent = cryptoPercent;
    }

    public ArrayList<Integer> getLineData() {
        return lineData;
    }

    public void setLineData(ArrayList<Integer> lineData) {
        this.lineData = lineData;
    }

    public Double getPropertyAmount() {
        return propertyAmount;
    }

    public void setPropertyAmount(Double propertyAmount) {
        this.propertyAmount = propertyAmount;
    }

    public Double getPropertySize() {
        return propertySize;
    }

    public void setPropertySize(Double propertySize) {
        this.propertySize = propertySize;
    }
}
