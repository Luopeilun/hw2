import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sample3_17 {
    public static void main(String[] args) {
        // 這行相當於 String str = new String("Hello");
        // 但是因為這方法在Java太常用了，所以才簡化成 String str = "Hello";
        String str = "Hello";

        char ch1 = str.charAt(0); // 取得字串的第一個字元
        char ch2 = str.charAt(1); // 取得字串的第二個字元
        int len = str.length(); // 取得字串長度

        System.out.println(str + "的第一個字元是" + ch1);
        System.out.println(str + "的第二個字元是" + ch2);
        System.out.println(str + "的長度是" + len);
    }
}
