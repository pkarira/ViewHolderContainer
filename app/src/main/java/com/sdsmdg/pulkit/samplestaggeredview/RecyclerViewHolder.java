package com.sdsmdg.pulkit.samplestaggeredview;

import android.app.Activity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by pulkit on 3/6/17.
 */

public class RecyclerViewHolder extends AbstractViewHolder {
    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;
    ArrayList<String> movies;
    LinearLayoutManager linearLayoutManager;
    int mHeight,mWidth;

    public RecyclerViewHolder(View itemView, Activity activity, int height, int width) {
        super(itemView);
        mHeight=height;
        mWidth=width;
        recyclerView = (RecyclerView) itemView.findViewById(R.id.recyclerview);
        movies = new ArrayList<>();
        movies.add("pulkit");
        movies.add("pulkit");
        movies.add("pulkit");
        movies.add("pulkit");
        recyclerViewAdapter = new RecyclerViewAdapter(movies);
        linearLayoutManager = new LinearLayoutManager(activity,LinearLayoutManager.HORIZONTAL,true);
        recyclerView.setLayoutManager(linearLayoutManager);
        ViewGroup.LayoutParams params = recyclerView.getLayoutParams();
        params.height = height;
        params.width = width;
        recyclerView.setLayoutParams(params);
        recyclerView.setAdapter(recyclerViewAdapter);
    }

    public void additems() {
    }
}
