package com.example.zhuang.zzmusicdemo.views;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class WEqualsHImageView extends android.support.v7.widget.AppCompatImageView {
    public WEqualsHImageView(Context context) {
        super(context);
    }

    public WEqualsHImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public WEqualsHImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);


//        //获取view宽度
//        int width = MeasureSpec.getSize(widthMeasureSpec);
//        //获取view模式，match_parent,warp_parent,具体dp
//        int mode = MeasureSpec.getMode(widthMeasureSpec);
    }
}
