package com.example.demo.dao;

import java.io.Serializable;

public class DemoDao implements Serializable {
    private static final long serialVersionUID = 7364275366203360656L;
    private String title = "";
    private String content = "";
    private String result = "";

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

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
