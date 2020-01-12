package com.example.myfavfood.adapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.myfavfood.Detail;
import com.example.myfavfood.MainActivity;
import com.example.myfavfood.R;
import com.example.myfavfood.model.Makanan;

import java.util.ArrayList;

public class ListFoodAdapter extends RecyclerView.Adapter<ListFoodAdapter.ListViewHolder> {
    private ArrayList<Makanan> listMakanan;
    public ListFoodAdapter(ArrayList<Makanan> list) {
        this.listMakanan = list;
    }

    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public interface OnItemClickCallback {
        void onItemClicked(Makanan data);
    }

    @NonNull
    @Override
    public ListFoodAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.food_item, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Makanan makanan = listMakanan.get(position);

        Glide.with(holder.itemView.getContext())
                .load(makanan.getFoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);

        holder.tvName.setText(makanan.getNama());
        holder.tvDetail.setText(makanan.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahpage = new Intent(holder.itemView.getContext(), Detail.class);
                Bundle bundle = new Bundle();
                bundle.putInt("img", makanan.getFoto());
                pindahpage.putExtras(bundle);
                pindahpage.putExtra("nama",makanan.getNama());
                pindahpage.putExtra("desc",makanan.getDetail());
                holder.itemView.getContext().startActivity(pindahpage);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listMakanan.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
