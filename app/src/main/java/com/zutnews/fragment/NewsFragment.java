package com.zutnews.fragment;

import android.app.Fragment;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.Toast;

import com.example.sakura.zutnews.R;
import com.example.sakura.zutnews.databinding.FragmentNewsBinding;
import com.example.sakura.zutnews.databinding.NewsListBinding;
import com.zutnews.act.NewsAct;
import com.zutnews.adapter.NewsAdapter;
import com.zutnews.model.News;

import java.util.List;


public class NewsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final FragmentNewsBinding fragmentNewsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_news, container, false);
        final NewsAct na = new NewsAct();
        final List<News> newList = na.list();
        final BaseAdapter nadp = new NewsAdapter(newList, this.getActivity());
        fragmentNewsBinding.list.setAdapter(nadp);
        fragmentNewsBinding.refresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                Log.e("log", "refresh");
                List<News> rl = na.refreshList();
                newList.addAll(0, rl);
                nadp.notifyDataSetChanged();
                Toast.makeText(NewsFragment.this.getActivity(),"刷新了" + rl.size() + "条",Toast.LENGTH_SHORT).show();
                fragmentNewsBinding.refresh.setRefreshing(false);
            }
        });
        return fragmentNewsBinding.getRoot();
    }

}
