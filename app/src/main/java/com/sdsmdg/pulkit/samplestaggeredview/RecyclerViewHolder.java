package com.sdsmdg.pulkit.samplestaggeredview;

import android.app.Activity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
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
    private StaggeredGridLayoutManager llm;

    public RecyclerViewHolder(View itemView, Activity activity, double height, double width) {
        super(itemView);
        mHeight = height;
        mWidth = width;
        recyclerView = (RecyclerView) itemView.findViewById(R.id.recyclerview);
        movies = new ArrayList<>();
        movies.add("pulkit");
        movies.add("pulkit");
        movies.add("pulkit");
        movies.add("pulkit");
        movies.add("pulkit");
        movies.add("pulkit");
        movies.add("pulkit");
        movies.add("pulkit");
        movies.add("pulkit");
        movies.add("pulkit");
        movies.add("pulkit");
        movies.add("pulkit");
        movies.add("pulkit");
        movies.add("pulkit");
        movies.add("pulkit");
        movies.add("pulkit");
        movies.add("pulkit");
        movies.add("pulkit");
        movies.add("pulkit");
        movies.add("pulkit");
        movies.add("pulkit");
        movies.add("pulkit");
        movies.add("pulkit");
        movies.add("pulkit");
        recyclerViewAdapter = new RecyclerViewAdapter(movies);
        llm = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        llm.setAutoMeasureEnabled(true);
        recyclerView.setLayoutManager(llm);
       // recyclerView.setHasFixedSize(true);
       /* ViewGroup.LayoutParams params = recyclerView.getLayoutParams();
        params.height = (int)height;
        params.width = (int)(width*800);
        recyclerView.setLayoutParams(params);*/
        recyclerView.setAdapter(recyclerViewAdapter);
    }

    public void additems() {
    }
}
