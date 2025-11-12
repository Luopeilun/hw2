import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sample2_2_Correct {
    public static void main(String[] args) {
        // ... (使用 try-with-resources 讀取輸入)
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("請輸入整數：");
            int num = Integer.parseInt(br.readLine());

            // 【正確寫法】
            // 使用大括號 {} 將所有希望在條件成立時執行的程式碼包起來
            if (num == 1) {
                System.out.println("輸入的是1");
                System.out.println("選擇的是1");
            }
            
            System.out.println("結束處理。");

        } catch (Exception e) {
            System.out.println("處理輸入時發生錯誤。");
        }
    }
}
