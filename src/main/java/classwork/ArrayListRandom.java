package classwork;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListRandom {
    private static ArrayList<Integer> RandomArray(int n) {

        ArrayList<Integer> arrayRandom = new ArrayList<Integer>(n);

        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int r = rand.nextInt(100);
            arrayRandom.add(r);

        }
        return arrayRandom;
    }

    private static void ShowArray(ArrayList<Integer> randomArray)
    {
        int n = randomArray.size();

        List<Integer> showArray = new ArrayList<Integer>(n);

        for (int i = 0; i<n; i++)
        {
            int r = randomArray.get(i);
            showArray.add(r);
        }
        System.out.println(showArray);

    }

    public static void main(String[] args) {
        ShowArray(RandomArray(30));
    }
}


