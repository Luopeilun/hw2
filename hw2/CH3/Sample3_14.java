public class Sample3_14 {
    public static void main(String[] args) {
        Car_14 car1 = new Car_14();
        car1.show();

        Car_14 car2 = new Car_14(1234, 25.0);
        car2.show();
    }
}

// Car類別
class Car_14 {
    private int num;
    private double gas;

    public Car_14() {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }

    public Car_14(int n, double g) {
        this(); // 調用無參數的建構式
        num = n;
        gas = g;
        System.out.println("生產了車號為" + num + ", 汽油量為" + gas + "的車子");
    }

    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油輛是" + gas);
    }
}