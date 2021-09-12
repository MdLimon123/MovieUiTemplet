package com.example.movieapp.Service.Network;

import com.example.movieapp.Service.Model.MovieModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiServices {

    @GET("3/movie/top_rated?api_key=ba911722b684f116d2e1d820fb5717a7")
    Call<MovieModel> getTopRatedMovieLists();

}
