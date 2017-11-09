package com.example.root.timevideo.net;


import com.example.root.timevideo.bean.OnTicketSale;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface NetService
{


    /**
     * 正在售票(包括正在热映和即将上映)
     *
     * @param locationId int
     */
    @GET("PageSubArea/HotPlayMovies.api?")
    Observable<OnTicketSale> getTicketSaling(@Query("locationId") int locationId);

    /**
     * 正在热映
     *
     * @param locationId int
     **/
    @GET("Showtime/LocationMovies.api?")
    Observable<OnTicketSale> getReveal(@Query("locationId") int locationId);


    /**
     * 即将上映
     *
     * @param locationId int
     **/
    @GET("Movie/MovieComingNew.api?")
    Observable<OnTicketSale> getCOmingSoon(@Query("locationId") int locationId);

    /**
     * 影片详情
     *
     * @param locationId int
     * @param movieId    int
     **/
    @GET("movie/detail.api?")
    Observable<OnTicketSale> getDetail(@QueryMap Map<String, String> map);


    /**
     * 演职员表
     *
     * @param movieId int
     **/
    @GET("Movie/MovieCreditsWithTypes.api?")
    Observable<OnTicketSale> getListOfActor(@Query("movieId") int movieId);


    /**
     * 影片评论
     *
     * @param movieId int
     **/
    @GET("movie/hotComment.api?")
    Observable<OnTicketSale> getHotCOmment(@Query("movieId") int movieId);

    /**
     * 预告片 拍摄花絮
     *
     * @param pageIndex int
     * @param movieId   int
     **/
    @GET("Video.api?")
    Observable<OnTicketSale> getVIdeo(@QueryMap Map<String, Integer> map);

    /**
     * 剧照
     *
     * @param movieId int
     **/
    @GET("Movie/ImageAll.api?")
    Observable<OnTicketSale> getImg(@Query("movieId") int movieId);


}
