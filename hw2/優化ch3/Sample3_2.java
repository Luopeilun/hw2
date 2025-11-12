import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Car 類別 (藍圖)
class Car {
    // 定義 Car 的屬性。預設情況下，這些欄位是 package-private 的，
    // 意味著在同一個 package 下的類別可以直接存取。
    int num;
    double gas;
}

public class Sample3_2 {
    public static void main(String[] args) {
        // 1. 建立一個 Car 物件，並讓 car1 指向它
        Car car1 = new Car();
        System.out.println("新車出廠時的初始狀態：");
        System.out.println("  車號: " + car1.num);   // 讀取 int 的預設值 0
        System.out.println("  油量: " + car1.gas); // 讀取 double 的預設值 0.0
        System.out.println("-------------------------");

        // 2. 使用點運算子 (.) 來「設定」或「寫入」物件的欄位值
        System.out.println("為車輛登記資料...");
        car1.num = 1234;     // 將 1234 賦值給 car1 所指向物件的 num 欄位
        car1.gas = 20.5;     // 將 20.5 賦值給 car1 所指向物件的 gas 欄位

        // 3. 使用點運算子 (.) 來「讀取」物件的欄位值
        System.out.println("登記後的車輛狀態：");
        System.out.println("  車號是：" + car1.num);
        System.out.println("  汽油量是：" + car1.gas);
    }
}
