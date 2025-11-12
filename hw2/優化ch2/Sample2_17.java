import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sample2_17 {
    public static void main(String[] args) {
        // 建立一個長度為 5 的陣列，合法索引為 0, 1, 2, 3, 4
        int[] test = new int[5];

        test[0] = 80;
        test[1] = 60;
        test[2] = 22;
        test[3] = 50;
        test[4] = 75;

        System.out.println("陣列已成功初始化。");
        System.out.println("接下來，將嘗試存取一個不存在的索引...");

        try {
            // 【錯誤觸發點】
            // 試圖將 75 賦值給索引為 10 的位置
            // 因為 10 已經超出了合法的 0-4 範圍，這行程式碼將會拋出例外
            test[10] = 75; 
            
            // 因為上一行拋出了例外，所以這行程式碼永遠不會被執行
            System.out.println("這句話不會被印出。");

        } catch (ArrayIndexOutOfBoundsException e) {
            // 捕捉這個特定的例外
            System.out.println("\n錯誤發生！捕捉到 ArrayIndexOutOfBoundsException！");
            System.out.println("錯誤訊息: " + e.getMessage());
            System.out.println("原因：試圖存取超出陣列邊界的索引。陣列長度為 " + test.length + "，但嘗試存取索引 " + 10 + "。");
        }

        // 程式繼續執行...
        System.out.println("\n程式在處理完錯誤後繼續執行。");
    }
}
