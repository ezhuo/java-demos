import java.io.*;

class A {
    public void func() throws Exception {
        throw new Exception();
    }

    public void g() throws Exception {

    }
}

public class exception2 {
    public static void main(String[] args) {
        try {
            A a = new A();
            a.func();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
