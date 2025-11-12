import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Car 類別
class Car {
    int num;
    double gas;

    // 方法一：一個基礎的、功能單一的方法，只負責顯示核心資訊
    // (this 可加可不加)
    public void showCoreInfo() {
        System.out.println("  車號是：" + this.num);
        System.out.println("  汽油量是：" + this.gas);
    }

    // 方法二：一個更完整的「顯示報告」方法
    // 這個方法在執行自己的任務的同時，呼叫了類別內部的另一個方法
    public void showCarReport() {
        System.out.println("===== 開始顯示車子完整資料報告 =====");
        
        // 【核心：從一個方法內部呼叫另一個方法】
        // 直接呼叫 showCoreInfo() 來完成顯示核心資訊的任務
        // 這裡可以寫成 this.showCoreInfo(); 效果完全相同
        showCoreInfo(); 
        
        System.out.println("======================================");
    }
}

public class Sample3_5 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.num = 1234;
        car1.gas = 20.5;

        // 從外部，我們只需要呼叫那個功能更完整的「報告」方法即可
        car1.showCarReport();
    }
}
