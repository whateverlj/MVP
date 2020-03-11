package com.example.mvpdemo;

import android.os.Bundle;

import com.example.mvpdemo.mvpbase.BaseActivity;

import retrofit2.Response;

public class MainActivity extends BaseActivity {
    TestPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new TestPresenter();
        presenter.attachView(this);
        presenter.test("666");
    }


    @Override
    public void showData(Response successData) {
      // 展示页面数据
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }
}
