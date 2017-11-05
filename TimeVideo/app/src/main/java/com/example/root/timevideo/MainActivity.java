package com.example.root.timevideo;

import android.os.Bundle;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.example.root.timevideo.view.custom.NoScrollViewPager;


public class MainActivity extends BaseActivity
{

    private BottomNavigationBar bottomNavigationBar;
    private NoScrollViewPager mPager;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initControll();

    }

    private void initView()
    {
        mPager = (NoScrollViewPager)findViewById(R.id.main_container);
        bottomNavigationBar = (BottomNavigationBar)findViewById(R.id.bottom_navigation_bar);

    }

    private void initControll()
    {
        bottomNavigationBar.addItem(new BottomNavigationItem(R.drawable.ic_change_history_black_24dp,R.string.bottombar_index))
                .setActiveColor(R.color.navigationBlack)
                .addItem(new BottomNavigationItem(R.drawable.ic_clear_black_24dp,R.string.bottombar_attention))
                .setActiveColor(R.color.navigationBlack)
                .addItem(new BottomNavigationItem(R.drawable.ic_panorama_fish_eye_black_24dp,R.string.bottombar_notify))
                .setActiveColor(R.color.navigationBlack)
                .addItem(new BottomNavigationItem(R.drawable.ic_check_box_outline_blank_black_24dp,R.string.bottombar_my))
                .setActiveColor(R.color.navigationBlack)
                .initialise();

        bottomNavigationBar.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position) {
                switch (position)
                {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
            }

            @Override
            public void onTabUnselected(int position) {

            }

            @Override
            public void onTabReselected(int position) {

            }
        });
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();

    }
}
