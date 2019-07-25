package com.example.zhuang.zzmusicdemo.activitys.percenter;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.zhuang.zzmusicdemo.R;
import com.example.zhuang.zzmusicdemo.activitys.login.ChangePasswordActivity;
import com.example.zhuang.zzmusicdemo.base.BaseActivity;
import com.example.zhuang.zzmusicdemo.util.UserUtils;

public class MeActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me);
        initView();
    }

    private void initView(){
        initNavBar(true,"个人中心",false);
    }

    /**
     * 修改密码点击事件
     * @param view
     */
    public void onChangeClick(View view){
        Intent intent = new Intent(this,ChangePasswordActivity.class);
        startActivity(intent);
    }

    /**
     * 退出登录点击事件
     * @param view
     */
    public void onLogoutClick(View view){
        UserUtils.logout(this);
    }

}
