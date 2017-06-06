package com.sdsmdg.pulkit.samplestaggeredview;

import android.app.Activity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pulkit on 6/6/17.
 */

public class CustomGridHolder extends RecyclerView.ViewHolder{
    RecyclerView recyclerView;
    CustomGridAdapter customGridAdapter;
    private GridLayoutManager gridLayoutManager;
    public CustomGridHolder(View itemView, final List<BaseAdapter.GridHolderItems> viewHolders, Activity activity, int columns) {
        super(itemView);
        recyclerView = (RecyclerView) itemView.findViewById(R.id.customhorizontalrecyclerview);
        gridLayoutManager = new GridLayoutManager(activity,columns);
        customGridAdapter=new CustomGridAdapter(viewHolders);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                return viewHolders.get(position).columnsOccupied;
            }
        });
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(customGridAdapter);
    }
}
