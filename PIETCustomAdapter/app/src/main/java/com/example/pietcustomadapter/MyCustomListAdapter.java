package com.example.pietcustomadapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyCustomListAdapter extends ArrayAdapter<String> {

    Activity context;
    String[] pname;
    String[] pprice;
    Integer[] pimage;

    public MyCustomListAdapter(Activity context, String[] pname, String[] pprice, Integer[] pimage) {
        super(context, R.layout.mycutomlist, pname);
        this.context = context;
        this.pname = pname;
        this.pprice = pprice;
        this.pimage = pimage;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.mycutomlist,null,true);

        TextView name = rowView.findViewById(R.id.pname);
        TextView price = rowView.findViewById(R.id.pprice);
        ImageView image = rowView.findViewById(R.id.pimage);

        name.setText(pname[position]);
        price.setText(pprice[position]);
        image.setImageResource(pimage[position]);

        return rowView;
    }

}
