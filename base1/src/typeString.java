public class typeString {
    public static void main(String[] args) {
        typeString ts = new typeString();
        ts.test1();
        ts.test2();
        ts.test3();
        ts.test4();
        ts.test5();
        ts.test6();
        ts.test7();
        ts.test8();
        ts.test9();
        ts.test10();
        ts.test11();
        ts.test12();
        ts.test13();
    }

    /**
     * 采用字面值的方式赋值
     */
    public void test1() {
        String str1 = "aaa";
        String str2 = "aaa";
        System.out.println("===========test1============");
        System.out.println(str1 == str2);//true 可以看出str1跟str2是指向同一个对象
    }

    /**
     * 采用new关键字新建一个字符串对象
     */
    public void test2() {
        String str3 = new String("aaa");
        String str4 = new String("aaa");
        System.out.println("===========test2============");
        System.out.println(str3 == str4);//false 可以看出用new的方式是生成不同的对象
    }

    /**
     * 编译期确定
     */
    public void test3() {
        String s0 = "helloworld";
        String s1 = "helloworld";
        String s2 = "hello" + "world";
        System.out.println("===========test3============");
        System.out.println(s0 == s1); //true 可以看出s0跟s1是指向同一个对象
        System.out.println(s0 == s2); //true 可以看出s0跟s2是指向同一个对象
    }

    /**
     * 编译期无法确定
     */
    public void test4() {
        String s0 = "helloworld";
        String s1 = new String("helloworld");
        String s2 = "hello" + new String("world");
        System.out.println("===========test4============");
        System.out.println(s0 == s1); //false
        System.out.println(s0 == s2); //false
        System.out.println(s1 == s2); //false
    }

    /**
     * 继续-编译期无法确定
     */
    public void test5() {
        String str1 = "abc";
        String str2 = "def";
        String str3 = str1 + str2;
        System.out.println("===========test5============");
        System.out.println(str3 == "abcdef"); //false
    }

    /**
     * 编译期优化
     */
    public void test6() {
        String s0 = "a1";
        String s1 = "a" + 1;
        System.out.println("===========test6============");
        System.out.println((s0 == s1)); //result = true
        String s2 = "atrue";
        String s3 = "a" + "true";
        System.out.println((s2 == s3)); //result = true
        String s4 = "a3.4";
        String s5 = "a" + 3.4;
        System.out.println((s4 == s5)); //result = true
    }

    /**
     * 编译期无法确定
     */
    public void test7() {
        String s0 = "ab";
        String s1 = "b";
        String s2 = "a" + s1;
        System.out.println("===========test7============");
        System.out.println((s0 == s2)); //result = false
    }

    /**
     * 比较字符串常量的“+”和字符串引用的“+”的区别
     */
    public void test8() {
        String test = "javalanguagespecification";
        String str = "java";
        String str1 = "language";
        String str2 = "specification";
        System.out.println("===========test8============");
        System.out.println(test == "java" + "language" + "specification");
        System.out.println(test == str + str1 + str2);
    }

    /**
     * 编译期确定
     */
    public void test9() {
        String s0 = "ab";
        final String s1 = "b";
        String s2 = "a" + s1;
        System.out.println("===========test9============");
        System.out.println((s0 == s2)); //result = true
    }

    /**
     * 编译期无法确定
     */
    public void test10() {
        String s0 = "ab";
        final String s1 = getS1();
        String s2 = "a" + s1;
        System.out.println("===========test10============");
        System.out.println((s0 == s2)); //result = false

    }

    /**
     * 关于String.intern()
     */
    public void test11() {
        String s0 = "kvill";
        String s1 = new String("kvill");
        String s2 = new String("kvill");
        System.out.println("===========test11============");
        System.out.println(s0 == s1); //false
        System.out.println("**********");
        s1.intern(); //虽然执行了s1.intern(),但它的返回值没有赋给s1
        s2 = s2.intern(); //把常量池中"kvill"的引用赋给s2
        System.out.println(s0 == s1); //flase
        System.out.println(s0 == s1.intern()); //true//说明s1.intern()返回的是常量池中"kvill"的引用
        System.out.println(s0 == s2); //true
    }

    /**
     * 关于equals和==
     */
    public void test12() {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        System.out.println("===========test12============");
        System.out.println(s1 == s2); //true,表示s1和s2指向同一对象，它们都指向常量池中的"hello"对象
        //flase,表示s1和s3的地址不同，即它们分别指向的是不同的对象,s1指向常量池中的地址，s3指向堆中的地址
        System.out.println(s1 == s3);
        System.out.println(s2.equals(s3)); //true,表示s1和s3所指向对象的内容相同
    }

    private static String getS1() {
        return "b";
    }

    public void test13() {
        /**
         * 情景一：字符串池
         * JAVA虚拟机(JVM)中存在着一个字符串池，其中保存着很多String对象;
         * 并且可以被共享使用，因此它提高了效率。
         * 由于String类是final的，它的值一经创建就不可改变。
         * 字符串池由String类维护，我们可以调用intern()方法来访问字符串池。
         */
        System.out.println("===========test13============");
        String s1 = "abc";
        //↑ 在字符串池创建了一个对象
        String s2 = "abc";
        //↑ 字符串pool已经存在对象“abc”(共享),所以创建0个对象，累计创建一个对象
        System.out.println("s1 == s2 : " + (s1 == s2));
        //↑ true 指向同一个对象，
        System.out.println("s1.equals(s2) : " + (s1.equals(s2)));
        //↑ true  值相等
        //↑------------------------------------------------------over
        /**
         * 情景二：关于new String("")
         *
         */
        String s3 = new String("abc");
        //↑ 创建了两个对象，一个存放在字符串池中，一个存在与堆区中；
        //↑ 还有一个对象引用s3存放在栈中
        String s4 = new String("abc");
        //↑ 字符串池中已经存在“abc”对象，所以只在堆中创建了一个对象
        System.out.println("s3 == s4 : " + (s3 == s4));
        //↑false   s3和s4栈区的地址不同，指向堆区的不同地址；
        System.out.println("s3.equals(s4) : " + (s3.equals(s4)));
        //↑true  s3和s4的值相同
        System.out.println("s1 == s3 : " + (s1 == s3));
        //↑false 存放的地区多不同，一个栈区，一个堆区
        System.out.println("s1.equals(s3) : " + (s1.equals(s3)));
        //↑true  值相同
        //↑------------------------------------------------------over
        /**
         * 情景三：
         * 由于常量的值在编译的时候就被确定(优化)了。
         * 在这里，"ab"和"cd"都是常量，因此变量str3的值在编译时就可以确定。
         * 这行代码编译后的效果等同于： String str3 = "abcd";
         */
        String str1 = "ab" + "cd";  //1个对象
        String str11 = "abcd";
        System.out.println("str1 = str11 : " + (str1 == str11));
        //↑------------------------------------------------------over
        /**
         * 情景四：
         * 局部变量str2,str3存储的是存储两个拘留字符串对象(intern字符串对象)的地址。
         *
         * 第三行代码原理(str2+str3)：
         * 运行期JVM首先会在堆中创建一个StringBuilder类，
         * 同时用str2指向的拘留字符串对象完成初始化，
         * 然后调用append方法完成对str3所指向的拘留字符串的合并，
         * 接着调用StringBuilder的toString()方法在堆中创建一个String对象，
         * 最后将刚生成的String对象的堆地址存放在局部变量str3中。
         *
         * 而str5存储的是字符串池中"abcd"所对应的拘留字符串对象的地址。
         * str4与str5地址当然不一样了。
         *
         * 内存中实际上有五个字符串对象：
         *       三个拘留字符串对象、一个String对象和一个StringBuilder对象。
         */
        String str2 = "ab";  //1个对象
        String str3 = "cd";  //1个对象
        String str4 = str2 + str3;
        String str5 = "abcd";
        System.out.println("str4 = str5 : " + (str4 == str5)); // false
        //↑------------------------------------------------------over
        /**
         * 情景五：
         *  JAVA编译器对string + 基本类型/常量 是当成常量表达式直接求值来优化的。
         *  运行期的两个string相加，会产生新的对象的，存储在堆(heap)中
         */
        String str6 = "b";
        String str7 = "a" + str6;
        String str67 = "ab";
        System.out.println("str7 = str67 : " + (str7 == str67));
        //↑str6为变量，在运行期才会被解析。
        final String str8 = "b";
        String str9 = "a" + str8;
        String str89 = "ab";
        System.out.println("str9 = str89 : " + (str9 == str89));
        //↑str8为常量变量，编译期会被优化
        //↑------------------------------------------------------over
    }

}
