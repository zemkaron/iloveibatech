package classwork;

import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[20];
        int[] pOdd = new int[20];

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(20)-10;
            System.out.print(a[i]);
            if (i < a.length-1){
                System.out.print(",");
            }
        }


        System.out.println();

        //first way to print reversed array

        for (int i = a.length-1; i >= 0; i--) {
            System.out.print(a[i]);
            if (i > 0){
                System.out.print(",");
            }
        }
        System.out.println();

        //second way to print reversed array


        for (int i = 0; i < a.length; i++){
            if(a[i] < 0){
                System.out.print(a[i]);
                if (i < a.length-1){
                    System.out.print(",");
                }
            }
        }

        System.out.println();

        for (int i = 0; i < a.length; i++){
            if(a[i] > 0 && a[i]%2 == 0){
                System.out.print(a[i]);
                if (i < a.length-1){
                    System.out.print(",");
                }
            }
        }


        System.out.println();

        for (int i = 0; i < a.length; i++){
            if(a[i] > 0 && a[i]%2 != 0){
                System.out.print(a[i]);
                if (i < a.length-1){
                    System.out.print(",");
                }
            }
        }
    }
}
