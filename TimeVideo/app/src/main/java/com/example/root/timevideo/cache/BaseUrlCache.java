package com.example.root.timevideo.cache;


import java.util.HashMap;
import java.util.Map;

public enum BaseUrlCache
{
    INSTANCE;

    private final Map<String, String> mCache = new HashMap<>();

    {
        mCache.put("BASE_URL_TIME", "https://api-m.mtime.cn/");
        mCache.put("BASE_URL_TICKET", "https://ticket-api-m.mtime.cn/");
    }

    public Map<String, String> getCache()
    {
        return mCache;
    }

}
