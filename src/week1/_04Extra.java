package week1;

import java.util.Scanner;

/**
 * Created by Alexander on 06.09.2016.
 */
public class _04Extra {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();
        int fibonacci = 0;
        int res = 0;
        int res2 = 1;
        if (n == 0 || n == 1) {
           fibonacci = n;
        } else {
            for (int i = 2; i > n; i++){
                fibonacci = res + res2;
                res = res2;
                res2 = fibonacci;
            }
        }
        System.out.println("ф = " + fibonacci);
    }
}
