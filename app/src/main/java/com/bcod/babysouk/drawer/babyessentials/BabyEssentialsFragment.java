package com.bcod.babysouk.drawer.babyessentials;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.bcod.babysouk.R;

public class BabyEssentialsFragment extends Fragment {

    private BabyEssentialsViewModel mBabyEssentialsViewModel;

    public static BabyEssentialsFragment newInstance() {
        return new BabyEssentialsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.
                inflate(R.layout.baby_essentials_fragment, container, false);
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mBabyEssentialsViewModel =
                new ViewModelProvider(this).get(BabyEssentialsViewModel.class);
        // TODO: Use the ViewModel
    }

}
