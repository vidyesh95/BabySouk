package com.bcod.babysouk.order;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bcod.babysouk.R;

public class ItemViewFragment extends Fragment {

    private ItemViewViewModel mItemViewViewModel;

    public static ItemViewFragment newInstance() {
        return new ItemViewFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.item_view_fragment, container, false);
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mItemViewViewModel = new ViewModelProvider(this).get(ItemViewViewModel.class);
        // TODO: Use the ViewModel
    }

}
