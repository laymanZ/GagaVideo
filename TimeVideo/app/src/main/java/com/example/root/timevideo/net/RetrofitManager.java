package com.example.root.timevideo.net;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;



public enum RetrofitManager
{
    INSTANCE;

    private Retrofit retrofit;

    public void initRetrofit(){
        retrofit = new Retrofit.Builder()
                .baseUrl("")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }


    public <T> T create(Class<T> service)
    {
        return retrofit.create(service);
    }
}
