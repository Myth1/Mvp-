package com.mythqian.project.module.main;

import android.content.Context;

import com.hazz.baselibs.mvp.BasePresenter;
import com.yanzhenjie.permission.Action;
import com.yanzhenjie.permission.AndPermission;
import com.yanzhenjie.permission.runtime.Permission;

import java.util.List;

public class MainPresenter extends BasePresenter<Contract.Model,Contract.View> {
    @Override
    protected Contract.Model createModel() {
        return new MainModel();
    }

    /**
     * 6.0权限申请
     */
    public void requestPermission(Context context){
        AndPermission.with(context)
                .runtime()
                .permission(Permission.WRITE_EXTERNAL_STORAGE,Permission.READ_EXTERNAL_STORAGE)
                .onGranted((List<String> data)->{

                })
                .start();
    }
}
