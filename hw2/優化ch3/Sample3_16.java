// 框起來的都是類別庫所提供的類別
import java.io.BufferedReader; // BufferedReader
import java.io.InputStreamReader; // InputStreamReader
import java.io.IOException; // IOException

public class Sample3_16 {
    public static void main(String[] args) throws IOException {
        System.out.println("請輸入一個整數"); // System
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); // String
        int num = Integer.parseInt(str); // Integer
        System.out.println("您輸入的數字是:" + num);
    }
}
