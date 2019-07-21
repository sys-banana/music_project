package com.example.zhuang.zzmusicdemo.activitys.welcome;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.example.zhuang.zzmusicdemo.R;
import com.example.zhuang.zzmusicdemo.activitys.MainActivity;
import com.example.zhuang.zzmusicdemo.activitys.login.LoginActivity;
import com.example.zhuang.zzmusicdemo.base.BaseActivity;

import java.util.Timer;
import java.util.TimerTask;

public class WelcomeActivity extends BaseActivity {

    private Timer timer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        init();
    }

    /**
     * 初始化
     */
    private void init(){
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
//                Log.e("WelcomeActivity","当前线程为："+Thread.currentThread());
//                toMain();
                toLogin();
            }
        },3*1000);
    }

    /**
     * 跳转到MainActivity
     */
    private void toMain(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    /**
     * 跳转到LoginActivity
     */
    private void toLogin(){
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
