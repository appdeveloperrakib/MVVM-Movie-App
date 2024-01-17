package com.appdeveloperrakib.mvvmmovieapp.Service.Network;

import com.appdeveloperrakib.mvvmmovieapp.Service.Model.MovieModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiServices {

    @GET("3/discover/movie?api_key=d8cca6c73b27d6e498370800c0fa83e2")
    Call<MovieModel> getTopRatedMovieList();

}
