package examples;

public class BasicCode {

    public static int add(int a, int b){
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        String msg = "Hello";
        int z =  add(5 ,7);
        System.out.println(msg);
        System.out.println(z);

        if (z == 13){
            System.out.println("eligible 13");
        } else  if (z == 12){
            System.out.println("eligible 12");
        }
        else System.out.println("not eligible");

        z = 5;
        switch (z){
            case 1:
                System.out.println(1);
                break;
            case 5:
                System.out.println(5);
                break;
            case 12:
                System.out.println(12);
                break;
            default:
                System.out.println("other than 1,5,12");
        }
    }


}
