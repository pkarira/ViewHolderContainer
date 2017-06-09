package com.sdsmdg.pulkit.samplestaggeredview;

import android.app.Activity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

/**
 * Created by pulkit on 6/6/17.
 */

public class CustomScrollHolder extends RecyclerView.ViewHolder {
    RecyclerView recyclerView;
    CustomScrollAdapter customScrollAdapter;
    private LinearLayoutManager linearLayoutManager;
    public CustomScrollHolder(View itemView, final List<AbstractViewHolder> viewHolders, Activity activity) {
        super(itemView);
        recyclerView = (RecyclerView) itemView.findViewById(R.id.customhorizontalrecyclerview);
        linearLayoutManager = new LinearLayoutManager(activity,LinearLayoutManager.HORIZONTAL,true);
        customScrollAdapter=new CustomScrollAdapter(viewHolders);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(customScrollAdapter);
    }
}
