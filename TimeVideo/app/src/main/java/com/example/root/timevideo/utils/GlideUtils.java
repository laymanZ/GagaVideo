package com.example.root.timevideo.utils;


import android.content.Context;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public enum  GlideUtils
{
    INSTANCE;

    public void loadLargeImage(Context context,String url,ImageView imageView)
    {

    }

    public void loadIndexImage(Context context,String url,ImageView imageView)
    {
        int num = 1 + (int) (Math.random()*1000);
        Glide.with(context)
                .load(url+num)
                .into(imageView);

        Toast.makeText(context,url+num,Toast.LENGTH_SHORT).show();
    }

    public void loadCircleImage(String url)
    {

    }

    public void loadCircleImage(String url,int randomNum)
    {

    }


}
