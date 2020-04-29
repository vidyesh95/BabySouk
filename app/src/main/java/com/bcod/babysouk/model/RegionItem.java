package com.bcod.babysouk.model;

public class RegionItem {
    private String CountryName;
    private int FlagImage;
    private String Language;

    public RegionItem(String countryName, int flagImage, String language) {
        CountryName = countryName;
        FlagImage = flagImage;
        Language = language;
    }

    public String getCountryName() {
        return CountryName;
    }

    public int getFlagImage() {
        return FlagImage;
    }

    public String getLanguage() {
        return Language;
    }
}
