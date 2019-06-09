package com.TestPolyorphic;

class Father {
    public int age;

    public Father() {
        this.age = 40;

    }

    public int getAge() {
        return this.age;
    }

    void eat() {
        System.out.println("父亲在吃饭");
    }
}

class Child extends Father {
   // public int age;

    public Child() {
        super();
        this.age = 18;

    }

    public int getAge() {
        return age;
    }

    void eat() {
       // this.age = 19;
        System.out.println("孩子在吃饭");
    }

    void play() {
        System.out.println("孩子在打CS");
    }
}

public class TestPolyorphic {
    public static void main(String[] args) {
        Father f = new Child();
        f.eat();
        System.out.println("f年龄：" + f.age);
        System.out.println("f年龄：" + f.getAge());

        Child c = new Child();
        c.eat();
        System.out.println("c年龄：" + c.getAge());
//        System.out.println("年龄：" + ((Child) c).age);
    }
}
