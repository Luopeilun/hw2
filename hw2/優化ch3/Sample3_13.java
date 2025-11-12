import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sample3_13 {
    public static void main(String[] args) {
        // 呼叫沒有參數的建構式
        Car car1 = new Car();
        car1.show();

        // 呼叫兩個參數的建構式
        Car car2 = new Car(1234, 25.0);
        car2.show();
    }
}

class Car {
    private int num;
    private double gas;

    // 沒有參數的建構式
    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }

    // 兩個參數的建構式
    public Car(int n, double g) {
        num = n;
        gas = g;
        System.out.println("生產了車號為" + num + ",汽油量為" + gas + "的車子");
    }

    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油輛是" + gas);
    }
}
