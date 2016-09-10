package week1;

import java.util.Scanner;

/**
 * Created by Alexander on 06.09.2016.
 */
public class _12Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Скрость ветра = ");
        int speed = sc.nextInt();

        if(speed >= 1 && speed < 5){
            System.out.println("Скорость ветра " + speed + " м/с,  слабый ветер");
        } else if(speed >= 5 && speed < 9){
            System.out.println("Скорость ветра " + speed + " м/с, умеренный ветер");
        } else if(speed >= 9 && speed < 18){
            System.out.println("Скорость ветра "+ speed + " м/с, сильный ветер");
        } else {
            System.out.println("Скорость ветра " + speed + " м/с, ураган");
        }
    }
}
