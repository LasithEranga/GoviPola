package com.example.govipola;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.govipola.adapters.RequestListAdapter;
import com.example.govipola.modal.RequestList;

import java.util.ArrayList;
import java.util.List;

public class product_list extends AppCompatActivity {

    RecyclerView discountRecyclerView , categoryRecyclerView;
    RequestListAdapter discountedProductAdapter;
    List<RequestList> discountedProductsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_product_list);
        discountRecyclerView = findViewById(R.id.homeHolder);

        //Adding data to model
        discountedProductsList = new ArrayList<>();
        discountedProductsList.add(new RequestList(1, R.drawable.carrotreq));
        discountedProductsList.add(new RequestList(2, R.drawable.carrotreq));
        discountedProductsList.add(new RequestList(3, R.drawable.carrotreq));
        discountedProductsList.add(new RequestList(4, R.drawable.carrotreq));
        discountedProductsList.add(new RequestList(5, R.drawable.carrotreq));
        discountedProductsList.add(new RequestList(6, R.drawable.carrotreq));
        setRequestList(discountedProductsList);


    }
    private void setRequestList(List<RequestList> dataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        discountRecyclerView.setLayoutManager(layoutManager);
        discountedProductAdapter = new RequestListAdapter(this, dataList);
        discountRecyclerView.setAdapter(discountedProductAdapter);
    }
    public void openActivity(){
        Intent intent = new Intent (this, product_list.class);
        startActivity(intent);
    }
}