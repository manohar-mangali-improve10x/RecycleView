package com.improve10x.recycleview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SuggestedViewHolder extends RecyclerView.ViewHolder {
    public ImageView photoIv;
    public TextView titleTxt;
    public  TextView description;


    public SuggestedViewHolder(@NonNull View itemView) {
        super(itemView);
    }
}
