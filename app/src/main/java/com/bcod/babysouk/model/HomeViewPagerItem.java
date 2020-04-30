package com.bcod.babysouk.model;

import com.bcod.babysouk.R;

import java.util.ArrayList;
import java.util.List;

public class HomeViewPagerItem {
    public int images;
    public int viewtype;

    public HomeViewPagerItem(int images, int viewtype) {
        this.images = images;
        this.viewtype = viewtype;
    }

    public static List<HomeViewPagerItem> getTestData() {
        List<HomeViewPagerItem> list = new ArrayList<>();
        list.add(new HomeViewPagerItem(R.drawable.australia, 1));
        list.add(new HomeViewPagerItem(R.drawable.united_states, 3));
        list.add(new HomeViewPagerItem(R.drawable.india, 3));
        return list;
    }
}
