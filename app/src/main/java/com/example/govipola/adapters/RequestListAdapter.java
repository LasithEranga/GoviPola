package com.example.govipola.adapters;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.example.govipola.R;
import com.example.govipola.modal.RequestList;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RequestListAdapter extends RecyclerView.Adapter<RequestListAdapter.DiscountProductViewHolder> {
    Context context;

    List<RequestList> requestLists;
    public RequestListAdapter(Context context, List<RequestList> datalist) {
        requestLists = datalist;
        this.context = context;
    }

    @NonNull

    @Override
    public DiscountProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.request_layout, parent , false);
        return new DiscountProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DiscountProductViewHolder holder, int position) {
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
            requestImageView = itemView.findViewById(R.id.catgoryImageView);
        }
    }
}



