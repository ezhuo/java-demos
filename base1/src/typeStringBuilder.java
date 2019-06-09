public class typeStringBuilder {
    public static void main(String[] args) {
        StringBuffer sBuf = new StringBuffer("aaa");
        sBuf.append("www");
        sBuf.append("ddd");
        String str = new String("aaawwwddd");

        System.out.println(sBuf.toString().getClass().toString());


    }
}
