package examples;

import java.util.Random;
import java.util.Scanner;

public class RandomLetter {
    public static String gen_rand(int length){
        Random r = new Random();
        String l = "";

        for (int i=0; i<length; i++) {
            int number = (char) (r.nextInt(26) + 'a');
            int number1 = (char) (r.nextInt(26) + 'A');

            char c = (char) number;
            char c1 = (char) number1;

            l = l + c+ c1;
        }

        return l;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int n = sc.nextInt();
        String s = gen_rand(n);
        System.out.println(s.substring(0,n));
    }
}
