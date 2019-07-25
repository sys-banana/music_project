package com.example.zhuang.zzmusicdemo.activitys.musicrun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.zhuang.zzmusicdemo.R;
import com.example.zhuang.zzmusicdemo.base.BaseActivity;
import com.example.zhuang.zzmusicdemo.views.PlayMusicView;

import jp.wasabeef.glide.transformations.BlurTransformation;

public class PlayMusicActivity extends BaseActivity {

    private ImageView mIvBg;
    private PlayMusicView mPlayMusicView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_music);

        //隐藏statusBar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        initView();
    }

    private void initView(){
        mIvBg = findViewById(R.id.iv_bg);
        //glide-transsformations//高斯模糊Transformation接口
        Glide.with(this)
                .load("http://blogimages.jspang.com/blogtouxiang1.jpg")
                .apply(RequestOptions.bitmapTransform(new BlurTransformation(25,2)))
                .into(mIvBg);

        mPlayMusicView = findViewById(R.id.play_music_view);
        mPlayMusicView.setMusicIcon("http://blogimages.jspang.com/blogtouxiang1.jpg");
        mPlayMusicView.playMusic("http://res.lgdsunday.club/Nostalgic%20Piano.mp3");
    }



    /**
     * 后退按钮点击事件
     * @param view
     */
    public void onBackClick(View view) {
        onBackPressed();
    }
}
