package com.bcod.babysouk.adapter;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.bcod.babysouk.model.HomeViewPagerItem;
import com.youth.banner.adapter.BannerAdapter;

import java.util.List;

public class HomeViewPagerAdapter extends BannerAdapter<HomeViewPagerItem, HomeViewPagerAdapter.BannerViewHolder> {

    public HomeViewPagerAdapter(List<HomeViewPagerItem> datas) {
        super(datas);
    }

    @Override
    public HomeViewPagerAdapter.BannerViewHolder onCreateHolder(ViewGroup parent, int viewType) {
        ImageView imageView = new ImageView(parent.getContext());
        //注意，必须设置为match_parent，这个是viewpager2强制要求的
        imageView.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return new BannerViewHolder(imageView);
    }

    @Override
    public void onBindView(BannerViewHolder holder, HomeViewPagerItem data, int position, int size) {
        holder.imageView.setImageResource(data.images);

    }


    static class BannerViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        BannerViewHolder(ImageView imageView) {
            super(imageView);
            this.imageView = imageView;

        }
    }
}
