package com;

import java.util.ArrayList;
import java.util.List;

class People {
    public String name;

    public People(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("eat");
    }
}

class Father extends People {
    public Father(String name) {
        super(name);
    }

    @Override
    public void eat() {
        super.eat();
    }

    public void wt() {
        System.out.println("wt");
    }
}

public class cls {
    public static void main(String[] args) {
        List<People> arrayList = new ArrayList<People>();
        arrayList.add(new Father("ezhuo"));
        arrayList.add(new Father("yula"));
        for (People p : arrayList) {
            ((Father) p).wt();
            System.out.println(p.name);
        }
    }
}
