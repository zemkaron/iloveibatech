package examples;

import java.util.Random;

public class GenRand {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.print((char)(r.nextInt(26) + 'a'));
        }
    }
}
