package com.bcod.babysouk.drawer.travelsouk;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.bcod.babysouk.R;

public class TravelSoukFragment extends Fragment {

    private TravelSoukViewModel mTravelSoukViewModel;

    public static TravelSoukFragment newInstance() {
        return new TravelSoukFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.travel_souk_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mTravelSoukViewModel = new ViewModelProvider(this).get(TravelSoukViewModel.class);
        // TODO: Use the ViewModel
    }

}
