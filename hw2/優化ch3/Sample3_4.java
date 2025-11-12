import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Car 類別，包含了屬性和一個行為
class Car {
    // 屬性 (欄位)
    int num;
    double gas;

    // 【方法的定義】
    // 這個方法定義了「顯示車輛資訊」的行為。
    // void 表示這個方法執行完畢後，不返回任何結果。
    public void show() {
        System.out.println("車輛資訊：");
        System.out.println("  車號: " + num);
        System.out.println("  汽油量: " + gas);
        System.out.println("-----------------");
    }
}

public class Sample3_4 {
    public static void main(String[] args) {
        // 建立 Car 物件
        Car car1 = new Car();
        
        // 設定物件的屬性
        car1.num = 1234;
        car1.gas = 20.5;

        // 【方法的呼叫】
        System.out.println("第一次呼叫 show() 方法：");
        car1.show(); // 透過 car1 參考，呼叫 Car 物件的 show 方法

        System.out.println("更新 car1 的汽油量...");
        car1.gas = 30.8;
        
        // 【方法的重用】
        System.out.println("第二次呼叫 show() 方法，顯示更新後的資訊：");
        car1.show(); // 再次呼叫同一個方法，顯示了最新的狀態
    }
}
