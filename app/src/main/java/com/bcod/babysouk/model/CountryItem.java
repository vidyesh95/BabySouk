package com.bcod.babysouk.model;

public class CountryItem {
    private int flagImage;
    private int countryName;
    private int Currency;

    public CountryItem(int flagImage, int countryName, int currency) {
        this.flagImage = flagImage;
        this.countryName = countryName;
        Currency = currency;
    }

    public int getFlagImage() {
        return flagImage;
    }

    public int getCountryName() {
        return countryName;
    }

    public int getCurrency() {
        return Currency;
    }
}
