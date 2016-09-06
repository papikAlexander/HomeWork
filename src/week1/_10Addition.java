package week1;

import java.util.Scanner;

/**
 * Created by Alexander on 06.09.2016.
 */
public class _10Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the duration and day of the negotiations.\nOne hours = 200 UAN\nWeekend discount - 20%");
        System.out.print("Time = ");
        double time = sc.nextDouble();

        System.out.print("Day = ");
        int day = sc.nextInt();
        double price;
        double hourCost = 200;
        double discount = 0.8;

        if (day == 7 || day == 6) {
            price = time * hourCost * discount;
        } else {
            price = time * hourCost;
        }

        System.out.println("Your price: " + price + " UAN");
    }
}
