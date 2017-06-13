package com.sdsmdg.pulkit.samplestaggeredview;

import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by pulkit on 9/6/17.
 */

public class GridHelperHolder extends RecyclerView.ViewHolder {
    RecyclerView recyclerView;
    GridHelperAdapter gridHelperAdapter;
    List<AbstractViewHolder> viewHolderList;
    private List<GridHolderItems> gridHolderItems;
    List<CustomGridHolder> customGridHoldersList;
    int columns,j;
    private LinearLayoutManager linearLayoutManager;

    public GridHelperHolder(View itemView, final List<AbstractViewHolder> viewHolders, Activity activity, ViewGroup parent) {
        super(itemView);
        customGridHoldersList = new ArrayList<>();
        recyclerView = (RecyclerView) itemView.findViewById(R.id.customhorizontalrecyclerview);
        gridHolderItems = new ArrayList<>();
        linearLayoutManager = new LinearLayoutManager(activity);
        double fraction = 0;
        viewHolderList = new ArrayList<>();
        for (int i = 0; i < viewHolders.size(); i++) {
            if (fraction + viewHolders.get(i).mWidth <= 1) {
                fraction = fraction + viewHolders.get(i).mWidth;
                viewHolderList.add(viewHolders.get(i));
            } else {
                columns = columnNo(convertToDoubleDecimal(viewHolderList));
                for (j = 0; j < viewHolderList.size(); j++) {
                    gridHolderItems.add(new GridHolderItems(viewHolderList.get(j), (int) Math.round((viewHolderList.get(j).mWidth) * columns)));
                }
                customGridHoldersList.add(new CustomGridHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_recyclerview, parent, false), gridHolderItems, activity, columns));
                fraction = 0;
                gridHolderItems = new ArrayList<>();
                viewHolderList = new ArrayList<>();
                viewHolderList.add(viewHolders.get(i));
            }
            if (i == viewHolders.size() - 1) {
                columns = columnNo(convertToDoubleDecimal(viewHolderList));
                for (int j = 0; j < viewHolderList.size(); j++) {
                    gridHolderItems.add(new GridHolderItems(viewHolderList.get(j), (int) Math.round((viewHolderList.get(j).mWidth) * columns)));
                }
                customGridHoldersList.add(new CustomGridHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_recyclerview, parent, false), gridHolderItems, activity, columns));
                fraction = 0;
                gridHolderItems = new ArrayList<>();
                viewHolderList = new ArrayList<>();
            }
        }

        gridHelperAdapter = new GridHelperAdapter(customGridHoldersList);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(gridHelperAdapter);
    }

    int columnNo(List<AbstractViewHolder> viewHolderList) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < viewHolderList.size(); i++) {
            integers.add((int) (viewHolderList.get(i).mWidth * 100));
        }
        Log.e("GCD",(double) gcd(integers)+" ");
        return (int) (100 / (double) gcd(integers));
    }

    List<AbstractViewHolder> convertToDoubleDecimal(List<AbstractViewHolder> viewHolderList) {
        DecimalFormat df = new DecimalFormat("0.00");
        for (int i = 0; i < viewHolderList.size(); i++) {
            viewHolderList.get(i).mWidth = Double.valueOf(df.format((viewHolderList.get(i).mWidth)));
        }
        return viewHolderList;
    }

    private int gcd(List<Integer> integers) {
        int result = integers.get(0);
        for (int i = 0; i < integers.size(); i++)
            result = gcd(result, integers.get(i));
        return result;
    }

    private static int gcd(int number1, int number2) //Finds GCD of 2 numbers.
    {
        if (number2 == 0) {
            return number1;
        }
        return gcd(number2, number1 % number2);
    }
}

class GridHolderItems {
    public RecyclerView.ViewHolder mViewHolder;
    public Integer columnsOccupied;

    public GridHolderItems(RecyclerView.ViewHolder viewHolder, int columns) {
        mViewHolder = viewHolder;
        columnsOccupied = columns;
    }
}

