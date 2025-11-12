import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sample2_15 {
    public static void main(String[] args) {
        // --- 陣列的宣告與建立 ---

        // 寫法一：宣告與建立分開 (如投影片所示)
        int[] test_A; // 1. 宣告一個名為 test_A 的整數陣列變數
        test_A = new int[5]; // 2. 建立一個能容納 5 個整數的陣列，並讓 test_A 指向它
        
        // 寫法二：宣告與建立合併 (更常見的寫法)
        // int[] test = new int[5];
        
        // 陣列的索引 (index) 從 0 開始，所以一個長度為 5 的陣列，其合法索引為 0, 1, 2, 3, 4。
        System.out.println("為陣列的每個位置賦值...");
        test_A[0] = 80; // 將 80 存入第 1 個位置 (索引 0)
        test_A[1] = 60; // 將 60 存入第 2 個位置 (索引 1)
        test_A[2] = 22;
        test_A[3] = 50;
        test_A[4] = 75; // 將 75 存入第 5 個位置 (索引 4)

        // --- 遍歷陣列並讀取元素 ---
        System.out.println("讀取並顯示陣列中的所有分數：");
        
        // 使用 for 迴圈來依序訪問陣列的每一個元素
        // 陣列的長度可以透過 .length 屬性取得
        for (int i = 0; i < test_A.length; i++) {
            // 使用 test_A[i] 來讀取索引為 i 的元素值
            // (i+1) 是為了讓輸出更符合人類閱讀習慣 (第1個、第2個...)
            System.out.println("第 " + (i + 1) + " 個人的分數是：" + test_A[i] + " 分");
        }
    }
}
