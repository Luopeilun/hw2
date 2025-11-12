import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sample3_21 {
    public static void main(String[] args) throws IOException {
        System.out.println("請輸入兩個整數");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        // 使用Math類別的類別方法max找出num1和num2中的最大值傳入ans
        int ans = Math.max(num1, num2);

        System.out.println(num1 + "與" + num2 + "中較大的是" + ans);
    }
}
