package com.sdsmdg.pulkit.samplestaggeredview;

import android.app.Activity;;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by pulkit on 2/6/17.
 */

public class BaseAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<String> movieList;
    private Activity parentAct;
    private Random mRandom = new Random();
    private final int RECYCLER = 1;
    private final int IMAGE = 2;

    public BaseAdapter(ArrayList<String> movieList1, Activity activity) {
        movieList = movieList1;
        parentAct = activity;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case RECYCLER:
                return new RecyclerViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_layout, parent, false),parentAct,200,800);
            case IMAGE:
                return new BaseAdapter.ListViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_view_card, parent, false),200,800);
            case 3:
                return new CustomHorizontalViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_horizontal_recyclerview, parent, false),new RecyclerViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_layout, parent, false),parentAct,200,800),new BaseAdapter.ListViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_view_card, parent, false),300,800),new RecyclerViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_layout, parent, false),parentAct,300,800),new BaseAdapter.ListViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_view_card, parent, false),320,800),parentAct);
            default:
                return new BaseAdapter.ListViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_view_card, parent, false),200,800);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType()) {
            case RECYCLER:
                RecyclerViewHolder recyclerView = (RecyclerViewHolder) holder;
                recyclerView.additems();
                break;
            case IMAGE:
                ListViewHolder listViewHolder = (ListViewHolder) holder;
                listViewHolder.title.setText(movieList.get(position));
                break;
            case 3:
                break;
            default:
                ListViewHolder listViewHolder1 = (ListViewHolder) holder;
                listViewHolder1.title.setText(movieList.get(position));
                break;
        }
       /* holder.title.getLayoutParams().height = getRandomIntInRange(250, 75);
        holder.title.setBackgroundColor(getRandomHSVColor());*/
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView title;
        CardView cardView;

        public ListViewHolder(final View vi, int height, int width) {
            super(vi);
            title = (TextView) vi.findViewById(R.id.textView);
            cardView=(CardView)vi.findViewById(R.id.cardView);
            ViewGroup.LayoutParams params = cardView.getLayoutParams();
            params.height = height;
            params.width = width;
            cardView.setLayoutParams(params);
            vi.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(parentAct, movieList.get(getPosition()), Toast.LENGTH_LONG).show();

        }
    }

    protected int getRandomIntInRange(int max, int min) {
        return mRandom.nextInt((max - min) + min) + min;
    }

    protected int getRandomHSVColor() {
        // Generate a random hue value between 0 to 360
        int hue = mRandom.nextInt(361);
        // We make the color depth full
        float saturation = 1.0f;
        // We make a full bright color
        float value = 1.0f;
        // We avoid color transparency
        int alpha = 255;
        // Finally, generate the color
        int color = Color.HSVToColor(alpha, new float[]{hue, saturation, value});
        // Return the color
        return color;
    }

    @Override
    public int getItemViewType(int position) {
        return position + 1;
    }

}
