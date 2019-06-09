package com.Test;

class Kettle {
    public Kettle() {
        System.out.println("水壶容量有2升");
    }
}


class Cup extends Kettle {
    public Cup() {
        System.out.println("水杯容量为0.5升");
    }
}

public class Test {
    public static void main(String[] args) {
//        Cup cccc = new Kettle();
        Kettle k = new Kettle(); //父类的引用对象指向自身：把2升水倒入到水壶中，不会溢出
        Cup c = new Cup();//子类的引用对象指向自身：把0.5升的水倒入到水杯中，不会溢出
        Kettle k1 = new Cup(); //父类的引用对象指向子类：把0.5升的水倒入到水壶中，不会溢出
        Kettle k2 = (Kettle) c; //父类的引用对象指向子类中继承父类的那一部分对象：把水杯中的0.5升水倒入到水壶中，不会溢出
//        Cup c2 = (Cup) k; //子类的引用对象指向父类对象，报错，不能转换类型：水壶里面的水不能倒入到水杯中，会溢出
        Cup c3 = (Cup) k2;//相当于Cup c3 = (Cup)(Kettle)c，子类的引用对象指向子类中继承父类的那一部分对象：把水壶中0.5升的水倒入到水杯中，不会溢出
    }
}