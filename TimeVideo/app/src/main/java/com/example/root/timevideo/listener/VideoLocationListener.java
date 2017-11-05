package com.example.root.timevideo.listener;



public interface VideoLocationListener
{

    void onPosSuccess(String cityName);
    void onPosFailed(int errorCode,String errorInfo);

}
