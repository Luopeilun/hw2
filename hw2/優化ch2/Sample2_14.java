import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sample2_14 {
    public static void main(String[] args) {
        System.out.println("迴圈將從 1 執行到 10。");
        System.out.println("請問您希望跳過哪一次的處理？(1-10)");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int skipPoint = Integer.parseInt(br.readLine());

            for (int i = 1; i <= 10; i++) {
                // 【continue 條件判斷】
                // 檢查當前的迴圈次數 i 是否等於使用者指定的跳過點
                if (i == skipPoint) {
                    System.out.println("--> 偵測到第 " + i + " 次，執行 continue，跳過本次處理！");
                    continue; // 跳過本次迴圈的剩餘部分，直接進入下一次迴圈 (i++)
                }

                // 這行程式碼在 i 等于 skipPoint 時將不會被執行
                System.out.println("第 " + i + " 次的處理。");
            }

            System.out.println("迴圈已全部執行完畢。");

        } catch (Exception e) {
            System.out.println("輸入無效。");
        }
    }
}
