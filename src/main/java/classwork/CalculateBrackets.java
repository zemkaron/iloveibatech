package classwork;

public class CalculateBrackets {
    public static void main(String[] args) {
        CalculateBrackets cb = new CalculateBrackets();
        System.out.println(cb.calcBrackets("(())"));
    }

    public int calcBrackets(String input) {
        int ob = 0;
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)){
                case '(' : ob++; break;
                case ')' : ob--; break;
                default: throw new IllegalArgumentException("Wrong char");
            }
            counter = Math.max(counter,ob);
        }

        return counter;
    }
}
