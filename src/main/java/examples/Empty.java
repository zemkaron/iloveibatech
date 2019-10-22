package examples;

import java.util.Scanner;

public class Empty {
    public static void main(String[] args) {
        String[][] scedule = new String[7][2];

        scedule[0][0] = "Sunday";
        scedule[0][1] = "Dinner with Leila";
        scedule[1][0] = "Monday";
        scedule[1][1] = "go to courses; watch a film";
        scedule[2][0] = "Tuesday";
        scedule[2][1] = "department meeting";
        scedule[3][0] = "Wednesday";
        scedule[3][1] = "do home work";
        scedule[4][0] = "Thursday";
        scedule[4][1] = "do home work";
        scedule[5][0] = "Friday";
        scedule[5][1] = "go to courses";
        scedule[6][0] = "Saturday";
        scedule[6][1] = "watch a film; go to gym";

        for (int row = 0; row < scedule.length; row++) {
                System.out.println(scedule[row][0]);
        }
    }
}
