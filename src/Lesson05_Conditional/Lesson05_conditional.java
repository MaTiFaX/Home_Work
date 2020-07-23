package Lesson05_Conditional;

import java.util.Scanner;

public class Lesson05_conditional {
    public static void main(String[] args) {
        System.out.println("Task 1: beginning ");
        int a = 7;
        int b = --a; // 1-7; a = 6

        if (b == 7) { // 6 != 7
            System.out.println("b = 7");  // по этому не выведен на консоль ничего
        }
        System.out.println("Task 1: end");
        System.out.println(" ");

        System.out.println("Task 2: beginning ");
        int c = 3, d = 2;

        if (c == d++) { // к переменной d +1 поступит после данной функции, по этому 3 != 2
            System.out.println("It is 'if' statement!"); // следовательно, условие не выполненно и переходим к else
        } else {
            System.out.println("It is 'else' statement");
        }

        System.out.println("Task 2: end");
        System.out.println(" ");

        System.out.println("Task 3: beginning ");
        int e = 34, r = 2, t = 78;
        {
            if (e > r && e > t)
                System.out.println("e: number is the largest");
            else if (r > e && r > t)
                System.out.println("r:  number is the largest");
            else if (t > r && t > e)
                System.out.println("t:  number is the largest");
        }
        {
            if (e < r && e < t)
                System.out.println("e: number is the minimum");
            else if (r < e && r < t)
                System.out.println("r: number is the minimum");
            else if (t < r && t < e)
                System.out.println("t: number is the minimum");
        }

        System.out.println("Task 3: end");
        System.out.println(" ");

        System.out.println("Task 4: beginning ");

            int a4 = 10;
            int c4 = a4;
            int b4 = ++a4;

            if (b4 >= a4) {
                if (c4 != 10) {
                    if ((c4 <= b4) && (a4 != b4)) {
                        System.out.println("All statements are true.");
                    } else {
                        System.out.println("One of the statements isn't true.");
                    }
                } else {
                    System.out.println("One of statements is true.");
                }
            } else {
                System.out.println("All statements are false");
            }
            System.out.println("Task 4: end");
            System.out.println(" ");

        System.out.println("Task 5: beginning ");

        int num =  8 ;
        final String message = num > 10
                ? "Number is greater than 10"
                : "Number is less than or equal to 10";

        System.out.println(message);
        System.out.println("Task 5: end");
        System.out.println(" ");

        System.out.println("Task 6: beginning ");

        System.out.println("Введите номер месяца");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

            switch (month){
                case 1 :
                    System.out.println("Вы выбрали Январь - зима");
                        break;
                case 2:
                    System.out.println("Вы выбрали Февраль - зима");
                        break;
                case 3:
                    System.out.println("Вы выбрали Март - весна");
                        break;
                case 4:
                    System.out.println("Вы выбрали Апрель - весна");
                        break;
                case 5:
                    System.out.println("Вы выбрали Май - весна");
                        break;
                case 6:
                    System.out.println("Вы выбрали Июнь - лето");
                        break;
                case 7:
                    System.out.println("Вы выбрали Июль - лето");
                        break;
                case 8:
                    System.out.println("Вы выбрали Август - лето");
                        break;
                case 9:
                    System.out.println("Вы выбрали Сентябрь - осень");
                        break;
                case 10:
                    System.out.println("Вы выбрали Октябрь - осень");
                        break;
                case 11:
                    System.out.println("Вы выбрали Ноябрь - осень");
                        break;
                case 12:
                    System.out.println("Вы выбрали Декабрь - зима");
            }

        System.out.println("Task 6: end");
        System.out.println(" ");

        System.out.println("Task 7: beginning ");

        System.out.println("Enter the day of the week.");
        Scanner scn = new Scanner(System.in);
        String day = scanner.next().toLowerCase(); // it can be any day

        switch(day) {
            case "monday":
                System.out.println("This is the first day of the week");
                break;
            case "tuesday":
                System.out.println("This is the second day of the week");
                break;
            case "wednesday":
                System.out.println("This is the third day of the week");
                break;
            case "thursday":
                System.out.println("This is the fourth day of the week");
                break;
            case "friday":
                System.out.println("This is the fifth day of the week");
                break;
            case "saturday":
                System.out.println("This is the sixth day of the week");
                break;
            case "sunday":
                System.out.println("This is the seventh day of the week");
                break;
            default:
                System.out.println("Such day of the week doesn't exist.");
        }

        System.out.println("Task 7: end");
        System.out.println(" ");

        }
}
