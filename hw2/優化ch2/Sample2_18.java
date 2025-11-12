import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sample2_18 {
    public static void main(String[] args) {
        // 【陣列初始設定式核心】
        // 使用大括號在宣告時直接提供所有元素的值
        // 編譯器會自動推斷出此陣列的長度為 5
        int[] test = {80, 60, 22, 50, 75};

        System.out.println("使用初始設定式建立的陣列長度為: " + test.length);
        System.out.println("顯示陣列中的所有分數：");

        // 使用增強型 for 迴圈 (Enhanced for loop / for-each loop) 來遍歷陣列，語法更簡潔
        int personIndex = 1;
        for (int score : test) {
            // score 變數會依序代表 test 陣列中的每一個元素
            System.out.println("第 " + personIndex + " 個人的分數是：" + score + " 分");
            personIndex++;
        }
        
        // --- 補充說明：部分初始化 ---
        // 如果只初始化部分元素，剩下的會被設為該型別的預設值
        // 對於 int 來說，預設值是 0
        int[] num = new int[10];
        // 雖然原始投影片寫 num[10] = {0}，但這是錯誤語法
        // 正確的部分初始化方式是在建立後賦值，或讓其保持預設值
        num[0] = 10;
        num[1] = 20;
        System.out.println("\n部分初始化陣列 num[2] 的值為: " + num[2]); // 將會輸出 0
    }
}
