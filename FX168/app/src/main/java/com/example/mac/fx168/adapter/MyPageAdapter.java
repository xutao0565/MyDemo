package com.example.mac.fx168.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import java.util.List;

/**
 * Created by mac on 16/6/14.
 */
public class MyPageAdapter extends FragmentPagerAdapter {
    /**
     * 数据源
     */
    private List<Fragment> fragments;

    /**
     * 注意：此FragmentManager为 getChildFragmentManager
     * @param fm ChildFragmentManager
     */
    public MyPageAdapter(FragmentManager fm,List<Fragment> fragments) {
        super(fm);
        this.fragments=fragments;
    }

    /**
     *获得当前的Fragment
     * @param position 索引位
     * @return 根据索引为从数据源中获取
     */
    @Override
    public Fragment getItem(int position) {
        return this.fragments.get(position);
    }

    /**
     * 从数据源中获得Fragment的数量
     * @return 数据源的大小
     */
    @Override
    public int getCount() {
        return this.fragments.size();
    }

    /**
     * 设置书签
     * @param position 索引位
     * @return 书签显示的内容
     */
    @Override
    public CharSequence getPageTitle(int position) {
        String title;
        switch (position){
            default:
                title=null;
                Log.e("TabLayout","The Error of Setting Title");
                break;

            case 0:
                title="要闻";
                break;

            case 1:
                title="速递";
                break;

            case 2:
                title="外汇";
                break;

            case 3:
                title="贵金属";
                break;

            case 4:
                title="期货";
                break;

            case 5:
                title="央行";
                break;

            case 6:
                title="政经";
                break;

            case 7:
                title="原油";
                break;

            case 8:
                title="行业";
                break;

            case 9:
                title="债市";
                break;

            case 10:
                title="股市";
                break;
        }
        return title;
    }
}
