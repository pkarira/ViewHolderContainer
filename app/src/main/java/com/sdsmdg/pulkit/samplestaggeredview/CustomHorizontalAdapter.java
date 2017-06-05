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
    RecyclerView.ViewHolder viewHolder13;
    RecyclerView.ViewHolder viewHolder14;
    ArrayList<String> movies;

    CustomHorizontalAdapter(RecyclerView.ViewHolder viewHolder1, RecyclerView.ViewHolder viewHolder2,RecyclerView.ViewHolder viewHolder3,RecyclerView.ViewHolder viewHolder4, ArrayList<String> movie) {
        viewHolder11 = viewHolder1;
        viewHolder12 = viewHolder2;
        viewHolder13 = viewHolder3;
        viewHolder14 = viewHolder4;
        movies = movie;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case 1:
                return viewHolder11;
            case 2:
                return viewHolder12;
            case 3:
                return viewHolder13;
            case 4:
                return viewHolder14;
            default:
                return viewHolder11;
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    @Override
    public int getItemViewType(int position) {
        return position+1;
    }
}
