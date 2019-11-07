package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayTest {


    public static void main(String[] args) {
        String text = "You are the best.But never stop.";
        String[] words = text.split(" ");

        for(String word : words) {
            System.out.println(word);
        }
    }
}
