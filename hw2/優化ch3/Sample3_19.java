import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sample3_19 {
    public static void main(String[] args) throws IOException {
        System.out.println("請輸入字串");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();

        System.out.println("請輸入要檢索的文字");
        String str2 = br.readLine();
        char ch = str2.charAt(0);

        // 搜尋字串str1內ch字元的位置並回傳位置索引值給num
        int num = str1.indexOf(ch);

        // 由於搜尋不到字會回傳-1，所以在這用if做錯誤處理
        if (num != -1) {
            System.out.println(str1 + "的第" + (num + 1) + "個字就是「" + ch + "」");
        } else {
            System.out.println(str1 + "中沒有「" + ch + "」這個字");
        }
    }
}
