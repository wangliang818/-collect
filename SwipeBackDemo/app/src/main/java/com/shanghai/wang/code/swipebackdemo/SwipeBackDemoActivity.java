package com.shanghai.wang.code.swipebackdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.shanghai.wang.code.swipebackdemo.base.BaseSwipeBackActivity;

public class SwipeBackDemoActivity extends BaseSwipeBackActivity {



    @Override
    public int getLayoutId() {
        return  R.layout.activity_swipe_back_demo;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {


        //设置侧滑返回触发范围
        mSwipeBackLayout.setEdgeDp(120);
        // 初始化ToolBar

    }


}
