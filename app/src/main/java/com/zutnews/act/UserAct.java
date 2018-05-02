package com.zutnews.act;

import com.zutnews.model.User;

public class UserAct {

    public User longin(User  u){
        System.out.println("news u" + u);
        try {
            System.out.println(u.userName == null);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return u;
    }

}
