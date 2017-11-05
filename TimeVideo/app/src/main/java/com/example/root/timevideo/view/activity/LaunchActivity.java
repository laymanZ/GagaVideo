package com.example.root.timevideo.view.activity;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.root.timevideo.MainActivity;
import com.example.root.timevideo.R;
import com.example.root.timevideo.api.ApiContents;
import com.example.root.timevideo.utils.GlideUtils;
import com.flaviofaria.kenburnsview.KenBurnsView;
import com.flaviofaria.kenburnsview.Transition;

public class LaunchActivity extends AppCompatActivity {

    private KenBurnsView indexImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        getSupportActionBar().hide();
        indexImg = (KenBurnsView)findViewById(R.id.index_img);
        GlideUtils.INSTANCE.loadIndexImage(this, ApiContents.randomPic,indexImg);
        indexImg.setTransitionListener(new KenBurnsView.TransitionListener() {
            @Override
            public void onTransitionStart(Transition transition) {
            }
            @Override
            public void onTransitionEnd(Transition transition) {
                startActivity(new Intent(LaunchActivity.this, MainActivity.class));
                finish();
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        indexImg.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        indexImg.resume();
    }
}
