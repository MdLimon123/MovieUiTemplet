package com.example.movieapp.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.movieapp.Service.Model.Result;
import com.example.movieapp.Service.Repository.MovieRepository;

import java.util.List;

public class MovieListViewModel extends AndroidViewModel {

    private MovieRepository mRepo;

    public MovieListViewModel(@NonNull Application application) {
        super(application);

        mRepo = MovieRepository.getInstance(application);

    }

    public LiveData<List<Result>> getToRatedMovieLists(){

        return mRepo.getTopRatedMovieLists();
    }
}
