package com.Son;

class One {
    protected void printA() {
        System.out.println("父类printA");
    }

    private void printB() {
        System.out.println("父类printB");
    }

    private void printC() {
        System.out.println("父类printC");
    }

    protected void printABC() {
        printA();
        printB();
        printC();
    }
}


public class SonTest2 extends One {
    protected void printA() {
        System.out.println("子类printA");
    }

    private void printB() {
        System.out.println("子类printB");
    }

    public void printC() {
        System.out.println("父类printC");
    }

    public static void main(String[] args) {
        SonTest2 t = new SonTest2();
//  　  One t = new Two();
        t.printABC();
    }
}