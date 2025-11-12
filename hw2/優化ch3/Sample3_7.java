import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Car {
    int num;
    double gas;

    // 【定義帶有多個參數的方法】
    // 這個方法同時接受一個整數 (n) 和一個浮點數 (g)
    public void setNumGas(int n, double g) {
        // 在方法內部，可以使用所有傳入的參數
        num = n;
        gas = g;
        System.out.println("將車號設定為 " + num + "，同時將汽油量設定為 " + gas + "。");
    }

    // 原有的 show 方法保持不變，用於驗證結果
    public void show() {
        System.out.println("車輛目前狀態 -> 車號: " + num + ", 汽油量: " + gas);
    }
}

public class Sample3_7 {
    public static void main(String[] args) {
        Car car1 = new Car();
        
        // 準備要傳遞的資料
        int number = 1234;
        double gasoline = 20.5;

        System.out.println("呼叫 setNumGas 方法，一次設定所有屬性...");
        
        // 【呼叫帶有多個引數的方法】
        // 必須按照 `(int, double)` 的順序和類型提供引數
        car1.setNumGas(number, gasoline);

        // 驗證設定是否成功
        car1.show();
        
        // 如果順序或類型錯誤，將會導致編譯錯誤
        // car1.setNumGas(gasoline, number); // 錯誤！類型不匹配 (double, int)
    }
}
