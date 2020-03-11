package com.example.mvpdemo.mvpbase;

import android.app.Activity;
import android.os.Bundle;

public abstract class BaseActivity extends Activity implements BaseView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showToast(String msg) {

    }
}
