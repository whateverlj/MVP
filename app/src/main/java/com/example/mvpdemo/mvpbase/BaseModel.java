package com.example.mvpdemo.mvpbase;

import com.example.mvpdemo.HttpService;
import com.example.mvpdemo.retrofit.RetrofitUtil;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public  class BaseModel<T> {
    private static HttpService httpService;
    public  void sendRequest(String token,String param,final MvpCallBack<Response> callback) {
        httpService = RetrofitUtil.getService(HttpService.class,token);
        Call<T> call = (Call<T>)httpService.getData(token,param);
        call.enqueue(new Callback<T>() {
            @Override
            public void onResponse(Call<T> call, Response<T> response) {
                callback.onSuccess(response);
            }

            @Override
            public void onFailure(Call<T> call, Throwable t) {
                callback.onFailure();
            }
        });
    }
}
