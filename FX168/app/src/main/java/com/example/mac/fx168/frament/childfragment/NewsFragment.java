package com.example.mac.fx168.frament.childfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.mac.fx168.R;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

/**
 * 要闻页面.
 */
public class NewsFragment extends Fragment {
    /**
     * 声明PullToRefreshList
     */
    private PullToRefreshListView pullToRefreshListView;
    /**
     * 声明PullToRefresh嵌套的ListView
     */
    private ListView listView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);
        this.pullToRefreshListView= (PullToRefreshListView) view.findViewById(R.id.pull_to_refresh_listView);
        initView();
        return view;
    }

    private void initView() {
        View view_head=getActivity().getLayoutInflater().inflate(R.layout.news_listview_head,null);
        //获得嵌入的ListView
        ListView listView=this.pullToRefreshListView.getRefreshableView();
        listView.addHeaderView(view_head);
    }

    /**
     * 要闻最上端的搜索点击事件，点击调转到搜索的Activity
     * @param view ImageView
     */
    public void search(View view){

    }

}
