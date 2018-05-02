package com.zutnews.fragment;

import android.app.Fragment;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sakura.zutnews.R;
import com.example.sakura.zutnews.databinding.FragmentMineBinding;
import com.zutnews.act.NewsAct;
import com.zutnews.adapter.NewsAdapter;

public class MineFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentMineBinding fragmentMineBinding  = DataBindingUtil.inflate(inflater, R.layout.fragment_mine,container,false);
//        FragmentMineBinding.attlist.setAdapter(new NewsAdapter(new NewsAct().attList(),this.getActivity()));
        return fragmentMineBinding.getRoot();
    }

}
