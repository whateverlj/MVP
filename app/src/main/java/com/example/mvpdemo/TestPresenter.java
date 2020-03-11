package com.example.mvpdemo;

import com.example.mvpdemo.mvpbase.BaseModel;
import com.example.mvpdemo.mvpbase.BasePresenter;
import com.example.mvpdemo.mvpbase.BaseView;
import com.example.mvpdemo.mvpbase.MvpCallBack;

import retrofit2.Response;

public  class TestPresenter extends BasePresenter<BaseView> {


    public  void test(String params) {
        if (!isViewAttached()) {
            //如果没有View引用就不加载数据
            return;
        }
        //显示正在加载进度条
        getView().showLoading();
        new BaseModel<TestBean>().sendRequest("token", params,new MvpCallBack<Response>() {
            @Override
            public void onSuccess(Response data) {
               getView().hideLoading();
               getView().showData(data);
            }

            @Override
            public void onFailure() {
                getView().hideLoading();
                getView().showToast("网络连接错误");
            }
        });
    }
}
