package com.sdsmdg.pulkit.samplestaggeredview;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;

import java.util.ArrayList;

/**
 * Created by pulkit on 3/6/17.
 */

public class CustomHorizontalViewHolder extends RecyclerView.ViewHolder {
    RecyclerView recyclerView;
    CustomHorizontalAdapter customHorizontalAdapter;
    ArrayList<String> movies;
    private StaggeredGridLayoutManager llm;
    public CustomHorizontalViewHolder(View itemView, RecyclerView.ViewHolder viewHolder1, RecyclerView.ViewHolder viewHolder2,RecyclerView.ViewHolder viewHolder3,RecyclerView.ViewHolder viewHolder4, Activity activity) {
        super(itemView);
        movies=new ArrayList<>();
        recyclerView = (RecyclerView) itemView.findViewById(R.id.customhorizontalrecyclerview);
        llm = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);
        ViewGroup.LayoutParams params = recyclerView.getLayoutParams();
        params.height = 600;
        params.width = 1000;
        recyclerView.setLayoutParams(params);
        customHorizontalAdapter=new CustomHorizontalAdapter(viewHolder1,viewHolder2,viewHolder3,viewHolder4,movies);
        recyclerView.setAdapter(customHorizontalAdapter);
    }
}