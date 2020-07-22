package Lesson02_GitHub;

public class Lesson02_gitHub {
    public static void main(String[] args) {

        System.out.println("Progam Task 1");
        byte q = 127; // хранит от -128 до 127 и занимает 1 байт
        int w = 255;
        int e = q + w;
        System.out.println(e);

        System.out.println("-------------------------------");

        System.out.println("Progam Task 2");
        short a = -32768;     // значений от -32768 до 32767 и 2 байта)
        short a1 = 32767;
        int result = (short) (a + a1);
        System.out.println(result);
    }
}
