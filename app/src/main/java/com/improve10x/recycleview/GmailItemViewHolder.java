package com.improve10x.recycleview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GmailItemViewHolder extends RecyclerView.ViewHolder {
    public TextView titleTxt;
    public TextView discTxt;
    public TextView timeTxt;
    public ImageView posterIv;


    public GmailItemViewHolder(@NonNull View itemView) {
        super(itemView);
        titleTxt = itemView.findViewById(R.id.title3_txt);
        discTxt = itemView.findViewById(R.id.dis3_txt);
        timeTxt = itemView.findViewById(R.id.time_txt);
        posterIv = itemView.findViewById(R.id.poster1_iv);
    }
}
