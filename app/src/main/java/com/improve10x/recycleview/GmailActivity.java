package com.improve10x.recycleview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class GmailActivity extends AppCompatActivity {
    GmailItems[] gmailItems;
    RecyclerView gmailRv;
    GmailItemAdapter gmailItemAdapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmail);
        initViews();
        createData();
        setUpAdapter();
        connectAdapter();
    }

    private void setUpAdapter() {
        gmailItemAdapter = new GmailItemAdapter(gmailItems);


    }

    private void connectAdapter() {
        gmailRv.setLayoutManager(new GridLayoutManager(this,1));
        gmailRv.setAdapter(gmailItemAdapter);


    }

    private void createData() {
        gmailItems  = new GmailItems[6];
        GmailItems item1 = new GmailItems();
        item1.poster = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";
        item1.title = "Lisa Paik";
        item1.description  = "Volunteering at the Lakestone student art.. Hi Julia! Thank you for your interest in volun...";
        item1.time = "3:43 PM";
        gmailItems[0] = item1;

        GmailItems item2 = new GmailItems();
        item2.poster = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";
        item2.title = "Elena Casarosa";
        item2.description  = "Portrait special We'd like to announce a holiday portrait spe...";
        item2.time = "11:24 AM";
        gmailItems[1] = item2;

        GmailItems item3 = new GmailItems();
        item3.poster = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";
        item3.title = "Medium Daily Digest";
        item3.description  = "7 Drawings to make you feel better. publi... Medium Daily Digest Get Medium for iOS or...";
        item3.time = "6:30 AM";
        gmailItems[2] = item3;

        GmailItems item4 = new GmailItems();
        item4.poster = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";
        item4.title = "Grace Ellington";
        item4.description  = "Volunteer opportunity I would like to inform you of a volunteer op.";
        item4.time = "Nov 19";
        gmailItems[3] = item4;

        GmailItems item5 = new GmailItems();
        item5.poster = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";
        item5.title = "Henri Rousseau";
        item5.description  = "Niagra falls pictures Julia, Here are the pictures of Niagra Falls y...";
        item5.time = "Nov 19";
        gmailItems[4] = item5;

        GmailItems item6 = new GmailItems();
        item6.poster = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";
        item6.title = "Olenna Mason";
        item6.description  = "Lakestone student art exhibit You're invited to Lakestone's annual studen...";
        item6.time = "Nov 18";
        gmailItems[5] = item6;
    }

    private void initViews() {
    gmailRv = findViewById(R.id.gmail_rv);

    }
}