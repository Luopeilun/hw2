import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sample2_11 {
    public static void main(String[] args) {
        // 1. 初始化
        int i = 1;

        // 【do-while 迴圈核心】
        do {
            // 迴圈主體會先無條件執行一次
            System.out.println("第 " + i + " 次的迴圈");

            // 3. 更新
            i++;
        } 
        // 2. 條件判斷：在主體執行完畢後，才檢查條件
        while (i <= 5);

        System.out.println("迴圈結束。");
        
        // --- 對照組：如果 i 的初始值就是 6 ---
        System.out.println("\n--- do-while 至少執行一次的示範 ---");
        int j = 6;
        do {
            System.out.println("j 的值是 " + j + "，即使條件不符，這行仍然執行了。");
            j++;
        } while (j <= 5); // 第一次判斷時 7 <= 5 為 false，迴圈結束
    }
}
