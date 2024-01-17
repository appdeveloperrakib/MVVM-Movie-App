package com.appdeveloperrakib.mvvmmovieapp.View.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.appdeveloperrakib.mvvmmovieapp.R;
import com.appdeveloperrakib.mvvmmovieapp.Service.Model.Result;
import com.bumptech.glide.Glide;

import java.util.List;

public class TopMovieListAdapter extends RecyclerView.Adapter<TopMovieListAdapter.MyViewHolder> {

    public  Context context;
    public  List<Result> mList;

    public TopMovieListAdapter(Context context, List<Result> mList) {
        this.context = context;
        this.mList = mList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.movie_item,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.title.setText(mList.get(position).getTitle());
        holder.rating.setText(mList.get(position).getVoteAverage().toString());
        holder.releasedate.setText(mList.get(position).getReleaseDate());
        Glide.with(context).load("https://image.tmdb.org/t/p/w500"+mList.get(position).getPosterPath())
                .into(holder.mImageView);


    }

    @Override
    public int getItemCount() {

        if (this.mList != null) {
            return mList.size();
        }else {
            return 0;
        }


    }

    public  class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView mImageView;
        TextView title,rating,releasedate;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title);
            rating = itemView.findViewById(R.id.rating);
            releasedate = itemView.findViewById(R.id.release_Date);
            mImageView = itemView.findViewById(R.id.avatar);


        }
    }


}
