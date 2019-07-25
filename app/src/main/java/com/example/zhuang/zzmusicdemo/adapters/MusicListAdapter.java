package com.example.zhuang.zzmusicdemo.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.example.zhuang.zzmusicdemo.R;
import com.example.zhuang.zzmusicdemo.activitys.musicrun.PlayMusicActivity;

public class MusicListAdapter extends RecyclerView.Adapter {

    private Context mContext;
    private View mItemView;
    private RecyclerView mRv;
    private boolean isCalcaulationRvHeight;

    public MusicListAdapter(Context mContext, RecyclerView recyclerView) {
        this.mContext = mContext;
        this.mRv = recyclerView;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        mItemView = LayoutInflater.from(mContext).inflate(R.layout.item_list_music, viewGroup, false);
        return new ViewHolder(mItemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        setRecyclerViewHeight();

        Glide.with(mContext)
                .load("http://blogimages.jspang.com/blogtouxiang1.jpg")
                .into(((ViewHolder)viewHolder).ivicon);

        ((ViewHolder) viewHolder).itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,PlayMusicActivity.class);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 8;
    }

    /**
     * 1、获取itemview的高度
     * 2、然后获取itemview的数量
     * 3、最后通过itemviewHeight*itemViewNum = Recyclerview的高度
     */
    private void setRecyclerViewHeight() {
        if (isCalcaulationRvHeight || mRv == null) return;
        isCalcaulationRvHeight = true;
        //获取itemview的高度
        RecyclerView.LayoutParams itemViewLp = (RecyclerView.LayoutParams) mItemView.getLayoutParams();
        //获取itemview的数量
        int itemCount = getItemCount();
        //使用itemviewHeight*itemViewNum = Recyclerview的高度
        int recyclerViewHeight = itemViewLp.height * itemCount;
        //设置recyclerview高度
        LinearLayout.LayoutParams rvLp = (LinearLayout.LayoutParams) mRv.getLayoutParams();
        rvLp.height = recyclerViewHeight;
        mRv.setLayoutParams(rvLp);

    }

    class ViewHolder extends RecyclerView.ViewHolder {
        View itemView;
        private ImageView ivicon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivicon = itemView.findViewById(R.id.iv_icon);
            this.itemView = itemView;
        }
    }
}
