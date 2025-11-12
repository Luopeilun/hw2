import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sample2_7 {
    public static void main(String[] args) {
        System.out.println("請問您是男生嗎？ (請輸入 Y/N)");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();

            if (str != null && !str.isEmpty()) {
                char letter = str.charAt(0);

                // 【邏輯運算子 || (OR) 應用】
                // 條件：輸入的字元是 'Y' 或 'y'
                if (letter == 'Y' || letter == 'y') {
                    System.out.println("您好，先生！");
                } 
                // 條件：輸入的字元是 'N' 或 'n'
                else if (letter == 'N' || letter == 'n') {
                    System.out.println("您好，女士！");
                } 
                else {
                    System.out.println("輸入格式不符，請輸入 Y 或 N。");
                }
            } else {
                System.out.println("未偵測到輸入。");
            }

        } catch (IOException e) {
            System.out.println("讀取時發生錯誤。");
        }
    }
}
