package com.sdsmdg.pulkit.samplestaggeredview;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pulkit on 3/6/17.
 */

public class CustomStaggeredViewHolder extends RecyclerView.ViewHolder {
    RecyclerView recyclerView;
    CustomStaggeredAdapter customHorizontalAdapter;
    private StaggeredGridLayoutManager llm;
    public CustomStaggeredViewHolder(View itemView, List<RecyclerView.ViewHolder> viewHolders, Activity activity,int columns) {
        super(itemView);
        recyclerView = (RecyclerView) itemView.findViewById(R.id.customhorizontalrecyclerview);
        llm = new StaggeredGridLayoutManager(columns,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);
        customHorizontalAdapter=new CustomStaggeredAdapter(viewHolders);
        recyclerView.setAdapter(customHorizontalAdapter);
    }
}