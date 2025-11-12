import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sample2_19 {
    public static void main(String[] args) {
        // 使用陣列初始設定式建立陣列
        int[] test = {80, 60, 22, 50, 75};

        System.out.println("開始處理分數資料...");

        // 【length 屬性應用】
        // 在 for 迴圈的條件判斷中使用 test.length
        // 這使得迴圈會自動根據陣列的實際長度來決定執行次數
        for (int i = 0; i < test.length; i++) {
            System.out.println("第 " + (i + 1) + " 個人的分數是：" + test[i] + " 分");
        }

        // 直接讀取 length 屬性來獲取元素總數
        System.out.println("--------------------");
        System.out.println("分析完畢，本次考試總人數為：" + test.length + " 人。");
    }
}
