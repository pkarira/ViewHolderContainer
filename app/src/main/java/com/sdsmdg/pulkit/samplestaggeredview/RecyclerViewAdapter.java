package com.sdsmdg.pulkit.samplestaggeredview;

import android.graphics.Paint;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by pulkit on 3/6/17.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<String> movieList;

    public RecyclerViewAdapter(ArrayList<String> movies) {
        movieList = movies;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ListViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerviewcard, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ListViewHolder listViewHolder = (ListViewHolder) holder;
        listViewHolder.title.setText(movieList.get(position));
        listViewHolder.imageView.setImageResource(R.mipmap.ic_launcher);
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        protected TextView title;
        protected ImageView imageView;


        public ListViewHolder(final View vi) {
            super(vi);
            title = (TextView) vi.findViewById(R.id.editText);
            imageView = (ImageView) vi.findViewById(R.id.imageView);
        }

    }
}
