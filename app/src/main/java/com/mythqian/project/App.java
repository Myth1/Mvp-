package com.mythqian.project;

import android.app.Application;

import com.hazz.baselibs.app.BaseApplication;

import me.jessyan.autosize.AutoSizeConfig;

public class App extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        //高度为标准 非manifest定义比例拉伸宽度
        AutoSizeConfig.getInstance().setBaseOnWidth(false);
    }
}
