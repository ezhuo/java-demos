package com.inner;

import java.util.*;

public class Person {
    private int idx = 0;

    public Person() {
        final List list = new ArrayList();
        list.add("home loan");  //valid
        list.add("personal loan"); //valid
        list = new Vector();  //not valid
        System.out.println("Person" + idx);
    }

    //构造代码块
    {
        int x = 100;
        this.idx = 2;
        System.out.println(x);
    }

    public static class InnerClass {
        InnerClass() {
            System.out.println("InnerClass");
        }
    }

    private static Date startDate, endDate;

    static {
        startDate = null;
        endDate = null;
        System.out.println("state block");
    }


    public static void main(String[] args) {
        Person p = new Person();
//        InnerClass ic = new Person.InnerClass();
    }
}
