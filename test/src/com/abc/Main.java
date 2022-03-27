package com.abc;

import com.abc.data.Data;
import com.abc.util.JavaUtil;

public class Main {
    public static void main(String[] args) {
        Data data = new Data(777, "Some text for constructor with params");
        Data data1 = new Data();
        JavaUtil util = new JavaUtil();

        /*System.out.println(data.y);
        System.out.println(data1.y);

        System.out.println(data.someLogicWithoutParams());

        int result = data.someLogicWithoutParams();
        System.out.println(result);

        data.someLogic();*/

        System.out.println("**********");
        System.out.println(data.getValue());
        System.out.println(data.getText());

        System.out.println(util.processSomeString("abc bcd bfg"));

        /*System.out.println("Before using setters");
        System.out.println(data.getValue());
        System.out.println(data.getText());

        data.setValue(10);
        data.setText("Set text in action!");
        System.out.println("After using setters");
        System.out.println(data.getValue());
        System.out.println(data.getText());*/
    }
}
