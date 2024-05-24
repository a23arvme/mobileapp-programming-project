package com.example.project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private ArrayList<Pyramid> pyramidList;

    public MyAdapter() {
        this.pyramidList = new ArrayList<>();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        TextView content;
        public ViewHolder(View view) {
            super(view);
            content = itemView.findViewById(R.id.text_view_item);
            title = itemView.findViewById(R.id.item_title);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_view_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.title.setText(pyramidList.get(i).getName());
        viewHolder.content.setText(pyramidList.get(i).toString());

    }

    @Override
    public int getItemCount() {
        return pyramidList.size();
    }

    public void setPyramidList(ArrayList<Pyramid> list){
        this.pyramidList.clear();
        this.pyramidList.addAll(list);
        notifyDataSetChanged();
    }
}