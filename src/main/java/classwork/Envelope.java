package classwork;

public class Envelope {
    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                if(i == 0
                        || i == 9
                        || j == 0
                        || j == 9
                        || (i == 1 && j == 1)
                        || (i == 1 && j == 8)
                        || (i == 2 && j == 2)
                        || (i == 2 && j == 7)
                        || (i == 3 && j == 3)
                        || (i == 3 && j == 6)
                        || (i == 4 && j == 4)
                        || (i == 4 && j == 5)
                        || (i == 5 && j == 3)
                        || (i == 5 && j == 6)
                        || (i == 6 && j == 2)
                        || (i == 6 && j == 7)

                ) {
                    System.out.print("*" + "  ");
                }
               else System.out.print("   ");
            }
            System.out.println();
        }
    }
}
