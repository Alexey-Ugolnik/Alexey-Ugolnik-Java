package com.abc.data;

import java.util.Locale;

public class Data {
    public int x;
    public String y;
    private int value;
    private String text;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Data() {
        System.out.println("In default Constructor");
    }

    public Data(int value, String text) {
        System.out.println("In Constructor with params");
        this.value = value;
        this.text = text;
    }

    public int someLogicWithoutParams() {
        return 0;
    }

    public void someLogic() {
        System.out.println("In Method some logic");
    }

    /*public String processSomeString(String str) {
        return str.toUpperCase(Locale.ROOT);
    }*/
}
