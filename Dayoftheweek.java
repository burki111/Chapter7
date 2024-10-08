package Chapter7;

import java.util.Scanner;

public class Dayoftheweek {
    private static final String[] week = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday"};
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 1; i <= week.length; i++) {
            System.out.println("\nEnter the number of the day");
            int indexnumber = input.nextInt() - 1;

            System.out.println("The Day for the number is: " + week[indexnumber]);

        }
    }



}

