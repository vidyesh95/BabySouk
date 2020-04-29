package com.bcod.babysouk.ui.account;

import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bcod.babysouk.R;
import com.bcod.babysouk.databinding.AccountFragmentBinding;
import com.bcod.babysouk.ui.account.address.AddressBookFragment;

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
        binding.accountAddressBook.setOnClickListener(v -> {

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
