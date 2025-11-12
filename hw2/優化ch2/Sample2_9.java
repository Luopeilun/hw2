import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sample2_9 {
    public static void main(String[] args) {
        // 【for 迴圈核心】
        // 1. 初始化：宣告整數 i 並設其初始值為 1
        // 2. 條件判斷：只要 i 小於等於 5，就繼續執行迴圈
        // 3. 更新：每執行完一次迴圈，就將 i 的值加 1
        for (int i = 1; i <= 5; i++) {
            // 這裡的程式碼會重複執行
            System.out.println("第 " + i + " 次的迴圈");
        }

        // 當 i 變成 6 時，i <= 5 條件為 false，迴圈結束，執行下一行程式碼
        System.out.println("迴圈結束。");
    }
}
