import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sample2_2_Error {
    public static void main(String[] args) throws IOException { // 簡化寫法，實際應使用 try-catch
        System.out.println("請輸入整數");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        // 【錯誤示範】
        // 因為沒有使用大括號 {}，所以只有下一行 "System.out.println("輸入的是1");" 屬於 if 的範圍
        if (num == 1)
            System.out.println("輸入的是1"); // 此行只有在 num 為 1 時執行

        // 【邏輯陷阱】
        // 此行不屬於 if 的條件範圍，因此不論 num 是多少，它都會被執行
        System.out.println("選擇的是1"); 
        
        System.out.println("結束處理");
    }
}
