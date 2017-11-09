package com.example.root.timevideo.dymanic;


import com.example.root.timevideo.cache.BaseUrlCache;

public class RealUrlSubject implements UrlSubject
{
    @Override
    public Object getBaseUrl(String key)
    {
        return BaseUrlCache.INSTANCE.getCache().get(key);
    }
}
