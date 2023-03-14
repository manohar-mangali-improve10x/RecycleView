package com.improve10x.recycleview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TwitterViewHolder extends RecyclerView.ViewHolder {
    public ImageView photoIv;
    public TextView descriptionTxt;
    public TextView titleTxt;
    public TextView timeTxt;
    public TextView silverTxt;
    public TextView chatTxt;
    public TextView rotationTxt;
    public TextView favoriteTxt;


    public TwitterViewHolder(@NonNull View itemView) {
        super(itemView);
        photoIv = itemView.findViewById(R.id.photo1_iv);
        descriptionTxt = itemView.findViewById(R.id.description1_txt);
        titleTxt = itemView.findViewById(R.id.title6_txt);
        silverTxt = itemView.findViewById(R.id.silver_txt);
        chatTxt = itemView.findViewById(R.id.chat_txt);
        timeTxt = itemView.findViewById(R.id.time_txt);
        rotationTxt = itemView.findViewById(R.id.rotation_txt);
        favoriteTxt = itemView.findViewById(R.id.favorites_txt);

    }
}
