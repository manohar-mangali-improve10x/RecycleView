package com.improve10x.recycleview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class InstagramItemViewHolder extends RecyclerView.ViewHolder {
    public ImageView photoIv;
    public TextView titleTxt;
    public TextView descriptionTxt;

    public InstagramItemViewHolder(@NonNull View itemView) {
        super(itemView);
        photoIv = itemView.findViewById(R.id.photo1_iv);
        titleTxt = itemView.findViewById(R.id.title6_txt);
        descriptionTxt = itemView.findViewById(R.id.description1_txt);

    }
}
