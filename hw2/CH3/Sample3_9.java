public class Sample3_9 {
    public static void main(String[] args) {
        Car_9 car1;
        car1 = new Car_9();

        car1.num = 1234;
        car1.gas = -10.0; //不正確的汽油量

        car1.show();
    }
}

// Car類別
class Car_9 {
    int num;
    double gas;

    void show() {
        System.out.println("車號是" + this.num);
        System.out.println("汽油量是" + this.gas);
    }
}