import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Sample2_22 {
    public static void main(String[] args) {
        // 宣告並建立一個 2 列 5 行的二維整數陣列
        // 可以想像成一個表格，用來儲存 5 位學生的 2 門科目成績
        // 第 0 列 (索引 0): 儲存國語成績
        // 第 1 列 (索引 1): 儲存數學成績
        int[][] scores = new int[2][5];

        // --- 初始化國語成績 (第 0 列) ---
        scores[0][0] = 80;
        scores[0][1] = 60;
        scores[0][2] = 22;
        scores[0][3] = 50;
        scores[0][4] = 75;

        // --- 初始化數學成績 (第 1 列) ---
        scores[1][0] = 90;
        scores[1][1] = 55;
        scores[1][2] = 68;
        scores[1][3] = 72;
        scores[1][4] = 58; // 原始範例此處為0，此處賦予一個值讓範例更完整

        System.out.println("所有學生的成績資料如下：");
        System.out.println("國語成績: " + Arrays.toString(scores[0]));
        System.out.println("數學成績: " + Arrays.toString(scores[1]));
        System.out.println("----------------------------------------");

        // 【遍歷二維陣列】
        // 外層迴圈遍歷「學生」(即「行」)
        // scores[0].length 代表第一門科目有幾位學生成績，即「行數」
        int studentCount = scores[0].length;
        for (int i = 0; i < studentCount; i++) { // i 代表學生的索引 (0 到 4)
            // 讀取第 i 位學生的國語成績
            int chineseScore = scores[0][i];
            // 讀取第 i 位學生的數學成績
            int mathScore = scores[1][i];
            
            System.out.println("第 " + (i + 1) + " 位學生：");
            System.out.println("  國語分數是 " + chineseScore + " 分");
            System.out.println("  數學分數是 " + mathScore + " 分");
        }
    }
}
