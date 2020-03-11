package com.example.mvpdemo.mvpbase;

public interface MvpCallBack<T> {

    void onSuccess(T data);

    void onFailure();


}
