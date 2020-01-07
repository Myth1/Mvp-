package com.mythqian.project.util;

import com.hazz.baselibs.net.BaseHttpResult;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiService {
    //todo eg:
    @GET("api/data/Android/10/1")
    Observable<BaseHttpResult<List<Object
                        >>> getGankData();
}
