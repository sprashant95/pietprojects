package com.example.pietrecyclerviewfb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyRecyclerViewAdapter extends FirebaseRecyclerAdapter<DBHolder, MyRecyclerViewAdapter.myviewholder> {

    public MyRecyclerViewAdapter(@NonNull FirebaseRecyclerOptions<DBHolder> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull DBHolder model)
    {
        holder.name.setText(model.getPname());
        holder.course.setText(model.getPdisease());
        Glide.with(holder.img.getContext()).load(model.getPimage()).into(holder.img);
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.customitem,parent,false);
        return new myviewholder(view);
    }

    class myviewholder extends RecyclerView.ViewHolder
    {
        CircleImageView img;
        TextView name,course;
        public myviewholder(@NonNull View itemView)
        {
            super(itemView);
            img= itemView.findViewById(R.id.img1);
            name= itemView.findViewById(R.id.nametext);
            course= itemView.findViewById(R.id.coursetext);
        }
    }
}
