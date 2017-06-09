package com.sdsmdg.pulkit.samplestaggeredview;
import android.app.Activity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
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
    public CustomGridHolder(View itemView, final List<AbstractViewHolder> viewHolders, Activity activity, int columns) {
        super(itemView);
        recyclerView = (RecyclerView) itemView.findViewById(R.id.customhorizontalrecyclerview);
        gridLayoutManager = new GridLayoutManager(activity,10);
        final List<GridHolderItems> viewHolders1=getGridViewHolders(viewHolders);
        customGridAdapter=new CustomGridAdapter(viewHolders1);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                return viewHolders1.get(position).columnsOccupied;
            }
        });
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(customGridAdapter);
    }
    List<GridHolderItems> getGridViewHolders(List<AbstractViewHolder> viewHolders)
    {
        List<GridHolderItems> gridViewItems = new ArrayList<>();
        int size=0;
        for(int i=0;i<viewHolders.size();i++)
        {
            if(size+viewHolders.get(i).mWidth<80)
            {
               size+=viewHolders.get(i).mWidth;
            }
        }
        return
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
