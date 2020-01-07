package com.mythqian.project.module.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.hazz.baselibs.base.BaseMvpActivity;
import com.mythqian.project.R;

public class MainActivity extends BaseMvpActivity<com.mythqian.project.module.main.MainPresenter> implements com.mythqian.project.module.main.Contract.View {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void getIntent(Intent intent) {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected com.mythqian.project.module.main.MainPresenter createPresenter() {
        return new com.mythqian.project.module.main.MainPresenter();
    }

    @Override
    public void showError(String msg) {

    }
}
