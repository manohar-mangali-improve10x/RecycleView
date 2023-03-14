package com.improve10x.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.HorizontalScrollView;

public class InstagramActivity extends AppCompatActivity {
    RecyclerView favoritesRv;
    RecyclerView suggestedRv;
    InstagramItems[] instagramItems;
    InstagramItems[] suggestedItems;
    InstagramItemAdapter instagramItemAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram);
        initViews();
        createData();
        createSuggestedData();
        setUpAdapter();
        connectAdapter();
    }

    private void createSuggestedData() {
        suggestedItems  = new InstagramItems[2];
        InstagramItems item1 = new InstagramItems();
        item1.poster = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";
        item1.title = "lil_wyatt838";
        item1.description  = "Wyatt Torres";
        suggestedItems[0] = item1;

        InstagramItems item2 = new InstagramItems();
        item2.poster = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";
        item2.title = "lil_wyatt838";
        item2.description  = "Wyatt Torres";
        suggestedItems[1] = item2;


    }

    private void connectAdapter() {
        favoritesRv.setLayoutManager(new LinearLayoutManager(this));
        favoritesRv.setAdapter(instagramItemAdapter);


    }

    private void setUpAdapter() {
        instagramItemAdapter = new InstagramItemAdapter(instagramItems);

    }

    private void createData() {
        instagramItems  = new InstagramItems[4];
        InstagramItems item1 = new InstagramItems();
        item1.poster = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";
        item1.title = "lil_wyatt838";
        item1.description  = "Wyatt Torres";
        instagramItems[0] = item1;

        InstagramItems item2 = new InstagramItems();
        item2.poster = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";
        item2.title = "sprinkles_bby19";
        item2.description  = "Gabriela Perez";
        instagramItems[1] = item2;

        InstagramItems item3 = new InstagramItems();
        item3.poster = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";
        item3.title = "xander.the.great178";
        item3.description  = "Alex Koch";
        instagramItems[2] = item3;

        InstagramItems item4 = new InstagramItems();
        item4.poster = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";
        item4.title = "kyia_kayaks ";
        item4.description  = " Kyra Marie";
        instagramItems[3] = item4;




    }

    private void initViews() {
        favoritesRv = findViewById(R.id.favorites_rv);
        suggestedRv = findViewById(R.id.suggestrd_rv);

    }
}