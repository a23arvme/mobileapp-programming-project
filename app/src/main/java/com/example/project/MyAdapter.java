package com.example.project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private ArrayList<Temple> templeList;

    public MyAdapter() {
        this.templeList = new ArrayList<>();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView myTextView;
        public ViewHolder(View view) {
            super(view);
            myTextView = itemView.findViewById(R.id.text_view_item);
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
        viewHolder.myTextView.setText(templeList.get(i).toString());
    }

    @Override
    public int getItemCount() {
        return templeList.size();
    }

    public void setTempleList(ArrayList<Temple> list){
        this.templeList = list;
    }
}