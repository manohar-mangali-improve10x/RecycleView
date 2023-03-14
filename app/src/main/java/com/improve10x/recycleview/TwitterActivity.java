package com.improve10x.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class TwitterActivity extends AppCompatActivity {
    RecyclerView twitterRv;
    TwitterItems[] twitterItems;
    TwitterAdapter twitterAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter);
        initViews();
        createData();
        setUpAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        twitterRv.setLayoutManager(new LinearLayoutManager(this));
        twitterRv.setAdapter(twitterAdapter);
    }

    private void setUpAdapter() {
        twitterAdapter = new TwitterAdapter(twitterItems);
    }

    private void createData() {
        twitterItems  = new TwitterItems[5];
        TwitterItems item1 = new TwitterItems();
        item1.photo = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";
        item1.title = "Silvia";
        item1.time = "@machadocomida-1m";
        item1.description  = "ppl keep saying hot girl summer but i'm just trying to stay out of the humidity\n";
        item1.chat = "2";
        item1.rotation  = "6";
        item1.favorite = "25";
        twitterItems[0] = item1;

        TwitterItems item2 = new TwitterItems();
        item2.photo = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";
        item2.title = "lil_wyatt838";
        item2.description  = "Wyatt Torres";
        item2.chat = "4";
        item2.rotation  = "6";
        item2.favorite = "18";
        twitterItems[1] = item2;

        TwitterItems item3 = new TwitterItems();
        item3.photo = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";
        item3.title = "lil_wyatt838";
        item3.description  = "Wyatt Torres";
        item3.chat = "3";
        item3.rotation  = "5 ";
        item3.favorite = "12";
        twitterItems[2] = item3;

        TwitterItems item4 = new TwitterItems();
        item4.photo = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";
        item4.title = "lil_wyatt838";
        item4.description  = "Wyatt Torres";
        item4.chat = "2";
        item4.rotation  = "9";
        item4.favorite = "19";
        item4.silver = "🔁 tdcvb";
        twitterItems[3] = item4;

        TwitterItems item5 = new TwitterItems();
        item5.photo = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";
        item5.title = "lil_wyatt838";
        item5.description  = "Wyatt Torres";
        item5.chat = "8";
        item5.rotation  = "Wyatt Torres";
        item5.favorite = "lil_wyatt838";
        twitterItems[4] = item5;



    }

    private void initViews() {
        twitterRv = findViewById(R.id.twitter_Rv);

    }
}