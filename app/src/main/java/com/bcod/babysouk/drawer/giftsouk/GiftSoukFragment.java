package com.bcod.babysouk.drawer.giftsouk;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.bcod.babysouk.R;

public class GiftSoukFragment extends Fragment {

    private GiftSoukViewModel mGiftSoukViewModel;

    public static GiftSoukFragment newInstance() {
        return new GiftSoukFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.gift_souk_fragment, container, false);
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mGiftSoukViewModel = new ViewModelProvider(this).get(GiftSoukViewModel.class);
        // TODO: Use the ViewModel
    }

}
