package com.example.zhuang.zzmusicdemo.activitys.login;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.zhuang.zzmusicdemo.R;
import com.example.zhuang.zzmusicdemo.base.BaseActivity;

public class ChangePasswordActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        initView();
    }

    private void initView(){
        initNavBar(true,"修改密码",false);
    }
}
