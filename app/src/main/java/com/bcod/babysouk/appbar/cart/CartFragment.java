package com.bcod.babysouk.appbar.cart;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.bcod.babysouk.R;
import com.bcod.babysouk.databinding.ActivityMainBinding;
import com.bcod.babysouk.databinding.CartFragmentBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class CartFragment extends Fragment {

    private CartViewModel mCartViewModel;
    private TextView delivery_address;

    public static CartFragment newInstance() {
        return new CartFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.cart_fragment, container, false);
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mCartViewModel = new ViewModelProvider(this).get(CartViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        BottomNavigationView bottomNavigationView = getActivity().findViewById(R.id.bottom_nav_view);
        bottomNavigationView.setVisibility(View.GONE);

        delivery_address = view.findViewById(R.id.cart_delivery_address);
        delivery_address.setOnClickListener(view1 -> ((your_Address)getActivity()).yourDeliveryAdress());

    }

    public interface your_Address{
        void yourDeliveryAdress();
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        delivery_address = null;
    }


}
