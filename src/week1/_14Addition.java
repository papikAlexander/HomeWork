package week1;

import java.util.Scanner;

/**
 * Created by Alexander on 06.09.2016.
 */
public class _14Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number = ");
        int number = sc.nextInt();
        int piece1 = number % 10;
        int residue = number / 10;
        int piece2 = residue % 10;
        residue /= 10;
        int piece3 = residue % 10;
        residue /= 10;
        int piece4 = residue % 10;
        residue /= 10;
        int piece5 = residue % 10;
        residue /= 10;
        int piece6 = residue % 10;

        if (piece1 + piece2 + piece3 == piece4 + piece5 + piece6)
            System.out.println("Happy number");
         else
            System.out.println("Number not happy");
    }
}
