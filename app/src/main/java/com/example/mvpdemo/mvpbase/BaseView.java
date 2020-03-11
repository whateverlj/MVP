package com.example.mvpdemo.mvpbase;

import retrofit2.Response;

public interface BaseView {
    void showData(Response successData);

    void showLoading();

    void hideLoading();

    void showToast(String msg);
}
