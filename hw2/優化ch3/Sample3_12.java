import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sample3_12 {
    public static void main(String[] args) {
        // 建立新物件就會呼叫建構式
        Car car1 = new Car();
        car1.show();
    }
}

class Car {
    private int num;
    private double gas;

    // 建構式名稱與類別名稱相同
    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }

    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油輛是" + gas);
    }
}
