import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Car {
    int num;
    double gas;

    // 【定義 Setter 方法 - 帶有參數】
    // public void setNum(int n)
    // - public: 讓外部可以呼叫
    // - void: 此方法不回傳任何值
    // - setNum: 方法名稱 (JavaBeans 規範中，設定欄位的方法通常以 set 開頭)
    // - (int n): 參數列表，宣告此方法需要一個名為 n 的整數參數
    public void setNum(int n) {
        // 方法內部，將傳入的引數值 n 賦值給物件的欄位 num
        num = n;
        System.out.println("將車號設定為：" + num);
    }

    // 另一個 Setter 方法，用於設定汽油量
    public void setGas(double g) {
        gas = g;
        System.out.println("將汽油量設定為：" + gas);
    }
    
    public void showInfo() {
        System.out.println("  目前車號: " + num + ", 油量: " + gas);
    }
}

public class Sample3_6 {
    public static void main(String[] args) {
        Car car1 = new Car();

        // 【呼叫方法並傳遞引數】
        // 呼叫 setNum 方法，並將整數值 1234 作為引數傳遞進去
        // 此時，setNum 方法中的參數 n 的值就是 1234
        car1.setNum(1234);

        // 呼叫 setGas 方法，並將浮點數值 20.5 作為引數傳遞進去
        car1.setGas(20.5);
        
        System.out.print("呼叫後的狀態:");
        car1.showInfo();

        // 也可以傳遞變數作為引數
        int carNumber = 5678;
        car1.setNum(carNumber); // 這時 n 的值就是 5678
        System.out.print("再次呼叫後的狀態:");
        car1.showInfo();
    }
}
