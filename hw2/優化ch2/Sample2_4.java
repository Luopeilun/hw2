import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sample2_4 {
    public static void main(String[] args) {
        System.out.println("請輸入整數 1 或 2：");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int num = Integer.parseInt(br.readLine());

            // 【多重條件判斷核心】
            // 首先檢查 num 是否為 1
            if (num == 1) {
                // 如果是，執行此區塊，然後跳出整個結構
                System.out.println("您輸入的是 1。");
            } 
            // 如果不是 1，接著檢查 num 是否為 2
            else if (num == 2) {
                // 如果是，執行此區塊，然後跳出
                System.out.println("您輸入的是 2。");
            } 
            // 如果以上條件都不成立
            else {
                // 執行此最終區塊
                System.out.println("您的輸入不正確，請輸入 1 或 2。");
            }

        } catch (Exception e) {
            System.out.println("輸入無效，請確保輸入的是數字。");
        }
    }
}
