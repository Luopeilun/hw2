public class Sample3_24 {
    public static void main(String[] args) {
        Car_24[] car1;
        car1 = new Car_24[3];

        for (int i = 0; i < car1.length; i++) {
            car1[i] = new Car_24();
        }

        car1[0].setCar_24(1234, 20.5);
        car1[1].setCar_24(2345, 30.5);
        car1[2].setCar_24(3456, 40.5);

        for (int i = 0; i < car1.length; i++) {
            car1[i].show();
        }
    }
}

// Car類別
class Car_24 {
    private int num;
    private double gas;

    public Car_24() {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }

    public void setCar_24(int n, double g) {
        num = n;
        gas = g;
        System.out.println("將車號設為" + num + ", 汽油量設為" + gas);
    }

    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}