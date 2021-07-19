package com.example.govipola;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.govipola.adapters.HomeAdapter;
import com.example.govipola.adapters.RequestListAdapter;
import com.example.govipola.modal.HomeModel;
import com.example.govipola.modal.RequestList;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends AppCompatActivity {
    RecyclerView discountRecyclerView;
    HomeAdapter discountedProductAdapter;
    List<HomeModel> discountedProductsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        ImageView menu = (ImageView) findViewById(R.id.menu);
        menu.setOnClickListener(v -> openSettings());

        discountRecyclerView = findViewById(R.id.main_page);

        //Adding data to model
        discountedProductsList = new ArrayList<>();
        discountedProductsList.add(new HomeModel(1, R.drawable.carrot));
        discountedProductsList.add(new HomeModel(2, R.drawable.carrot));
        discountedProductsList.add(new HomeModel(3, R.drawable.carrot));
        discountedProductsList.add(new HomeModel(4, R.drawable.carrot));
        discountedProductsList.add(new HomeModel(5, R.drawable.carrot));
        discountedProductsList.add(new HomeModel(6, R.drawable.carrot));
        setRequestList(discountedProductsList);


    }

    private void openSettings() {
        Intent setting = new Intent(this, Settings.class);
        startActivity(setting);
    }

    private void setRequestList(List<HomeModel> dataList) {
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        discountRecyclerView.setLayoutManager(layoutManager);
        discountedProductAdapter = new HomeAdapter(this, dataList);
        discountRecyclerView.setAdapter(discountedProductAdapter);
    }

}