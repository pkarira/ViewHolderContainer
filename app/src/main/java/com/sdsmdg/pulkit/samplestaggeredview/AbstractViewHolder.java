package com.sdsmdg.pulkit.samplestaggeredview;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by pulkit on 8/6/17.
 */

public abstract class AbstractViewHolder extends RecyclerView.ViewHolder {
    double mHeight;
    double mWidth;
    public AbstractViewHolder(View itemView) {
        super(itemView);
    }
}
