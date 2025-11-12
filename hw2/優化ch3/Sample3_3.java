import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Car 類別定義 (保持不變)
class Car {
    int num;
    double gas;

    // 增加一個顯示資訊的方法，讓程式碼更整潔 (物件導向思想)
    public void showInfo() {
        System.out.println("  車號是：" + num);
        System.out.println("  汽油量是：" + gas);
    }
}

public class Sample3_3 {
    public static void main(String[] args) {
        // --- 建立並操作第一個 Car 物件 ---
        System.out.println("處理第一輛車 (car1)...");
        Car car1 = new Car(); // car1 指向記憶體中的第一個 Car 物件
        car1.num = 1234;
        car1.gas = 20.5;
        
        // --- 建立並操作第二個 Car 物件 ---
        System.out.println("處理第二輛車 (car2)...");
        Car car2 = new Car(); // car2 指向記憶體中一個全新的、獨立的 Car 物件
        car2.num = 2345;
        car2.gas = 30.5;
        
        System.out.println("-------------------------");
        
        // --- 分別顯示兩輛車的資訊 ---
        System.out.println("第一輛車 (car1) 的資訊：");
        car1.showInfo(); // 呼叫 car1 物件自己的 showInfo 方法

        System.out.println("\n第二輛車 (car2) 的資訊：");
        car2.showInfo(); // 呼叫 car2 物件自己的 showInfo 方法

        // 證明 car1 和 car2 是獨立的
        System.out.println("\n修改 car1 的油量...");
        car1.gas = 99.9;
        
        System.out.println("修改後 car1 的資訊：");
        car1.showInfo();
        System.out.println("car2 的資訊並未受影響：");
        car2.showInfo();
    }
}
