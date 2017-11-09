package com.example.root.timevideo.net;


import com.example.root.timevideo.bean.OnTicketSale;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NetService
{


    /**
     * 正在售票(包括正在热映和即将上映)
     */
    @GET("https://api-m.mtime.cn/PageSubArea/HotPlayMovies.api?")
    Observable<OnTicketSale> getTicketSaling(@Query("locationId") int locationId);

    /**
     *
     * */

}
