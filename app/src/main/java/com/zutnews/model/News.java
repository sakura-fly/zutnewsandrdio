package com.zutnews.model;

public class News {

    private String title;
    private String content;
    private String auth;
    private String time;


    public News() {
    }

    public News(String title, String content, String auth, String time) {
        this.title = title;
        this.content = content;
        this.auth = auth;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
