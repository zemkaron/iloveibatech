package classwork;

import java.util.Arrays;

public class RandomMirror {


    public static int[] filter_negatives(int[] origin) {
        int[] result = new int[origin.length];
        int pos = 0;
        for (int val : origin) {
            if (val < 0) {
                result[pos++] = val;
            }
            if (pos == origin.length) {
                return result;
            }
            return Arrays.copyOf(result, pos);
        }
        return result;
    }

        public static int[] filter_odd(int[] origin) {
            throw new IllegalArgumentException("not implemented yet");
        }

        public static int[] filter_even(int[] origin) {
            throw new IllegalArgumentException("not implemented yet");
        }

        public static void main(String[] args) {
            int min = -5;
            int max = 5;
            int range = max - min;
            int length = 20;
            int[] data = new int[length];
            for (int i = 0; i < length; i++) {
                data[i] = (int) (Math.random()*range+min);
            }
            System.out.println(Arrays.toString(data));
            int[] reverted = new int[length];
            for (int i = 0; i < length; i++) {
                int src_pos = i;
                int dst_pos = length - i - 1;
                reverted[dst_pos] = data[src_pos];
            }
            String s = Arrays.toString(reverted);
            System.out.println(s);

            int[] negatives = filter_negatives(data);
            int[] odd = filter_odd(data);
            int[] even = filter_even(data);







        }
    }
