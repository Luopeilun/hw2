import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Car {
    // 1. 將欄位設為 private，實現「資訊隱藏」
    private int num;
    private double gas;

    // 2. 提供 public 的 Setter 方法作為受控的寫入管道
    public void setNumGas(int n, double g) {
        // 3. 在方法內部加入驗證邏輯
        if (g > 0 && g < 1000) { // 假設油箱上限為 1000
            this.num = n;
            this.gas = g;
            System.out.println("資料驗證通過：車號設為 " + this.num + ", 汽油量設為 " + this.gas);
        } else {
            // 如果傳入的資料不合法，則拒絕修改並給出提示
            System.out.println("資料驗證失敗：" + g + " 不是一個有效的汽油量。");
            System.out.println("無法變更汽油量，物件狀態保持不變。");
        }
    }

    // public 的 Getter/Show 方法作為讀取管道
    public void show() {
        System.out.println("  目前車號是：" + this.num);
        System.out.println("  目前汽油量是：" + this.gas);
    }
}

public class Sample3_10 {
    public static void main(String[] args) {
        Car car1 = new Car();
        
        // 外部程式碼無法再直接存取欄位
        // car1.num = 1234; // 這行程式碼現在會導致編譯錯誤！
        // car1.gas = 20.5; // 這行也會報錯！

        // 必須透過 public 方法來設定
        System.out.println("--- 嘗試設定有效資料 ---");
        car1.setNumGas(1234, 20.5);
        car1.show();

        System.out.println("\n--- 嘗試設定無效資料 (-10.0) ---");
        // 這次呼叫會被 setNumGas 方法中的驗證邏輯攔截
        car1.setNumGas(1234, -10.0);
        
        // 顯示 car1 的狀態，確認其 gas 欄位並未被修改
        System.out.println("\n顯示車輛最終狀態：");
        car1.show();
    }
}
