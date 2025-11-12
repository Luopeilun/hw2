import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays; // 引入 Arrays 類別，方便印出陣列

public class Sample2_20 {
    public static void main(String[] args) throws IOException {
        System.out.println("請依序輸入 5 位學生的分數：");
        int[] scores = new int[5];
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < scores.length; i++) {
                scores[i] = Integer.parseInt(br.readLine());
            }
        }
        System.out.println("原始分數陣列: " + Arrays.toString(scores));

        // 【氣泡排序演算法核心】
        // 外層迴圈：控制總共需要比較的「回合」數。
        // 對於 n 個元素，最多需要 n-1 回合。
        for (int i = 0; i < scores.length - 1; i++) {
            // 內層迴圈：在每一回合中，進行相鄰元素的比較與交換。
            // j 的範圍會隨著 i 的增加而縮小，因為每回合都會將一個最大值放到正確位置。
            for (int j = 0; j < scores.length - 1 - i; j++) {
                // 比較相鄰的兩個元素 (由大到小排序)
                // 如果左邊的元素 (scores[j]) 小於右邊的元素 (scores[j+1])，則交換
                if (scores[j] < scores[j + 1]) {
                    // 交換演算法：使用一個暫存變數 tmp
                    int tmp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = tmp;
                }
            }
            System.out.println("第 " + (i + 1) + " 回合排序後: " + Arrays.toString(scores));
        }

        System.out.println("\n--- 分數由高到低排序結果 ---");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("第 " + (i + 1) + " 名的分數是：" + scores[i]);
        }
    }
}
