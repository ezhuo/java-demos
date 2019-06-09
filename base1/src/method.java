public class method {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]: " + args[i]);
        }

        System.out.println("-----------------------------");

        int num1 = 1;
        int num2 = 2;

        System.out.println("交换前 num1 的值为：" +
                num1 + " ，num2 的值为：" + num2);

        // 调用swap方法
        swap(num1, num2);
        System.out.println("交换后 num1 的值为：" +
                num1 + " ，num2 的值为：" + num2);

        System.out.println(max(1.2, 34));
        System.out.println(max(1, 34));

        System.out.println("-----------------------------------");

        Cake c1 = new Cake(1);
        Cake c2 = new Cake(2);
        Cake c3 = new Cake(3);

        c2 = c3 = null;
        System.gc(); //调用Java垃圾收集器
    }

    /**
     * 交换两个变量的方法
     */
    public static void swap(int n1, int n2) {
        System.out.println("\t进入 swap 方法");
        System.out.println("\t\t交换前 n1 的值为：" + n1
                + "，n2 的值：" + n2);
        // 交换 n1 与 n2的值
        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("\t\t交换后 n1 的值为 " + n1
                + "，n2 的值：" + n2);
    }

    public static double max(double num1, double num2) {
        System.out.println("----max double----");
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    /**
     * 返回两个整数变量较大的值
     */
    public static int max(int num1, int num2) {
        System.out.println("----max int----");
        int result;
        if (num1 > num2) {
            int a = 0;
            result = num1;
        } else
            result = num2;
        return result;
    }

}


class Cake extends Object {
    private int id;

    public Cake(int id) {
        this.id = id;
        System.out.println("Cake Object " + id + "is created");
    }

    protected void finalize() throws java.lang.Throwable {
        super.finalize();
        System.out.println("Cake Object " + id + "is disposed");
    }
}