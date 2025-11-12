import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sample3_20 {
    public static void main(String[] args) throws IOException {
        System.out.println("請輸入字串。");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();

        System.out.println("請輸入要新增的字串。");
        String str2 = br.readLine();

        // 從類別StringBuffer建立物件sb並傳入字串str1到字串緩衝區
        StringBuffer sb = new StringBuffer(str1);
        // 使用類別方法append將字串str2接到字串緩衝區後面
        sb.append(str2);

        System.out.println("在「" + str1 + "」後新增「" + str2 + "」的話，就會變成「" + sb + "」。");
    }
}
