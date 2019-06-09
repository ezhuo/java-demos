package com.Test1;

class Kettle {
    public void holeWater() {
        System.out.println("水壶有装水的功能");
    }
}

class Cup extends Kettle {
    public void holeWater() {
        System.out.println("水杯也有装水的功能");
    }

    public void drinkWater() {
        System.out.println("水杯可以拿来喝水的功能");
    }
}


public class Test1 {
    public static void main(String[] args) {
        Kettle k = new Cup(); //父类的引用对象指向子类
        k.holeWater();
//        k.darinkWater(); //报错
    }
}