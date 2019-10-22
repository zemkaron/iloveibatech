package examples;

import java.util.Random;

public class RandomLetter {
    public static String gen_rand(int length){
        Random r = new Random();
        String l = String.valueOf(r.nextInt(26) + 'a');
        return l;
    }
    public static void main(String[] args) {
        String s = gen_rand(5);
        System.out.println(s);
    }
}
