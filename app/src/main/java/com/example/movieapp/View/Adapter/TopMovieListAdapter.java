package com.example.movieapp.View.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.movieapp.R;
import com.example.movieapp.Service.Model.Result;

import java.util.List;

public class TopMovieListAdapter extends RecyclerView.Adapter<TopMovieListAdapter.MyViewHolder> {

    private Context mContext;
    private List<Result> mList;


    public TopMovieListAdapter(Context mcoContext, List<Result> mList) {
        this.mContext = mcoContext;
        this.mList = mList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.movie_single_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.mTitle.setText(mList.get(position).getTitle());
        holder.mRating.setText(mList.get(position).getVoteAverage().toString());
        holder.mReleaseDate.setText(mList.get(position).getReleaseDate());

        Glide.with(mContext).load("https://image.tmdb.org/t/p/w500/" +mList.get(position).getPosterPath()).into(holder.mImageView);


        // https://image.tmdb.org/t/p/w500/2CAL2433ZeIihfX1Hb2139CX0pW.jpg

    }

    @Override
    public int getItemCount() {

        if (this.mList !=null){

            return mList.size();
        }
        else
            return 0;


    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView mImageView;
        TextView mTitle,mRating,mReleaseDate;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            mTitle = itemView.findViewById(R.id.title);
            mRating = itemView.findViewById(R.id.rating);
            mReleaseDate = itemView.findViewById(R.id.release_date);
            mImageView = itemView.findViewById(R.id.avatar);
        }
    }

}
