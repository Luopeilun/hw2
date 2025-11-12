import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sample2_13 {
    public static void main(String[] args) {
        System.out.println("迴圈將從 1 執行到 10。");
        System.out.println("請問您希望在哪一次處理時提前結束迴圈？(1-10)");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int breakPoint = Integer.parseInt(br.readLine());

            // 迴圈預計執行 10 次
            for (int i = 1; i <= 10; i++) {
                System.out.println("第 " + i + " 次的處理。");

                // 【break 條件判斷】
                // 檢查當前的迴圈次數 i 是否等於使用者指定的結束點
                if (i == breakPoint) {
                    System.out.println("符合中斷條件 (i == " + breakPoint + ")，執行 break！");
                    break; // 立即跳出 for 迴圈
                }
            }

            // break 後，程式會從這裡繼續執行
            System.out.println("迴圈已結束。");

        } catch (Exception e) {
            System.out.println("輸入無效。");
        }
    }
}
