package com.sdsmdg.pulkit.samplestaggeredview;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pulkit on 3/6/17.
 */

public class CustomStaggeredAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<String> movies;
    List<RecyclerView.ViewHolder> mViewHolders;

    CustomStaggeredAdapter(List<RecyclerView.ViewHolder> viewHolders, ArrayList<String> movie) {
        mViewHolders = viewHolders;
        movies = movie;
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
