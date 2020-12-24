package com.example.lab6.api;

import com.example.lab6.model.Example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FlickrAPI {
    @GET("services/rest/?method=flickr.photos.getRecent&api_key=b96a5e95a8e634e25c57bfbdcc2cc432&extras=url_s&format=json&nojsoncallback=1")
        Call<Example> getRecent();

    @GET("services/rest/?method=flickr.photos.search&api_key=b96a5e95a8e634e25c57bfbdcc2cc432&extras=url_s&format=json&nojsoncallback=1")
        Call<Example> searchPhotos(@Query("text") String keyWord);
}

