package com.sdsmdg.pulkit.samplestaggeredview;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by pulkit on 3/6/17.
 */

public class CustomHorizontalAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    RecyclerView.ViewHolder viewHolder11;
    RecyclerView.ViewHolder viewHolder12;
    ArrayList<String> movies;

    CustomHorizontalAdapter(RecyclerView.ViewHolder viewHolder1, RecyclerView.ViewHolder viewHolder2, ArrayList<String> movie) {
        viewHolder11 = viewHolder1;
        viewHolder12 = viewHolder2;
        movies = movie;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case 1:
                return viewHolder11;
            case 2:
                return viewHolder12;
            default:
                return viewHolder11;
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType())
        {
            case 1:
            case 2:
            default:

        }
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position + 1;
    }
}
