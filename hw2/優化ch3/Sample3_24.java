import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sample3_24 {
    public static void main(String[] args) {
        // 準備好Car[]型態陣列變數並宣告三個Car類別型態的陣列元素
        Car[] car1;
        car1 = new Car[3];

        // 建立三個新物件，分別指定給三個陣列元素
        for (int i = 0; i < car1.length; i++) {
            car1[i] = new Car();
        }

        // 分別為陣列元素做setCar方法
        car1[0].setCar(1234, 20.5);
        car1[1].setCar(2345, 30.5);
        car1[2].setCar(3456, 40.5);

        for (int i = 0; i < car1.length; i++) {
            car1[i].show();
        }
    }
}

class Car {
    private int num;
    private double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("將車號設為" + num + ",汽油量設為" + gas);
    }

    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}
