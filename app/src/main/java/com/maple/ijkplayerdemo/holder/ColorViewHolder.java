package com.maple.ijkplayerdemo.holder;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.maple.ijkplayerdemo.R;
import com.maple.ijkplayerdemo.widgets.ColorImageView;

public class ColorViewHolder extends RecyclerView.ViewHolder {
    public ColorImageView colorButton;

    public ColorViewHolder(View itemView) {
        super(itemView);
        colorButton = itemView.findViewById(R.id.color_button);
    }
}
