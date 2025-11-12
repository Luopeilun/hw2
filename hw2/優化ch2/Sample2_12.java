import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sample2_12 {
    public static void main(String[] args) {
        // 【巢狀迴圈核心】

        // 外層迴圈：控制「列」或主要的回合
        // 它會從 i = 0 執行到 i = 4，共 5 次
        for (int i = 0; i < 5; i++) {
            
            // 內層迴圈：控制「行」或每個主要回合內的細部操作
            // 對於外層迴圈的每一次執行，內層迴圈都會從 j = 0 執行到 j = 2，共 3 次
            for (int j = 0; j < 3; j++) {
                // 這句話會被執行的總次數 = 外層次數 * 內層次數 = 5 * 3 = 15 次
                System.out.println("外層 i = " + i + "; 內層 j = " + j);
            }
            
            // 為了讓輸出更清晰，在外層迴圈每次結束後加一個分隔線
            System.out.println("--- 外層迴圈第 " + i + " 輪結束 ---");
        }
    }
}
