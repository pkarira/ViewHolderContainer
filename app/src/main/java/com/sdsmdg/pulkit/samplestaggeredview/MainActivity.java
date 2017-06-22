package com.sdsmdg.pulkit.samplestaggeredview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recList;
    EditText t;
    int c;
    private StaggeredGridLayoutManager llm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recList = (RecyclerView)findViewById(R.id.grid_recycler);
        recList.setHasFixedSize(true);
        llm = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        /*c=2;
        llm.setSpanSizeLookup( new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                switch(position)
                {
                    case 1:
                        c=3;
                        return 6;
                    case 2:
                        c=2;
                        return 3;
                    default:
                        return -1;
                }
            }
        });*/

        recList.setLayoutManager(llm);
       /* recList.addItemDecoration(new GridItemDecorat ion(3, 15, true));*/
        BaseAdapter recyclerViewAdapter = new BaseAdapter(createList(), this);
        recList.setAdapter(recyclerViewAdapter);
    }
    private ArrayList<String> createList()
    {
        ArrayList<String> movieList=new ArrayList<>();
        movieList.add("pulkit");
        movieList.add("pulkit");
        movieList.add("pulkit");
        movieList.add("pulkit");
        movieList.add("pulkit");
        movieList.add("pulkit");
        movieList.add("pulkit");
        movieList.add("pulkit");
        movieList.add("pulkit");
        movieList.add("pulkit");
        movieList.add("pulkit");
        movieList.add("pulkit");
        movieList.add("pulkit");
        movieList.add("pulkit");
        movieList.add("pulkit");
        movieList.add("pulkit");
        movieList.add("pulkit");
        return movieList;
    }
}
