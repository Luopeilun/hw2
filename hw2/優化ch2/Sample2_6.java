import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sample2_6 {
    public static void main(String[] args) {
        System.out.println("請輸入字元 a 或 b：");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // 讀取使用者輸入的整行文字
            String str = br.readLine();

            // 檢查使用者是否有輸入內容
            if (str != null && !str.isEmpty()) {
                // 【核心程式碼】
                // 使用 String 的 charAt(0) 方法取得字串中的第一個字元
                // 索引值從 0 開始
                char letter = str.charAt(0);

                // 使用 char 型別的變數進行 switch 判斷
                switch (letter) {
                    case 'a': // 注意：字元需要用單引號 '' 包圍
                        System.out.println("您輸入的是 a。");
                        break;

                    case 'b':
                        System.out.println("您輸入的是 b。");
                        break;

                    default:
                        System.out.println("輸入無效，請輸入 a 或 b。");
                        break;
                }
            } else {
                System.out.println("您沒有輸入任何內容。");
            }

        } catch (IOException e) {
            System.out.println("讀取輸入時發生錯誤。");
        }
    }
}
