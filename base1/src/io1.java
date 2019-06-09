import java.io.*;

public class io1 {
    public static void main(String[] args) throws IOException {
        StringBuffer c;
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        // 读取字符
        do {
            c = new StringBuffer(br.read());
            System.out.println(c.toString());
        } while (c.toString() != "q");
    }
}
