package com.bcod.babysouk.drawer.strollersouk;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.bcod.babysouk.R;

public class StrollerSoukFragment extends Fragment {

    private StrollerSoukViewModel mStrollerSoukViewModel;

    public static StrollerSoukFragment newInstance() {
        return new StrollerSoukFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.stroller_souk_fragment, container, false);
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mStrollerSoukViewModel = new ViewModelProvider(this).get(StrollerSoukViewModel.class);
        // TODO: Use the ViewModel
    }

}
