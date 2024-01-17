package com.appdeveloperrakib.mvvmmovieapp.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.appdeveloperrakib.mvvmmovieapp.Service.Model.Result;
import com.appdeveloperrakib.mvvmmovieapp.Service.Repository.MovieRepository;

import java.util.List;

public class MovieListViewModel extends AndroidViewModel {

    public MovieRepository mRepo;
    public MovieListViewModel(@NonNull Application application) {
        super(application);
        mRepo = MovieRepository.getInstance(application);
    }

    public MutableLiveData<List<Result>> getTopRatedMovieList(){

        return mRepo.getTopRatedMovieList();

    }



}
