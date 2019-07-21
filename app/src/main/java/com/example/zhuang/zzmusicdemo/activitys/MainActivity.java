package com.example.zhuang.zzmusicdemo.activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.zhuang.zzmusicdemo.R;
import com.example.zhuang.zzmusicdemo.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        initNavBar(false,"慕课音乐",true);
    }
}
