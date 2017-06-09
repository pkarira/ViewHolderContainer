package com.sdsmdg.pulkit.samplestaggeredview;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by pulkit on 8/6/17.
 */

public abstract class AbstractViewHolder extends RecyclerView.ViewHolder {
    int mHeight;
    int mWidth;
    public AbstractViewHolder(View itemView) {
        super(itemView);
    }
}
