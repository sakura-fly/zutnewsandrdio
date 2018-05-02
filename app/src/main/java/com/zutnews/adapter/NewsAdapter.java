package com.zutnews.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.sakura.zutnews.R;
import com.example.sakura.zutnews.databinding.NewsListBinding;
import com.zutnews.model.News;

import java.util.List;

public class NewsAdapter extends BaseAdapter {



    private List<News> newsList;
    private Context context;


    public NewsAdapter(List<News> newsList, Context context) {
        this.newsList = newsList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return newsList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

//       try{
           NewsListBinding newsListBinding = DataBindingUtil.inflate(LayoutInflater.from(context),R.layout.news_list,parent,false);

           newsListBinding.setNews(newsList.get(position));
//       } catch (Exception e){
//           e.printStackTrace();
//       }
        return newsListBinding.getRoot();
    }
}
