package Lesson04_Operators;

import java.sql.SQLOutput;

public class Lesson04_operators{
    public static void main(String[] args) {

        System.out.println("Task 1: beginning ");
        int a = 2;
        int b = a + 5; // 2 + 5
        int c = (a - b) + 1; // 2 - 5 + 1
        int d = a * b * c; //2 * 7 * -4
        int e = b / 8; // 7 / 8
        int f = e % 30; // 0 % 30
        int i = f++; // 0 + 1

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(i);
        System.out.println("Task 1: end");
        System.out.println(" ");

        System.out.println("Task 2: beginning");

        int z = 10;
        int z1 = 10;
        int z2 = 10;
        int z3 = 10;
        int z4 = 10;

        z += 3;
        z1 -= 7;
        z2 *= 4;
        z3 /= 8;
        z4 %= 2;

        System.out.println(z);
        System.out.println(z1);
        System.out.println(z2);
        System.out.println(z3);
        System.out.println(z4);
        System.out.println("Task 2: end");
        System.out.println(" ");

        System.out.println("Task 3: beginning");

        int a1 = 0;
        int b1 = 5;
        a1++;
        b1--;

        System.out.println(a1);
        System.out.println(b1);

        a1 = b1--;
        /* (post-increment) изначально а1 прировняло к b1, после из b1 вычитаем -1;
        (pre-increment) вышло, что изначально к b1 добавляем +1, далее a1 + b1
        */
        System.out.println(a1);
        System.out.println(b1);
        /* Инкремент:  увеличивает значение переменной на 1 обозначается двумя знаками плюс "++"
        Декремент: уменьшает значение переменной на 1. обозначается двумя знаками плюс "--"
         прединкремент  изначально икрементирует или декрементирует переменную.
        постинкремент икрементирует или декрементирует переменную после вычисления.
         */
        System.out.println("Task 3: end");
        System.out.println(" ");

        System.out.println("Task 4: beginning");

        int a4 = 3;
        int b4 = 5;

        System.out.println(a4 < b4); // 3 < 5
        System.out.println(a4 >= b4); // 3 >= 5
        System.out.println(a4 <= b4); // 3 <= 5
        System.out.println(a4 == b4); // 3 = 5
        System.out.println(a4 != b4); // 3 не равно 5


        System.out.println("Task 4: end");
        System.out.println(" ");

        System.out.println("Task 5: beginning");
        /*
        Логический операнд — это выражение, о котором можно сказать что оно является истинным или ложным,
        true или false;
         */
        boolean bOne = true;
        boolean bTwo = false;

        System.out.println(bOne && bTwo);//То же самое, что и &, но если операнд, находящийся слева от & является false,
                                        // данный оператор возвращает false без проверки второго операнда.
        System.out.println(bOne || bTwo);// условное "или" (сокращённое логическое ИЛИ) То же самое, что и |,
                                        // но если оператор слева является true, оператор возвращает true без проверки второго операнда.
        System.out.println(!bTwo);       // логическое отрицание или инверсия.
        System.out.println(bOne ^ bTwo); // логическое "исключающее" или строгая дизъюнкция.Возвращает true, если один и только один из операндов равен true.
                                        // Возвращает false, если оба операнда равны true или false. По сути, возвращает true, если операнды — разные.
        System.out.println(bOne & bTwo); // логическое "и" или коньюнити. Возвращает true если оба операнда равны true.
        System.out.println(bOne | bTwo); // логическое "или" или дтзъюнкция.Возвращает true если хотя бы один из операндов равен true.
        System.out.println(!bOne);
        /*
        а. правда  ||  ложь             правда
        б. false  &&  true              ложь
        c. ! правда  ||  1  > =  0      правда
        д. false  &&  5                 ложь
        e. правда  &&!  ложный          ложь
        ф. правда  ^ !  правда          правда
        я. 1 >=  1  ||  ложный          правда
        г. верно  &&  5  -  5           условия не соблюдены. выдаст ошибку.
        */
        System.out.println("Task 5: end");
        System.out.println(" ");

        System.out.println("Task 6: beginning");

        int a6 = 4;
        int b6 = 3;

        System.out.println(a6 & b6); // выйдет только тогда, когда обе части "true"
        System.out.println(a6 | b6); // если хоть одна часть "true", тогда все "true"
        System.out.println(~b6); // происходит инверсия чисел с 1 на 0 и на оборот.
        System.out.println(a6 ^ b6); // обе части должны отличаться друг от друга, (0 ^ 1 → 1) но (1 ^ 1 → 0).

        System.out.println("Task 6: end");
        System.out.println(" ");

        System.out.println("Task 7: beginning");

        int a7 = 10;
        System.out.println(a7 <<= 1); // 0 0 0 1 0 1 0 0
        System.out.println(a7 >> 2);  // 0 0 0 0 0 1 0 1
        int a8 = -5;
        System.out.println(a8 >>> 1); /* "-" не сохраняется, берется самое большое значение из допустимых
         в типе int(2147483647) и дальше */



        System.out.println("Task 7: end");
        System.out.println(" ");
    }

    }
