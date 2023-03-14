package com.improve10x.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class InstagramItemAdapter extends RecyclerView.Adapter<InstagramItemViewHolder> {

    public InstagramItems[] items;

    public InstagramItemAdapter(InstagramItems[] instagramItems) {
        items = instagramItems;
    }

    @NonNull
    @Override
    public InstagramItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.instagram_items, parent, false);
        InstagramItemViewHolder viewHolder = new InstagramItemViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull InstagramItemViewHolder holder, int position) {
        InstagramItems item =  items[position];
        holder.titleTxt.setText(item.title);
        holder.descriptionTxt.setText(item.description);
        Picasso.get().load(item.poster).into(holder.photoIv);

    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
