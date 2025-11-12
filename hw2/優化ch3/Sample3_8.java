import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Car {
    // 欄位最好設為 private，強制外部只能透過 getter/setter 存取
    private int num;
    private double gas;

    // --- Setter 方法 ---
    // 一次性設定車號和油量 (無回傳值)
    public void setNumGas(int n, double g) {
        this.num = n;
        this.gas = g;
        System.out.println("將車號設為 " + this.num + "，汽油量設為 " + this.gas);
    }

    // --- Getter 方法 ---
    // 獲取車號 (回傳 int)
    public int getNum() {
        System.out.println(" (正在調查車號...)");
        return this.num;
    }

    // 獲取汽油量 (回傳 double)
    public double getGas() {
        System.out.println(" (正在調查汽油量...)");
        return this.gas;
    }
}

public class Sample3_8 {
    public static void main(String[] args) {
        Car car1 = new Car();

        // 1. 使用 Setter 方法設定物件狀態
        car1.setNumGas(1234, 20.5);

        System.out.println("\n開始透過 Getter 方法調查樣品車的資訊...");
        
        // 2. 呼叫 Getter 方法，並用變數接收回傳值
        int number = car1.getNum();
        double gasoline = car1.getGas();

        // 3. 使用獲取到的值
        System.out.println("調查結果：");
        System.out.println("車號是 " + number + "，汽油量是 " + gasoline + "。");
    }
}
