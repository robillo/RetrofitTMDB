package com.appbusters.robinkamboj.retrofittmdb.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.appbusters.robinkamboj.retrofittmdb.R;
import com.appbusters.robinkamboj.retrofittmdb.controller.Movies_Adapter;
import com.appbusters.robinkamboj.retrofittmdb.model.Movie;
import com.appbusters.robinkamboj.retrofittmdb.model.MoviesResponse;
import com.appbusters.robinkamboj.retrofittmdb.rest.APIClient;
import com.appbusters.robinkamboj.retrofittmdb.rest.APIInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    // TODO - insert your themoviedb.org API KEY here
    private final static String API_KEY = "13befb0c6409e8c61c5e9ec4265a1d1c";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.movies_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        APIInterface.ApiInterface apiService =
                APIClient.getClient().create(APIInterface.ApiInterface.class);

        Call<MoviesResponse> call = apiService.getTopRatedMovies(API_KEY);
        call.enqueue(new Callback<MoviesResponse>() {
            @Override
            public void onResponse(Call<MoviesResponse> call, Response<MoviesResponse> response) {
                int statusCode = response.code();
                List<Movie> movies = response.body().getResults();
                recyclerView.setAdapter(new Movies_Adapter(movies, R.layout.list_item_movie, getApplicationContext()));
            }

            @Override
            public void onFailure(Call<MoviesResponse> call, Throwable t) {
                // Log error here since request failed
                Log.e(TAG, t.toString());
            }
        });
    }
}
