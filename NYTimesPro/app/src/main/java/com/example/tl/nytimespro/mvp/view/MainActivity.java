package com.example.tl.nytimespro.mvp.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;

import com.example.tl.nytimespro.R;

/**
 * Created by HJ25 on 2017/2/7.
 */

public class MainActivity extends BaseActivity {

    private Toolbar toolbar;//导航栏
    private DrawerLayout drawerLayout;//抽屉效果整体布局
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        setupDrawer();
    }

    public void init(){
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        drawerLayout= (DrawerLayout) findViewById(R.id.drawer_layout);
        toolbar.setTitle("随身看");
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));

        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//返回图标
//        getSupportActionBar().setDisplayShowHomeEnabled(false);
    }

    /**
     * 抽屉效果（menu效果）
     */
    private void setupDrawer() {
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

}
