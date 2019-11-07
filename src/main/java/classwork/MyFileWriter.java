package classwork;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class MyFileWriter {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arr = new ArrayList<String>();

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        Random rnd = new Random();

        for (int i=0; i<33; i++) {
            String listOfChar = "";
            for (int j = 0; j < rnd.nextInt(30) + 20; j++) {
                int index = rnd.nextInt(26);
                listOfChar = listOfChar + (chars.charAt(index));
            }

            arr.add(listOfChar);
        }



        BufferedWriter bw = new BufferedWriter(
                new java.io.FileWriter(
                        new File("firstFile.txt")));

        for (String s : arr) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }



}

