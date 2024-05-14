package ComputeAvgTemp;

import java.util.Arrays;
import java.util.Scanner;

public class ComputeAvgTemp {
    public static void main(String[] args) {
        double[] temps = new double[8];
        double sum = 0;
        Scanner input = new Scanner(System.in);

        // Step 2: Prompt the user to enter all the temperatures
        for (int i = 0; i < temps.length; i++) {
            while (true) {
                try {
                    System.out.print("Enter temperature " + (i + 1) + ": ");
                    temps[i] = input.nextDouble();
                    sum += temps[i];
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a valid floating point number.");
                    input.next(); // Clear the invalid input
                }
            }
        }

        // Step 3: Calculate the average temperature
        double avg = sum / temps.length;
        System.out.println();
        System.out.println("Entered temperatures: " + Arrays.toString(temps));
        System.out.println("The average temperature is: " + avg + " degrees");

        // Step 4: Count how many temperatures are above the average
        int aboveAvgCount = 0;
        for (double temp : temps) {
            if (temp > avg) {
                aboveAvgCount++;
            }
        }

        // Print the results
        System.out.println("Number of temperatures above average: " + aboveAvgCount);
        input.close();
    }
}
