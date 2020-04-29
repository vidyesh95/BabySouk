package com.bcod.babysouk.drawer.outlet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.bcod.babysouk.R;

public class OutletFragment extends Fragment {

    private OutletViewModel mOutletViewModel;

    public static OutletFragment newInstance() {
        return new OutletFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.outlet_fragment, container, false);
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mOutletViewModel = new ViewModelProvider(this).get(OutletViewModel.class);
        // TODO: Use the ViewModel
    }

}
