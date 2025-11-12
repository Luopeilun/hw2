import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Car {
    // 這些欄位沒有任何存取修飾符，預設為 package-private，
    // 意味著同一個 package 下的類別可以像操作自己的變數一樣直接修改它們。
    int num;
    double gas;

    public void show() {
        System.out.println("車號是：" + this.num);
        System.out.println("汽油量是：" + this.gas);
    }
}

public class Sample3_9 {
    public static void main(String[] args) {
        Car car1 = new Car();
        
        // 外部程式碼可以直接存取並設定欄位
        car1.num = 1234;

        // 【問題所在】
        // 外部程式碼可以隨意設定一個不合邏輯的值 (-10.0) 給 gas 欄位
        // Car 物件本身對此毫無防備，無法阻止這個無效的資料寫入
        System.out.println("警告：正在設定一個無效的汽油量...");
        car1.gas = -10.0;

        // 顯示結果，物件的狀態已經被「汙染」了
        car1.show();
    }
}
