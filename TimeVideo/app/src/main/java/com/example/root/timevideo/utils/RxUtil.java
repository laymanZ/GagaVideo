package com.example.root.timevideo.utils;

import io.reactivex.disposables.CompositeDisposable;

public enum  RxUtil {

    INSTANCE;


    /**
     * 获取 CompositeDisposable 对象
     * */
    public CompositeDisposable getCompDisposable()
    {
        return CompositeDisposableHolder.getInstance();
    }

    private static class CompositeDisposableHolder
    {
        private static final CompositeDisposable compositeDis = new CompositeDisposable();

        private CompositeDisposableHolder(){}

        private static  CompositeDisposable getInstance()
        {
            return compositeDis;
        }
    }

}
