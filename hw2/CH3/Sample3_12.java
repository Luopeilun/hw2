public class Sample3_12 {
    public static void main(String[] args) {
        Car_12 car1;
        car1 = new Car_12();

        car1.show();
    }
}

// Car類別
class Car_12 {
    private int num;
    private double gas;

    public Car_12() {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }

    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油輛是" + gas);
    }
}