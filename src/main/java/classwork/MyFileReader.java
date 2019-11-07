package classwork;

import java.io.*;

public class MyFileReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
               new FileReader(
                        new File("firstFile.txt")));
        String line;

        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
    }
}
