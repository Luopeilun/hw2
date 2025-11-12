public class Sample3_11 {
    public static void main(String[] args) {
        Car_11 car1;
        car1 = new Car_11();

        car1.setCar_11(1234, 20.5);
        car1.show();

        System.out.println("只變更車號");
        car1.setCar_11(2345);
        car1.show();

        System.out.println("只變更汽油量");
        car1.setCar_11(30.5);
        car1.show();
    }
}

// Car類別
class Car_11 {
    private int num;
    private double gas;

    public void setCar_11(int n) {
        num = n;
        System.out.println("將車號設為" + num);
    }

    public void setCar_11(double g) {
        gas = g;
        System.out.println("將汽油量設為" + gas);
    }

    public void setCar_11(int n, double g) {
        num = n;
        gas = g;
        System.out.println("將車號設為" + num + ", 汽油量設為" + gas);
    }

    public void show() {
        System.out.println("車號是" + this.num);
        System.out.println("汽油量是" + this.gas);
    }
}