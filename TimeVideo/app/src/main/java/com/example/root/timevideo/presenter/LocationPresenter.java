package com.example.root.timevideo.presenter;

import android.content.Context;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.example.root.timevideo.listener.VideoLocationListener;


public class LocationPresenter implements AMapLocationListener
{

    private VideoLocationListener mListener;
    private Context mContext;

    //定位需要的声明
    private AMapLocationClient mLocationClient = null;//定位发起端
    private AMapLocationClientOption mLocationOption = null;//定位参数

    public LocationPresenter(Context mContext,VideoLocationListener listener)
    {
        this.mContext = mContext;
        this.mListener = listener;
        initLoc();
    }


    @Override
    public void onLocationChanged(AMapLocation aMapLocation)
    {
        if (aMapLocation != null)
        {
            if (aMapLocation.getErrorCode() == 0)
            {
                mListener.onPosSuccess(aMapLocation.getCity());
            }
            else
            {
                mListener.onPosFailed(aMapLocation.getErrorCode(),aMapLocation.getErrorInfo());
            }
        }
    }

        //定位
        private void initLoc()
        {
        //初始化定位
        mLocationClient = new AMapLocationClient(mContext);
        //设置定位回调监听
        mLocationClient.setLocationListener(this);
        //初始化定位参数
        mLocationOption = new AMapLocationClientOption();
        //设置定位模式为高精度模式，Battery_Saving为低功耗模式，Device_Sensors是仅设备模式
        mLocationOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);
        //设置是否返回地址信息（默认返回地址信息）
        mLocationOption.setNeedAddress(true);
        //设置是否只定位一次,默认为false
        mLocationOption.setOnceLocation(true);
        //设置是否强制刷新WIFI，默认为强制刷新
        mLocationOption.setWifiActiveScan(true);
        //设置是否允许模拟位置,默认为false，不允许模拟位置
        mLocationOption.setMockEnable(false);
        //设置定位间隔,单位毫秒,默认为2000ms
        mLocationOption.setInterval(2000);
        //给定位客户端对象设置定位参数
        mLocationClient.setLocationOption(mLocationOption);
        //启动定位
        mLocationClient.startLocation();
    }
}
