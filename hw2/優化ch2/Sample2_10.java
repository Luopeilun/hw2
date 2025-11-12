import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sample2_10 {
    public static void main(String[] args) {
        // 1. 初始化：必須在迴圈外部手動初始化計數器
        int i = 1;

        // 2. 條件判斷：只要 i 小於等於 5，就執行迴圈
        while (i <= 5) {
            System.out.println("第 " + i + " 次的迴圈");

            // 3. 更新：必須在迴圈內部手動更新計數器
            // 如果忘記這行，i 的值永遠是 1，將會導致「無窮迴圈」！
            i++;
        }

        System.out.println("迴圈結束。");
    }
}
