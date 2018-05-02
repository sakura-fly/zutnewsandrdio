package com.zutnews.fragment;

import android.app.Fragment;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sakura.zutnews.R;
import com.example.sakura.zutnews.databinding.FragmentAttentionBinding;
import com.zutnews.act.NewsAct;
import com.zutnews.adapter.NewsAdapter;


public class AttentionFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentAttentionBinding fragmentAttentionBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_attention,container,false);
        fragmentAttentionBinding.attlist.setAdapter(new NewsAdapter(new NewsAct().attList(),this.getActivity()));
        return fragmentAttentionBinding.getRoot();
    }

}
