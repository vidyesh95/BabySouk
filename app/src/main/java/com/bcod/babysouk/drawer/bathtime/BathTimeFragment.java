package com.bcod.babysouk.drawer.bathtime;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.bcod.babysouk.R;

public class BathTimeFragment extends Fragment {

    private BathTimeViewModel mBathTimeViewModel;

    public static BathTimeFragment newInstance() {
        return new BathTimeFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.bath_time_fragment, container, false);
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mBathTimeViewModel = new ViewModelProvider(this).get(BathTimeViewModel.class);
        // TODO: Use the ViewModel
    }

}
