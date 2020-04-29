package com.bcod.babysouk;

import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bcod.babysouk.adapter.NavigationAdapter;
import com.bcod.babysouk.adapter.SubNavigationAdapter;
import com.bcod.babysouk.databinding.ActivityMainBinding;
import com.bcod.babysouk.model.NavigationItem;
import com.bcod.babysouk.model.SubNavigationItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = activityMainBinding.getRoot();
        setContentView(view);
        setSupportActionBar(activityMainBinding.toolbar);

        initNavigationRecyclerView();
        //initSubNavigationRecyclerView();

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,
                activityMainBinding.drawerLayout, activityMainBinding.toolbar, R.string.navigation_drawer_open,
                R.string.navigation_drawer_close){

            /** Called when a drawer has settled in a completely closed state. */
            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    int flags = getWindow().getDecorView().getSystemUiVisibility(); // get current flag
                    flags |= View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;   // add LIGHT_STATUS_BAR to flag
                    getWindow().getDecorView().setSystemUiVisibility(flags);
                }
            }

            /** Called when a drawer has settled in a completely open state.*/
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    int flags = getWindow().getDecorView().getSystemUiVisibility(); // get current flag
                    flags = flags ^ View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR; // use XOR here for remove LIGHT_STATUS_BAR from flags
                    getWindow().getDecorView().setSystemUiVisibility(flags);
                }
            }
        };
        activityMainBinding.drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        NavController navController = Navigation.findNavController(this,
                R.id.nav_host_fragment);
        NavigationUI.setupWithNavController(activityMainBinding.bottomNavView, navController);
    }

    private void initNavigationRecyclerView() {
        ArrayList<NavigationItem> navigationItemList = new ArrayList<>();
        navigationItemList.add(new NavigationItem(R.string.menu_baby_essentials, true));
        navigationItemList.add(new NavigationItem(R.string.menu_stroller_souk, false));
        navigationItemList.add(new NavigationItem(R.string.menu_car_seats, false));
        navigationItemList.add(new NavigationItem(R.string.menu_feed, false));
        navigationItemList.add(new NavigationItem(R.string.menu_bath_time, false));
        navigationItemList.add(new NavigationItem(R.string.menu_play_time, false));
        navigationItemList.add(new NavigationItem(R.string.menu_back_to_school, false));
        navigationItemList.add(new NavigationItem(R.string.menu_travel_souk, false));
        navigationItemList.add(new NavigationItem(R.string.menu_gift_souk, false));
        navigationItemList.add(new NavigationItem(R.string.menu_outlet, false));
        navigationItemList.add(new NavigationItem(R.string.menu_by_brand, true));
        navigationItemList.add(new NavigationItem(R.string.menu_contact, false));

        activityMainBinding.navViewCustom.navigationMenu.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        RecyclerView.Adapter mAdapter = new NavigationAdapter(navigationItemList);
        activityMainBinding.navViewCustom.navigationMenu.setLayoutManager(mLayoutManager);
        activityMainBinding.navViewCustom.navigationMenu.setAdapter(mAdapter);
        DividerItemDecoration dividerItemDecoration =
                new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        activityMainBinding.navViewCustom.navigationMenu.addItemDecoration(dividerItemDecoration);
    }

    private void initSubNavigationRecyclerView() {
        ArrayList<SubNavigationItem> subNavigationItemList = new ArrayList<>();
        subNavigationItemList.add(new SubNavigationItem(R.string.sub_menu_baby_essentials,
                false));
        subNavigationItemList.add(new SubNavigationItem(R.string.sub_menu_clothing_and_accessories,
                false));
        subNavigationItemList.add(new SubNavigationItem(R.string.sub_menu_decor,
                false));
        subNavigationItemList.add(new SubNavigationItem(R.string.sub_menu_carriers_and_wraps,
                false));
        subNavigationItemList.add(new SubNavigationItem(R.string.sub_menu_sleep_essentials,
                false));
        subNavigationItemList.add(new SubNavigationItem(R.string.sub_menu_active_and_safe_parenting,
                false));
        subNavigationItemList.add(new SubNavigationItem(R.string.sub_menu_all_about_mum,
                false));

        RecyclerView mSubRecyclerView = findViewById(R.id.expanded_menu_layout);
        mSubRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mSubLayoutManager = new LinearLayoutManager(this);
        RecyclerView.Adapter mSubAdapter = new SubNavigationAdapter(subNavigationItemList);
        mSubRecyclerView.setLayoutManager(mSubLayoutManager);
        mSubRecyclerView.setAdapter(mSubAdapter);
        DividerItemDecoration subDividerItemDecoration =
                new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        mSubRecyclerView.addItemDecoration(subDividerItemDecoration);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_search:
                Toast.makeText(this, "search selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_cart:
                Toast.makeText(this, "cart selected", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        if (activityMainBinding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            activityMainBinding.drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
