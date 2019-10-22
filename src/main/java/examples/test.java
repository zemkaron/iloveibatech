package examples;

public class test {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            while (true) {
                if (i < 5) break;
            }

            System.out.println("after while");
        }

        System.out.println("after for");
    }
}
