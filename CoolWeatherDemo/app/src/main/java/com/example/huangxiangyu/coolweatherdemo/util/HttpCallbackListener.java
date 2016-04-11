package com.example.huangxiangyu.coolweatherdemo.util;

/**
 * Created by huangxiangyu on 16/4/11.
 * In CoolWeatherDemo
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
