package com.sdsmdg.pulkit.samplestaggeredview;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
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
    private GridLayoutManager llm;
    public CustomHorizontalViewHolder(View itemView, RecyclerView.ViewHolder viewHolder1, RecyclerView.ViewHolder viewHolder2, Activity activity) {
        super(itemView);
        movies=new ArrayList<>();
        movies.add("pulkit");
        movies.add("pulkit");
        recyclerView = (RecyclerView) itemView.findViewById(R.id.customhorizontalrecyclerview);
        llm = new GridLayoutManager(activity,2);
        recyclerView.setLayoutManager(llm);
        customHorizontalAdapter=new CustomHorizontalAdapter(viewHolder1,viewHolder2,movies);
        recyclerView.setAdapter(customHorizontalAdapter);
    }
}