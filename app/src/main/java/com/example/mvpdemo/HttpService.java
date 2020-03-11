package com.example.mvpdemo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface HttpService {

    @GET("test")
    Call<TestBean> getData(@Header("Authorization") String token, @Query("data") String data);

}
