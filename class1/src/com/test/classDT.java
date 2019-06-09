package com.test;


public class classDT {
    public String getStr() {
        return str;
    }

    public void setStr(String val) {
        this.str = val;
    }

    private String str = "123";

    public classDT() {
        System.out.println(str);
    }

    // 内部类Inner，类Inner在类HelloWorld的内部
    public class Inner {

        // 内部类的方法
        public void show() {
            str = "456";
            System.out.println(str);

            setStr("789");
            System.out.println(getStr());

        }
    }

    public static void main(String[] args) {

        // 创建外部类对象
        classDT hello = new classDT();
        // 创建内部类对象
        Inner i = hello.new Inner();
        // 调用内部类对象的方法
        i.show();
    }

}
