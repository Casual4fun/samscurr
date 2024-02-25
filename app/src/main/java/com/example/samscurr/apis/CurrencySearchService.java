package com.example.samscurr.apis;

public class CurrencySearchService
{
    Float usd;
    Float eur;
    Float cny;
    Float byn;

//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }

//    String date;

    public Float getBYN() {
        return byn;
    }

    public void setBYN(Float byn) {
        this.byn = byn;
    }

    public Float getUSD() {
        return usd;
    }

    public void setUSD(Float usd) {
        this.usd = usd;
    }

    public Float getEUR() {
        return eur;
    }

    public void setEUR(Float eur) {
        this.eur = eur;
    }

    public Float getCNY() {
        return cny;
    }

    public void setCNY(Float cny) {
        this.cny = cny;
    }


    public CurrencySearchService(Float usd, Float byn, Float cny, Float eur) {
        this.usd = usd;
        this.byn = byn;
        this.cny = cny;
        this.eur = eur;
    }
}
