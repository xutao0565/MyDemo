package com.example.mac.fx168.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * 用于Fragement中的ListView的工具类
 */
public abstract class MyBaseAdapter<T> extends BaseAdapter {
    /**
     * 数据源
     */
    private List<T> list;
    /**
     * 布局管理器对象，用于生成布局
     */
    private LayoutInflater layoutInflater;

    public MyBaseAdapter(Context context,List<T> list){
        this.list = list;

        this.layoutInflater=LayoutInflater.from(context);
    }

    /**
     * 获得条目数量的方法
     * @return
     */
    @Override
    public int getCount() {
        return this.list.size();
    }

    /**
     * 获得当前的条目
     * @param i 索引位
     * @return 当前的条目
     */
    @Override
    public Object getItem(int i) {
        return this.getItem(i);
    }

    /**
     * 获得索引
     * @param i 索引
     * @return i
     */
    @Override
    public long getItemId(int i) {
        return i;
    }

    /**
     * 用于显示条目的方法
     * @param i 索引位
     * @param view 当前的view
     * @param viewGroup 容器
     * @return 抽象方法
     */
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return getItemView(i,view,viewGroup);
    }

    /**
     * 提供给子类复用的方法
     * @param position 索引位
     * @param convertView 复用的view
     * @param parent 容器
     * @return 子类复用的convertView
     */
    public abstract View getItemView(int position, View convertView, ViewGroup parent);

    /**
     * 获得当前布局管理的方法
     * @return 布局管理器
     */
    public LayoutInflater getLayoutInflater(){
        return this.layoutInflater;
    }

    /**
     * 添加数据的方法
     * @param list 传入的更新的数据
     */
    public void addData(List<T> list){
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    /**
     * 清除数据的方法
     */
    public void clearData(){
        this.list.clear();
        notifyDataSetChanged();
    }


}
