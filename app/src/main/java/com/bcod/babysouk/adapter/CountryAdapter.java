package com.bcod.babysouk.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bcod.babysouk.R;
import com.bcod.babysouk.model.CountryItem;
import com.bcod.babysouk.ui.account.settings.SettingsFragment;

import java.util.ArrayList;

public class CountryAdapter extends ArrayAdapter<CountryItem> {

    public CountryAdapter(@NonNull Context context,
                          @NonNull ArrayList<CountryItem> mCountryArrayList) {
        super(context, 0, mCountryArrayList);
    }

    // ctrl+o
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    private View initView(int position, View convertView, ViewGroup parent) {
        if (convertView==null) {
            convertView =
                    LayoutInflater.from(getContext()).inflate(R.layout.region_drop_down_menu_row,
                            parent, false);
        }
        ImageView imageViewFlag = convertView.findViewById(R.id.country_flag_image);
        TextView textViewCountryName = convertView.findViewById(R.id.country_name);
        TextView textViewCurrencyName = convertView.findViewById(R.id.currency_name);
        CountryItem currentItem = getItem(position);
        if (currentItem != null) {
            imageViewFlag.setImageResource(currentItem.getFlagImage());
            textViewCountryName.setText(currentItem.getCountryName());
            textViewCurrencyName.setText(currentItem.getCurrency());
        }
        return convertView;
    }
}
