package com.sdsmdg.pulkit.samplestaggeredview;

import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by pulkit on 9/6/17.
 */

public class GridHelperAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<CustomGridHolder> mViewHolders;

    GridHelperAdapter(List<CustomGridHolder> viewHolders) {
        mViewHolders = viewHolders;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return mViewHolders.get(viewType);
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
