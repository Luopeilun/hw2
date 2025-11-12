import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Sample2_3 {
public static void main(String[] args) {
System.out.println("請輸入一個整數：");
// 使用 try-with-resources 自動管理資源
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        String inputLine = br.readLine();
        int num = Integer.parseInt(inputLine);

        // 【if-else 邏輯核心】
        // 判斷 num 是否等於 1
        if (num == 1) {
            // 條件為 true 時，執行此區塊
            System.out.println("您輸入的是 1。");
        } else {
            // 條件為 false 時，執行此區塊
            System.out.println("您選擇的是 1 以外的數字。");
        }

    } catch (IOException | NumberFormatException e) {
        // 合併處理多種可能的例外，讓程式碼更簡潔
        System.out.println("輸入無效，請輸入一個整數。");
        e.printStackTrace();
    }
}
  }
