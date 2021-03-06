package com.realdynamite.nestedrecycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ChildRecyclerAdapter extends RecyclerView.Adapter<ChildRecyclerAdapter.ViewHolder> {
    List<String>items;

    public ChildRecyclerAdapter(List<String> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.itemTextView.setText(items.get(position));

        GrandChildRecyclerAdapter grandChildRecyclerAdapter = new GrandChildRecyclerAdapter(items);
        holder.grandChildRecyclerView.setAdapter(grandChildRecyclerAdapter);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView itemTextView;
        RecyclerView grandChildRecyclerView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemTextView = itemView.findViewById(R.id.itemTextView);
            grandChildRecyclerView = itemView.findViewById(R.id.grandchildrecyclerView);
        }
    }
}
