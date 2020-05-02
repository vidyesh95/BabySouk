package com.bcod.babysouk.ui.account;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.bcod.babysouk.databinding.AccountFragmentBinding;

public class AccountFragment extends Fragment {

    private AccountFragmentBinding binding;
    private AccountViewModel mAccountViewModel;

    public static AccountFragment newInstance() {
        return new AccountFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = AccountFragmentBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        binding.accountProfile.setOnClickListener(v -> {

        });
        binding.accountOrders.setOnClickListener(v -> {

        });
        binding.accountAddressBook.setOnClickListener(v -> {

        });
        binding.accountContactUs.setOnClickListener(v -> {

        });
        binding.accountRateOurApp.setOnClickListener(v -> {

        });
        binding.accountSettings.setOnClickListener(v -> {

        });
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mAccountViewModel = new ViewModelProvider(this).get(AccountViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
