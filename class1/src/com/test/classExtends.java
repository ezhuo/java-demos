package com.test;

class Animal {
    private String name;
    private int id;

    public Animal(String myName, int myid) {
        name = myName;
        id = myid;
    }

    public void eat() {
        System.out.println(name + "正在吃");
    }

    public void sleep() {
        System.out.println(name + "正在睡");
    }

    public void introduction() {
        System.out.println("大家好！我是" + id + "号" + name + ".");
    }
}

class Penguin extends Animal {
    public Penguin(String myName, int myid) {
        super(myName, myid);
    }
}

class Mouse extends Animal {
    public Mouse(String myName, int myid) {
        super(myName, myid);
    }
}

interface A {
    public void eat();

    public void sleep();
}

interface B {
    public void show();
}

class C implements A, B {
    public void eat() {

    }

    public void sleep() {

    }

    public void show() {

    }
}

class SuperClass {
    private int n;

    SuperClass() {
        System.out.println("SuperClass()");
    }

    SuperClass(int n) {
        System.out.println("SuperClass(int n)");
        this.n = n;
    }
}

class SubClass extends SuperClass {
    private int n;

    SubClass() {
        super(300);
        System.out.println("SubClass");
    }

    public SubClass(int n) {
        System.out.println("SubClass(int n):" + n);
        this.n = n;
    }
}

class TestSuperSub {
    public static void main(String args[]) {
//        SubClass sc = new SubClass();
        SubClass sc2 = new SubClass(200);
    }
}

public class classExtends {
    public static void main(String[] args) {
        Penguin p = new Penguin("小小", 10);
        p.eat();
        TestSuperSub.main(args);
    }
}
