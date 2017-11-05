package com.example.root.timevideo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.root.timevideo.utils.RxUtil;


public class BaseActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        

    }


    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        RxUtil.INSTANCE.getCompDisposable().clear();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,String[] permissions,int[] grantResults)
    {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
}
