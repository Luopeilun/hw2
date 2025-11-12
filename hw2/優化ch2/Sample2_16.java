// 引入反射 (Reflection) API 中的 Array 類別
import java.lang.reflect.Array;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Sample2_16 {
    public static void main(String[] args) {
        System.out.println("使用 java.lang.reflect.Array 動態建立陣列：");

        try {
            // 【核心：動態建立陣列】
            // Array.newInstance(componentType, length)
            // componentType: 陣列元素的類型，這裡用 int.class 表示是 int 類型
            // length: 陣列的長度
            // 因為 newInstance 回傳的是 Object 類型，所以需要強制轉型成 (int[])
            int[] intArray = (int[]) Array.newInstance(int.class, 3);

            // 【核心：動態設定與讀取元素】
            // Array.set(array, index, value) - 動態設定指定索引的值
            System.out.println("設定陣列元素...");
            Array.set(intArray, 0, 123); // 等同於 intArray[0] = 123;
            Array.set(intArray, 1, 456); // 等同於 intArray[1] = 456;
            Array.set(intArray, 2, 789); // 等同於 intArray[2] = 789;

            // Array.get(array, index) - 動態讀取指定索引的值
            System.out.println("讀取陣列元素...");
            for (int i = 0; i < intArray.length; i++) {
                System.out.println("intArray[" + i + "] = " + Array.get(intArray, i));
            }

        } catch (Exception e) {
            // newInstance 和 set/get 可能會拋出各種例外
            System.out.println("動態操作陣列時發生錯誤。");
            e.printStackTrace();
        }
    }
}
