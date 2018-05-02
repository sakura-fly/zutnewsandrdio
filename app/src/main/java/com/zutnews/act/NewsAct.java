package com.zutnews.act;

import com.zutnews.model.News;

import java.util.ArrayList;
import java.util.List;

public class NewsAct {

    public List<News> list(){
        List<News> l = new ArrayList<>();
        l.add(new News("恭喜中原工学院荣升一本","中原工学院与9999年成为一本","龙傲天","9999-99-99"));
        l.add(new News("西区食堂升级","经过艰难的努力，西区食堂进行升级","龙傲天","6666-66-66"));
        l.add(new News("校网免费用","学校决定提供免费校网","玛丽苏","2233-22-33"));
        l.add(new News("学校决定进行扩建","学校决定扩建四个校区，分别命名为青龙、白虎、朱雀、玄武","玛丽苏","8888-88-88"));
        l.add(new News("学校开设电竞专业","学校开设电竞专业，将有不同的录取条件，视力地狱0.5优先录取","李青","8844-04-03"));


        return l;


    }
    public List<News> attList(){
        List<News> l = new ArrayList<>();
        l.add(new News("我校将与战争学院联谊","由于各种原因，我校将与战争学院联谊","瑞兹","666-06-06"));
        l.add(new News("FFF团成立","我校与今日成立新社团，名为FFF团","木秀吉","1234-59-95"));
        l.add(new News("学校发现王的遗迹","由于学校扩建，发现王的遗迹，韩国人表示中原工学院是他们建立的，我们院长表示：无稽之谈","韩大棒思密达","公元前4444-44-44"));


        return l;


    }


}
