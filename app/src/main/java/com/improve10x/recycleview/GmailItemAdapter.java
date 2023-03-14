package com.improve10x.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class GmailItemAdapter extends RecyclerView.Adapter<GmailItemViewHolder> {
    public  GmailItems[] items;

    public GmailItemAdapter(GmailItems[] gmailItems){
        items = gmailItems;
    }

    @NonNull
    @Override
    public GmailItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.gmail_items, parent, false);
        GmailItemViewHolder viewHolder = new GmailItemViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GmailItemViewHolder holder, int position) {
        GmailItems item = items[position];
        holder.titleTxt.setText(item.title);
        holder.timeTxt.setText(item.time);
        holder.discTxt.setText(item.description);
        Picasso.get().load(item.poster).into(holder.posterIv);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
