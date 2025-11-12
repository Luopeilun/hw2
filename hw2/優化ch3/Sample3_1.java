import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// 定義一個 Car 類別，這是一個設計藍圖
class Car {
    // 屬性 (欄位)
    int num;
    double gas;
    
    // 行為 (方法) - 暫時為空
}

public class Sample3_1 {
    public static void main(String[] args) {
        // --- 從類別建立物件的過程 ---

        // 1. 宣告一個類型為 Car 的變數 car1。
        //    此時 car1 尚未指向任何物件，其值為 null。
        //    它就像一個準備貼上地址的信封。
        Car car1;

        System.out.println("宣告後，car1 的值為: " + null); // 實際上是 null，不能直接印 car1

        // 2. 使用 `new Car()` 建立一個 Car 物件的實體。
        //    `new` 會在記憶體中開闢一塊空間，並根據 Car 類別的定義初始化內部欄位 (int 為 0, double 為 0.0)。
        //    這個操作就像是蓋好了一棟房子。
        
        // 3. 使用賦值運算子 `=` 將新建立物件的記憶體位址存入 car1 變數。
        //    現在，car1 就「參考」或「指向」了這個新物件。
        //    就像是把房子的地址寫在信封上。
        car1 = new Car();
        
        System.out.println("建立物件並賦值後，car1 指向一個物件: " + car1.toString());

        // --- 更常見的合併寫法 ---
        // 將宣告和建立合併為一行，更為簡潔。
        Car car2 = new Car();
        System.out.println("car2 同時宣告並建立: " + car2.toString());
    }
}
