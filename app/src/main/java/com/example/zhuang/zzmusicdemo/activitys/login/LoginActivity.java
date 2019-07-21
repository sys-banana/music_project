package com.example.zhuang.zzmusicdemo.activitys.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.zhuang.zzmusicdemo.R;
import com.example.zhuang.zzmusicdemo.activitys.MainActivity;
import com.example.zhuang.zzmusicdemo.activitys.login.register.RegisterActivity;
import com.example.zhuang.zzmusicdemo.base.BaseActivity;
import com.example.zhuang.zzmusicdemo.util.UserUtils;
import com.example.zhuang.zzmusicdemo.views.InputView;

public class LoginActivity extends BaseActivity {

    private InputView mInputPhone;
    private InputView mInputPassword;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login );
        initView();
    }

    /**
     * 初始化View
     */
    private void initView(){
        initNavBar(false,"登录",false);

        mInputPhone = fd(R.id.input_phone);
        mInputPassword = fd(R.id.input_password);

    }

    /**
     * 注册点击事件
     */
    public void onRegisterClick(View view){
        Intent intent = new Intent(this,RegisterActivity.class);
        startActivity(intent);
    }

    /**
     * 登录
     */
    public void onCommitClick(View view){
        String phone = mInputPhone.getInputStr();
        String password = mInputPassword.getInputStr();
        //验证用户输入是否合法
//        if (!UserUtils.validateLogin(this,phone,password)){
//            return;
//        }
        //跳转应用主页
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
