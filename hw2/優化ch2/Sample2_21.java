import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays; // 引入 Arrays 類別，提供 sort 等靜態方法
import java.util.Collections; // 引入 Collections 類別，提供 reverseOrder 等工具

public class Sample2_21 {
    public static void main(String[] args) throws IOException {
        System.out.println("請依序輸入 5 位學生的分數：");
        
        // 【核心差異】
        // 為了使用 Collections.reverseOrder()，陣列類型必須是物件類型 Integer
        // 而不是基本資料類型 int
        Integer[] scores = new Integer[5];
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < scores.length; i++) {
                scores[i] = Integer.parseInt(br.readLine());
            }
        }
        System.out.println("原始分數陣列: " + Arrays.toString(scores));

        // 【Java 內建排序核心 - 降序】
        // Arrays.sort(陣列, 比較器)
        // Collections.reverseOrder() 是一個實現了降序規則的比較器
        Arrays.sort(scores, Collections.reverseOrder());

        System.out.println("\n--- 使用 Arrays.sort() 降序排序結果 ---");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("第 " + (i + 1) + " 名的分數是：" + scores[i]);
        }
    }
}
