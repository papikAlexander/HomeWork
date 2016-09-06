package week1;

import java.util.Scanner;

/**
 * Created by Alexander on 06.09.2016.
 */
public class _03Extra {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

        System.out.print("Enter = ");
        int number = sc.nextInt();
        int counter = 0;
        int digit;

        while(number != 0){
            digit = number % 10;
            if(digit == 8)
                counter++;
            number /= 10;
        }
        System.out.println(counter);
    }
}
