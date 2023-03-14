package com.improve10x.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class TwitterAdapter extends RecyclerView.Adapter<TwitterViewHolder> {
    public TwitterItems[] items;

    public TwitterAdapter(TwitterItems[] twitterItems) {
        items = twitterItems;
    }
    @NonNull
    @Override
    public TwitterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.twitter_items, parent, false);
        TwitterViewHolder viewHolder = new TwitterViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TwitterViewHolder holder, int position) {
        TwitterItems item1 =  items[position];
        holder.titleTxt.setText(item1.title);
        holder.descriptionTxt.setText(item1.description);
        holder.silverTxt.setText(item1.silver);
        holder.chatTxt.setText(item1.chat);
        holder.rotationTxt.setText(item1.rotation);
        holder.favoriteTxt.setText(item1.favorite);
        Picasso.get().load(item1.photo).into(holder.photoIv);

    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
