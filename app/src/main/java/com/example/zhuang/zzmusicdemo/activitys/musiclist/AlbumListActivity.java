package com.example.zhuang.zzmusicdemo.activitys.musiclist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.zhuang.zzmusicdemo.R;
import com.example.zhuang.zzmusicdemo.adapters.MusicListAdapter;
import com.example.zhuang.zzmusicdemo.base.BaseActivity;

public class AlbumListActivity extends BaseActivity {

    private RecyclerView mRvList;
    private MusicListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_list);

        initView();
    }

    private void initView(){
        initNavBar(true,"专辑列表",false);

        mRvList = findViewById(R.id.rv_list);
        mRvList.setLayoutManager(new LinearLayoutManager(this));
        mRvList.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        mRvList.setScrollContainer(true);
        mAdapter = new MusicListAdapter(this,mRvList);
        mRvList.setAdapter(mAdapter);
    }
}
