package classwork;

public class ExApp01 {

    public static boolean isNumeric(String origin){
        try{
            Integer.parseInt(origin);
            return true;
        }catch (NumberFormatException ex){
            System.out.println("Exception");
            return false;
        }
    }


    public static void main(String[] args) {
        String in = "1 23 ab c 1";
        String[] gap = in.split(" ");

            int sum = 0;
            for (int i = 0; i < gap.length; i++) {
                if(isNumeric(gap[i])){
                    sum += Integer.parseInt(gap[i]);
                }
            }
        System.out.println(sum);

    }

}
