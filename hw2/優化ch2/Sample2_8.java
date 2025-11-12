import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sample2_8 {
    public static void main(String[] args) {
        System.out.println("請問要選擇哪條路線？ (1 為 A 路線, 其他數字為 B 路線)");
        System.out.println("請輸入整數：");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int res = Integer.parseInt(br.readLine());

            // 【三元運算子核心】
            // 判斷 res 是否等於 1。
            // 如果是 true，將 'A' 賦值給 ans。
            // 如果是 false，將 'B' 賦值給 ans。
            char ans = (res == 1) ? 'A' : 'B';

            System.out.println("您選擇了 " + ans + " 路線。");

            // --- 下方為等效的 if-else 寫法，用於對照理解 ---
            char ans_ifelse;
            if (res == 1) {
                ans_ifelse = 'A';
            } else {
                ans_ifelse = 'B';
            }
            System.out.println("(使用 if-else 的結果也是 " + ans_ifelse + " 路線。)");


        } catch (Exception e) {
            System.out.println("輸入無效，請確保輸入的是數字。");
        }
    }
}
