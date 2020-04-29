package com.bcod.babysouk.drawer.carseats;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.bcod.babysouk.R;

public class CarSeatsFragment extends Fragment {

    private CarSeatsViewModel mCarSeatsViewModel;

    public static CarSeatsFragment newInstance() {
        return new CarSeatsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.car_seats_fragment, container, false);
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mCarSeatsViewModel = new ViewModelProvider(this).get(CarSeatsViewModel.class);
        // TODO: Use the ViewModel
    }

}
