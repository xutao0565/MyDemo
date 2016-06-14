package com.example.mac.fx168.frament;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mac.fx168.R;
import com.example.mac.fx168.adapter.MyPageAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 资讯页面.
 */
public class ConsultFragment extends Fragment {
    /**
     * 声明导航条
     */
    private TabLayout tabLayout;

    /**
     * 声明滑动的页面
     */
    private ViewPager viewPager;
    /**
     * 声明数据源
     */
    private List<Fragment> fragments;

    private MyPageAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_consult, container, false);
        //找到控件
        this.tabLayout= (TabLayout) view.findViewById(R.id.tabLayout_consult);
        this.viewPager= (ViewPager) view.findViewById(R.id.viewPager_consult);

        //初始化数据源
        initData();

        //TabLayout关联ViewPager
        this.tabLayout.setupWithViewPager(this.viewPager);

        return view;
    }

    /**
     * 初始化数据源
     */
    private void initData() {
        this.fragments=new ArrayList<>();

        //此处实例化各个子Fragment,并添加到数据源中



        //实例化适配器，并把ViewPager关联适配器
        this.adapter=new MyPageAdapter(getChildFragmentManager(),fragments);
        this.viewPager.setAdapter(adapter);


    }

}
