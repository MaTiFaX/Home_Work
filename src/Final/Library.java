package Final;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Финальное техническое задание:
 * Необходимо реализовать базу знаний книг (не обязательно книг).
 * Пользователь вводит название книги, данные сохраняются в массив.
 * <p>
 * Будет небольшое меню действий:
 * 1. Добавить название книги.
 * 2. Удалить книгу по названию.
 * 3. Редактировать название книги.
 * 4. Показать все книги.
 * 5. Проверить книгу по названию, есть ли она в базе.
 * 6. Сортировка книг (по желанию).
 * 7. Выйти из программы.
 * <p>
 * Критерии приемки:
 * - Использовать только массивы, циклы, примитивные типы, условные операторы.
 * - Не использовать регулярные выражения и Stream API.
 * - Программа должна быть на английском.
 * - Программа должна быть понятной для человека, который видит ее впервые .
 * - Программа должна быть отказоустойчивой.
 */
class Library {
    public static String[] books = new String[10];

    public static void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of book: ");

        String name = scanner.nextLine();
        System.out.println("name = " + name);

        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                break;
            } else {
                System.out.println(books[i]);
            }
        }
    }

    public static void main(String[] args) {
        label:
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu: \n" +
                    "1. Add book \n" +
                    "2. Delete book \n" +
                    "3. Edit name of book \n" +
                    "4. Show all book \n" +
                    "5. Find book \n" +
                    "6. Sorting book \n" +
                    "7. Exit");

            int command = scanner.nextInt();

            switch (command) {
                case 1:
                    add();
                    break;


                case 2:
                    System.out.println("which book to delete? ");
                    String delete = scanner.nextLine();
                    Arrays.sort(books);
                    int index = -1;
                    for (int i = 0; i < books.length; i++) {
                        if (books[i].contains(delete)) {
                            index = i;
                            System.arraycopy(books, index + 1, books, index, books.length - index - 1);
                            books = Arrays.copyOf(books, books.length - 1);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Edit name of book");
                    String toReplaceTheBook = scanner.nextLine();
                    System.out.println("What to change? ");
                    String editBook = scanner.nextLine();
                    for (int i = 0; i < books.length; i++) {
                        if (books[i].contains(toReplaceTheBook)) {
                            books[i] = editBook;
                            editBook = toReplaceTheBook;
                            System.out.println(Arrays.toString(books));
                        }
                    }
                    break;

                case 4:
                    System.out.println("All Books: ");
                    for (String b : books) {
                        System.out.println(b);
                    }
                    break;

                case 5:
                    System.out.println("what book can I find?");
                    String findBook = scanner.nextLine();
                    String database = "This book is not in the database";
                    for (String str : books) {
                        if (str.contains(findBook)) {
                            database = "We found this book";
                            break;
                        }
                    }
                    System.out.println(database);
                    break;

                case 6:
                    System.out.println("Sort");
                    Arrays.sort(books);
                    break;

                case 7:
                    System.out.println("log out of the database");
                    return;
                default:
                    break label;
            }
        }
    }
}