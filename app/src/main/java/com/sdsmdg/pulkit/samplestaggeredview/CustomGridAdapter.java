package com.sdsmdg.pulkit.samplestaggeredview;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by pulkit on 6/6/17.
 */

public class CustomGridAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<GridHolderItems> mViewHolders;

    CustomGridAdapter(List<GridHolderItems> viewHolders) {
        mViewHolders = viewHolders;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return mViewHolders.get(viewType).mViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mViewHolders.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }
}
