package lesson03_DataTypes;

public class Lesson03_DataTypes {
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

        System.out.println("-------------------------------");

        System.out.println("Progam Task 3");
        int x = 1200;    //-2147483648 до 2147483647 и занимает 4 байта
        int x2 = 1200;
        int x3 = x;
        System.out.println(x);
        x2 = x2 * x2;
        System.out.println(x2);
        x3 = x3 * x3 * x3;
        System.out.println(x3);

        System.out.println("-------------------------------");

        System.out.println("Progam Task 4");
        long L = 9223372036854775807L; // там где требуется данный диапазон
        System.out.println(L);

        System.out.println("-------------------------------");

        System.out.println("Progam Task 5");
        double A = 1245.554;
        float B = 256.3785f; // -3.4*1038 до 3.4*1038 и занимает 4 байта
        double result1 = (A * B) % 1;
        System.out.println(result1);

        System.out.println("-------------------------------");

        System.out.println("Progam Task 6");
        char p = '+'; // целочисленное значение от 0 до 65535
        char v = '!';
        char b = '?';
        System.out.println(p + "\n" + v + "\n" + b);

        System.out.println("-------------------------------");

        System.out.println("Progam Task 7");
        System.out.println("b,e,f,g,h,j,l");

        System.out.println("-------------------------------");

        System.out.println("Progam Task 8");
            /* 123 в двоичной:
               123 / 2 = 61 (1)
               61 / 2 = 30 (1)
               30 / 2 = 15 (0)
               15 / 2 = 7 (1)
               7 / 2 = 3 (1)
               3 / 2 = 1 (1)
               1 / 2 = 0 (1)
               >> 123 в двоичной = 1111011


               123 в восьмеричной системе:
               123 / 8 = 15 (3)
               15 / 8 = 1 (7)
               1 / 8 = 0 (1)
               >> 123 = в восьмеричной 173

               123 в шестнадцатеричная система:
               123 / 16 = 7 (11)
               7 / 16 = 0 (7)
               >> 11 = B; 123 = b7
             */
        System.out.println("123 = 0b1111011");
        System.out.println("123 = 173");
        System.out.println("123 = 0xb7");

        System.out.println("-------------------------------");

        System.out.println("Progam Task 9");
        String s;           // s ссылка на строку (stack).
        s = "hello world";  //"hello world" - объект (heap)
        int xx = 22;        // в примитивных только стек
        Integer xx1 = 33;
        /* Wrapper  Boolean – 128 bits
         Byte – 128 bits
         Short, Character – 128 bits
         Integer, Float – 128 bits
         Long, Double – 192 bits
         */

        System.out.println("-------------------------------");
    }
}
