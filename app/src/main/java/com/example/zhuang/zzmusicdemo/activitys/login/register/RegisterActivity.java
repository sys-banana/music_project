package com.example.zhuang.zzmusicdemo.activitys.login.register;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.zhuang.zzmusicdemo.R;
import com.example.zhuang.zzmusicdemo.base.BaseActivity;

public class RegisterActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initView();
    }

    /**
     * 初始化view
     */
    public  void initView(){
        initNavBar(true,"注册",false);
    }
}
