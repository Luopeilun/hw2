// 引入 Java I/O (Input/Output) 相關類別，用於讀取使用者輸入
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sample2_1 {
    public static void main(String[] args) {
        System.out.println("請輸入一個整數：");

        // 使用 try-with-resources 語法，JVM 會自動關閉資源，更安全且簡潔
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // 讀取使用者輸入的一行文字
            String inputLine = br.readLine();
            
            // 將讀取到的字串轉換為整數
            int num = Integer.parseInt(inputLine);

            // 【條件判斷核心】
            // 檢查變數 num 的值是否等於 1
            if (num == 1) {
                // 如果條件成立 (true)，則執行這個 { ... } 區塊內的程式碼
                System.out.println("您輸入的是 1");
                System.out.println("選擇的是 1");
            }

            // 這行程式碼不論 if 條件是否成立，都會執行
            System.out.println("結束處理。");

        } catch (IOException e) {
            // 處理讀取過程中可能發生的錯誤
            System.out.println("讀取輸入時發生錯誤。");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            // 處理使用者輸入的不是有效數字的錯誤
            System.out.println("請輸入有效的整數。");
        }
    }
}
