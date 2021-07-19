package com.example.govipola.adapters;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.example.govipola.R;
import com.example.govipola.modal.HomeModel;
import com.example.govipola.modal.RequestList;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.DiscountProductViewHolder> {
    Context context;

    List<HomeModel> requestLists;
    public HomeAdapter (Context context, List<HomeModel> datalist) {
        requestLists = datalist;
        this.context = context;
    }

    @NonNull

    @Override
    public DiscountProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.home_layout, parent , false);
        return new HomeAdapter.DiscountProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeAdapter.DiscountProductViewHolder holder, int position) {
        holder.requestImageView.setImageResource(requestLists.get(position).getImgUrl());
    }

    @Override
    public int getItemCount() {
        return requestLists.size();
    }

    public static class DiscountProductViewHolder extends RecyclerView.ViewHolder{
        ImageView requestImageView;
        public DiscountProductViewHolder(@NonNull View itemView) {
            super(itemView);
            requestImageView = itemView.findViewById(R.id.homeImageView);
        }
    }

}
