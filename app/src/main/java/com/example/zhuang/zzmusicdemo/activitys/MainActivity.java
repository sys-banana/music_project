package com.example.zhuang.zzmusicdemo.activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.zhuang.zzmusicdemo.R;
import com.example.zhuang.zzmusicdemo.adapters.MusicGridAdapter;
import com.example.zhuang.zzmusicdemo.adapters.MusicListAdapter;
import com.example.zhuang.zzmusicdemo.base.BaseActivity;
import com.example.zhuang.zzmusicdemo.views.GridSpaceItemDecoration;

public class MainActivity extends BaseActivity {

    private RecyclerView mRvGrid;
    private MusicGridAdapter mGridAdapter;
    private RecyclerView mRvList;
    private MusicListAdapter mListAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        initNavBar(false,"慕课音乐",true);

        mRvGrid = findViewById(R.id.rv_grid);
        mRvGrid.addItemDecoration(new GridSpaceItemDecoration(getResources().getDimensionPixelOffset(R.dimen.albumMarginSize),mRvGrid));
        mRvGrid.setLayoutManager(new GridLayoutManager(this,3 ));
        mRvGrid.setNestedScrollingEnabled(false);
        mGridAdapter = new MusicGridAdapter(this);
        mRvGrid.setAdapter(mGridAdapter);

        /**
         * 1、假如已知列表高度的情况下可以直接在布局中把recyclerview的高度定义上
         * 2、不知道列表高度的情况下需要手动计算recyclerview的高度
         */
        mRvList = findViewById(R.id.rv_list);
        mRvList.setLayoutManager(new LinearLayoutManager(this));
        mRvList.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        mRvList.setNestedScrollingEnabled(false);
        mListAdapter = new MusicListAdapter(this,mRvList);
        mRvList.setAdapter(mListAdapter);
    }
}
