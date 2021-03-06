package com.coder.guoy.recyclerview.ui.coordinator;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.coder.guoy.recyclerview.R;
import com.coder.guoy.recyclerview.base.MvvmBaseActivity;
import com.coder.guoy.recyclerview.databinding.ActivityPlayCoordinatorLayoutBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * @Version:v1.0
 * @Author:Guoy
 * @CreateTime:2017年5月2日
 * @Descrpiton:CoordinatorLayout协调布局
 */
public class PlayCoordinatorLayout extends MvvmBaseActivity<ActivityPlayCoordinatorLayoutBinding> implements View.OnClickListener {
    private List<String> mList = new ArrayList<String>();
    private LinearLayoutManager mLayoutManager;
    private RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_coordinator_layout);
        showContentView();
        setToolbarVisible(View.GONE);
        bindingView.imageviewBack.setOnClickListener(this);
        for (int i = 1; i <= 20; i++) {
            mList.add("Recycler条目:" + i);
        }
        adapter = new RecyclerViewAdapter(this, mList);
        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        bindingView.recyclerview.setLayoutManager(mLayoutManager);
        bindingView.recyclerview.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        finish();
    }
}
