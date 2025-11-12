import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sample2_5 {
    public static void main(String[] args) {
        System.out.println("請輸入一個整數：");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int num = Integer.parseInt(br.readLine());

            // 【switch 判斷核心】
            // 將變數 num 的值與各個 case 進行比對
            switch (num) {
                case 1: // 如果 num 的值等於 1
                    System.out.println("輸入的是 1。");
                    break; // 處理完畢，跳出 switch

                case 2: // 如果 num 的值等於 2
                    System.out.println("輸入的是 2。");
                    break; // 處理完畢，跳出 switch

                default: // 如果 num 的值不等於 1 也不等於 2
                    System.out.println("請輸入 1 或 2。");
                    break; // 雖然是最後一項，但加上 break 是個好習慣
            }

        } catch (Exception e) {
            System.out.println("輸入無效，請確保輸入的是數字。");
        }
    }
}
