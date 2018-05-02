package com.zutnews.fragment;

import android.app.Fragment;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sakura.zutnews.R;
import com.example.sakura.zutnews.databinding.FragmentNewsBinding;
import com.zutnews.act.NewsAct;
import com.zutnews.adapter.NewsAdapter;


public class NewsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentNewsBinding fragmentNewsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_news,container,false);
        fragmentNewsBinding.list.setAdapter(new NewsAdapter(new NewsAct().list(),this.getActivity()));
        return fragmentNewsBinding.getRoot();
    }

}
