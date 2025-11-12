public class Sample3_5 {
    public static void main(String[] args) {
        Car_5 car1;
        car1 = new Car_5();

        car1.num = 1234;
        car1.gas = 20.5;

        car1.showCar_5();
    }
}

// Car類別
class Car_5 {
    int num;
    double gas;

    void show() {
        System.out.println("車號是" + this.num);
        System.out.println("汽油量是" + this.gas);
    }

    void showCar_5() {
        System.out.println("開始顯示車子資料");
        this.show();
    }
}