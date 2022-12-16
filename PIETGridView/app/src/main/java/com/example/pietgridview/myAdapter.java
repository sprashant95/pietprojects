package com.example.pietgridview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class myAdapter extends ArrayAdapter<Integer> {

    Integer[] image;
    Activity context;

    public myAdapter(Activity context, Integer[] image) {
        super(context, R.layout.custom_layout, image);
        this.image = image;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.custom_layout,null,true);

        ImageView imageView = rowView.findViewById(R.id.imageView);

        imageView.setImageResource(image[position]);


        return rowView;
    }
}
