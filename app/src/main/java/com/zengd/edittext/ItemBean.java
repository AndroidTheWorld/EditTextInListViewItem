package com.zengd.edittext;

/**
 * Created by zengd on 2016/8/17 0017.
 */
public class ItemBean {
    private String text;
    private boolean isFocus;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isFocus() {
        return isFocus;
    }

    public void setFocus(boolean focus) {
        isFocus = focus;
    }
}
