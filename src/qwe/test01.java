package qwe;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author shkstart
 * @create 2020-11-06-19:17
 */
public class test01 {
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            System.out.println(i);

        }

        System.out.println("helloworld!!!!");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("test01.main");
        int num1=10;
        int num2=20;
        System.out.println("num = " + num2);
        System.out.println(num1);
        String[] arr=new String[]{"tom","jory","lilei"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);
        }


        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);

        }


    }
}
