package lesson07_Loops;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Lesson07_loops {
    public static void main(String[] args) {
        System.out.println(" Задание 1");

        for (int i = 10; i <= 20; i++) {
            System.out.println(i * i);
        }

        System.out.println("  ");
        System.out.println(" Задание 2\n");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число");
        int n = scanner.nextInt();
        int x = 1;

        while (n >= x * x) {
            System.out.println("квадрат " + x + " = "+ x * x);
            x++;
        }
        System.out.println("  ");
        System.out.println(" Задание 3\n");

        int[] myArr = {10, 20, 15, 17, 24, 35};

        int mul = 1;
        //      for (int g = 0; g<myArr.length; g++){
        //          mul *= myArr[g];
        //     }
        //     System.out.println(mul);

        for (int g : myArr) {
            mul = g * mul;
        }
        System.out.println(mul);

        System.out.println("  ");
        System.out.println(" Задание 4\n");

        for (int l = 0; l < 1; l++){
            System.out.println("  * ");
            for (int c = 0; c < 1; c++){
                System.out.println("  ** ");
            }
        }


        }
    }
