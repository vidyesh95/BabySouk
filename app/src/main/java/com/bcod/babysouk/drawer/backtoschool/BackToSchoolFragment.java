package com.bcod.babysouk.drawer.backtoschool;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.bcod.babysouk.R;

public class BackToSchoolFragment extends Fragment {

    private BackToSchoolViewModel mBackToSchoolViewModel;

    public static BackToSchoolFragment newInstance() {
        return new BackToSchoolFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.
                inflate(R.layout.back_to_school_fragment, container, false);
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mBackToSchoolViewModel = new ViewModelProvider(this).
                get(BackToSchoolViewModel.class);
        // TODO: Use the ViewModel
    }

}
