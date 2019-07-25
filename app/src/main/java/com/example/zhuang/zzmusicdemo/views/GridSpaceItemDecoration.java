package com.example.zhuang.zzmusicdemo.views;

import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

public class GridSpaceItemDecoration extends RecyclerView.ItemDecoration {

    private int mSpace;

    public GridSpaceItemDecoration(int space,RecyclerView parent) {
        this.mSpace = space;
        getRecyclerViewOffsets(parent);
    }

    /**
     * @param outRect item的矩形边界
     * @param view itemview
     * @param parent RecyclerView
     * @param state RecyclerView
     */
    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);

        outRect.left = mSpace;
//        //判断item是不是每一行第一个item
//        if (parent.getChildLayoutPosition(view) % 3 == 0) {
//            outRect.left = 0;
//        }


    }

    private void getRecyclerViewOffsets(RecyclerView parent){
        //view margin,
        //margin为正则view距离边界产生一个距离
        //margin为负则view会超出边界产生一个距离

        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) parent.getLayoutParams();
        layoutParams.leftMargin = -mSpace;
        parent.setLayoutParams(layoutParams);
    }
}
