package com.example.zy.androidgithubuse;

/**
 * ================================================
 * 版    本：1.0
 * 创建日期：2018/4/2
 * 描    述：
 * 修订历史：
 * ================================================
 */
public class User {
    private boolean isClick;

    public User(boolean isClick) {
        this.isClick = isClick;
    }

    public boolean isClick() {
        return isClick;
    }

    public void setClick(boolean click) {
        isClick = click;
    }
}
