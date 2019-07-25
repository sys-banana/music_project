package com.example.zhuang.zzmusicdemo.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.zhuang.zzmusicdemo.R;
import com.example.zhuang.zzmusicdemo.activitys.musiclist.AlbumListActivity;

public class MusicGridAdapter extends RecyclerView.Adapter {

    private Context mContext;

    public MusicGridAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_grid_music,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        Glide.with(mContext)
                .load("http://blogimages.jspang.com/blogtouxiang1.jpg")
                .into(((ViewHolder)viewHolder).ivIcon);

        ((ViewHolder) viewHolder).itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,AlbumListActivity.class);
                mContext.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return 6;
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivIcon;
        View itemView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivIcon = itemView.findViewById(R.id.iv_icon);
            this.itemView = itemView;
        }
    }
}
