package com.bcod.babysouk.adapter;

import android.animation.ObjectAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bcod.babysouk.R;
import com.bcod.babysouk.model.SubNavigationItem;

import java.util.ArrayList;

public class SubNavigationAdapter extends RecyclerView.Adapter {

    private ArrayList<SubNavigationItem> mSubNavigationItemArrayList;

    public SubNavigationAdapter(ArrayList<SubNavigationItem> subNavigationItemArrayList) {
        mSubNavigationItemArrayList = subNavigationItemArrayList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view;
        if (viewType == 1) {
            view = layoutInflater.
                    inflate(R.layout.sub_navigation_row_with_child, parent,false);
            return new SubNavigationAdapter.SubNavigationViewHolderWithChild(view);
        }
        view = layoutInflater.
                inflate(R.layout.sub_navigation_row_without_child, parent, false);
        return new SubNavigationAdapter.SubNavigationViewHolderWithoutChild(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        SubNavigationItem currentSubItem = mSubNavigationItemArrayList.get(position);
        if (mSubNavigationItemArrayList.get(position).isSubExpandable()) {
            // bind viewHolder 1
            SubNavigationAdapter.SubNavigationViewHolderWithChild viewHolderWithChild =
                    (SubNavigationAdapter.SubNavigationViewHolderWithChild) holder;
            viewHolderWithChild.mSubTextView.setText(currentSubItem.getSubText());
            boolean isLayoutExpanded =
                    mSubNavigationItemArrayList.get(position).isSubLayoutExpanded();
            ((SubNavigationAdapter.SubNavigationViewHolderWithChild) holder).
                    expandableConstraintLayout.setVisibility(isLayoutExpanded ?
                    View.VISIBLE : View.GONE);
        } else {
            // bind viewHolder 2
            SubNavigationAdapter.SubNavigationViewHolderWithoutChild viewHolderWithoutChild =
                    (SubNavigationAdapter.SubNavigationViewHolderWithoutChild) holder;
            viewHolderWithoutChild.mTextView.setText(currentSubItem.getSubText());
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (mSubNavigationItemArrayList.get(position).isSubExpandable()) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public int getItemCount() {
        return mSubNavigationItemArrayList.size();
    }

    class SubNavigationViewHolderWithChild extends RecyclerView.ViewHolder {
        ConstraintLayout expandableConstraintLayout;
        TextView mSubTextView;
        ConstraintLayout layoutWithChild;
        ImageView subIndicatorImage;
        SubNavigationViewHolderWithChild(@NonNull View itemView) {
            super(itemView);
            mSubTextView = itemView.findViewById(R.id.sub_base_menu_text_with_child);
            expandableConstraintLayout = itemView.findViewById(R.id.sub_expanded_menu_layout);
            layoutWithChild = itemView.findViewById(R.id.sub_navigation_item_with_child);
            subIndicatorImage = itemView.findViewById(R.id.sub_view_inflate_indicator);
            layoutWithChild.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    SubNavigationItem subNavigationItem =
                            mSubNavigationItemArrayList.get(getAdapterPosition());
                    subNavigationItem.setSubLayoutExpanded(!subNavigationItem.isSubLayoutExpanded());
                    notifyItemChanged(getAdapterPosition());
                    if (!subNavigationItem.isSubLayoutExpanded()) {
                        changeRotate(subIndicatorImage, 0f, 90f).start();
                    } else {
                        changeRotate(subIndicatorImage, 90f, 0f).start();
                    }
                }
            });
        }
    }

    static class SubNavigationViewHolderWithoutChild extends RecyclerView.ViewHolder {
        TextView mTextView;
        SubNavigationViewHolderWithoutChild(@NonNull View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.sub_base_menu_text_without_child);
        }
    }

    private ObjectAnimator changeRotate(ImageView indicatorImage, float from, float to) {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(indicatorImage, "rotation", from, to);
        objectAnimator.setDuration(300);
        objectAnimator.setInterpolator(new LinearInterpolator());
        return objectAnimator;
    }
}
