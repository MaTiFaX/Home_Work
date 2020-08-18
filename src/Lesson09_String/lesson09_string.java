package Lesson09_String;

import java.util.Scanner;

public class lesson09_string {
    public static void main(String[] args) {

        System.out.println(" Задание 1\n");

        String st = "Java"; // пул
        String st2 = new String("Java"); //объект
        String st3 = st2.intern(); // в пуле объект
        String st4 = "java"; // пул
        String st5 = null; // ---
        String st6 = new String("JAVA"); // объект

        System.out.println(st == st2);
        System.out.println(st == st3);
        System.out.println(st == st4);
        System.out.println(st == st5);
        System.out.println(st == st6);

        System.out.println(st2 == st6);

        System.out.println(" ");
        System.out.println(" Задание 2\n");

        String London = "Лондон - столица Англии";
        System.out.println(London.replace("Англии", "Великобритании\n"));

        System.out.println(" Задание 3\n");

        StringBuffer str = new StringBuffer("Собака Гуляка");
        System.out.println(str.delete(4, 9));

        System.out.println(" ");
        System.out.println(" Задание 4\n");


        System.out.println("INPUT : ");
        Scanner scanner = new Scanner(System.in);
        String sc = scanner.nextLine();
        scan(sc);
    }
        public static void scan(String asd) {

            StringBuffer revers1 = new StringBuffer(asd);
              revers1.reverse();
              System.out.println(revers1);

//            System.out.println(revers1.reverse());

        }
}

