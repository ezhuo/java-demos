package com.Son;

public class SonTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Father f = new Father();
        f.sayHi();
        Son s = new Son();
        s.sayHi();
        s.sayHello();
        Father fs = new Son();
        fs.sayHi();
        //Son sf = (Son) new Father();
        //sf.aa();
        //sf.sayHi();
        System.out.println("---------------------------");
        System.out.println(f.getHeight());
        System.out.println(s.getHeight());
        System.out.println(fs.getHeight());
        System.out.println(fs.getClass());
    }

}

class Father {

    public int height;

    Father() {
        height = 5;
    }

    Father(int height) {
        this.height = height;
    }

    public void sayHi() {
        System.out.println("Hi,World!I'm Father.");
    }

    public void aa() {
        System.out.println("Hi,aa!I'm Father.");
    }

    public int getHeight() {
        return height;
    }
}

class Son extends Father {

//    public int height;

    Son() {
        super();
        height = 6;
    }

    public int getHeight() {
        return height;
    }

    public void sayHello() {
        System.out.println("Hello,World!I'm Son.");
    }

    @Override
    public void sayHi() {
        System.out.println("Hi,World!I'm Son.");
    }
}