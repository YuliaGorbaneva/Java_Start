package Lecture1;

// import java.util.Scanner;

// import java.text.Normalizer.Form;

/**
 * Lecture_1
 */
public class Lecture_1 {
    public static void main(String[] args) {
        // System.out.println("Hello!!! Hello");
        // String s = null;
        // System.out.println(s);
        // short age = 10; // челочисленное значение
        // int salary = 123456;

        // float e = 2.7f; // указание типа данныч float = f - обязательлно!
        // double pi = 3.1415;

        // char ch = '1';

        // boolean flag1 = 123 <= 234;
        // System.out.println(flag1);
        // boolean flag2 = 123 >= 234 || flag1;
        // System.out.println(flag2);
        // boolean flag3 = flag1 ^ flag2;
        // System.out.println(flag3);

        // var m = 123.545; // неявная типизация данных
        // System.out.println(getType(m));

        // int a = 5;
        // int b = 2;
        // a = a-- - a--;
        // System.out.println(a);
        // a = --a - --a;
        // System.out.println(a);
        // a = a-- - --a;
        // System.out.println(a);

        // a = a & 1;
        // System.out.println(a);
        // System.out.println(a | b);
        // System.out.println(a & b);
        // System.out.println(a ^ b);

        // Пполучение данных из терминала
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("name: ");
        // String name = iScanner.nextLine();
        // System.out.printf("Привет, %s!", name);
        // iScanner.close();

        // Scanner iiScanner = new Scanner(System.in);
        // System.out.printf("int a: ");
        // int x = iiScanner.nextInt();
        // System.out.printf("double a: ");
        // double y = iiScanner.nextDouble();
        // System.out.printf("%d + %f = %f", x, y, x + y);
        // iiScanner.close();

        // пРоверка на соответствие получаемых данных
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a: ");
        // boolean flag = iScanner.hasNextInt();
        // System.out.println(flag);
        // int i = iScanner.nextInt();
        // System.out.println(i);
        // iScanner.close();

        // Форматиррованный вывод

        // String s = "hdfh";
        // int a = 123;
        // String q = s + a; // конконтинация строкб неявное преобразование числа к
        // сторке и слодение строк
        // System.out.println(q);

        // Форматы вывода %d, %f и т.д
        int s = 1;
        int a = 2;
        int q = s + a;
        String res = String.format("%d + %d = %d \n", s, a, q); // создает шаблон по которому будет компоноваться строка
        System.out.printf("%d + %d = %d \n", s, a, q);
        System.out.println(res);

        // управляющие консьрукторы
        // if () {}
        // else {}
        // Тернарный оператор - int min = a < b ? a : b; - если условие верное вернется
        // та часть что до двоеточья, если не верно - вернется вторая часть после
        // запятой

        // Оператор выбора swithch

        int mounth = 2;
        String text = " ";
        switch (mounth) {
            case 1:
                text = "Autuumn";
                break;
            default:
                text = "mistake";
                break;
        }
        System.out.println(text);

        /**
         * Виды спецификаторов
         * %d: целочисленных значений
         * %x: для вывода шестнадцатеричных чисел
         * %f: для вывода чисел с плавающей точкой
         * %e: для вывода чисел в экспоненциальной форме,например, 3.1415e+01
         * %c: для вывода одиночного символа
         * %s: для вывода строковых значений
         */

        // int[] arr = new int[10];
        // System.out.println(arr.length);
        // arr = new int[] { 1, 2, 3, 4, 5, 6 };
        // System.out.println(arr.length);
        // System.out.println(arr[3]);
        // arr[3] = 13;
        // System.out.println(arr);

        // int[] aarr[] = new int[3][5];
        // for (int[] line : aarr) {
        // for (int item : line) {
        // System.out.printf("%d ", item);
        // }
        // System.out.println();
        // }

        // int[][] arrr = new int[5][3];
        // for (int i = 0; i < arrr[i].length; i++) {
        // for (int j = 0; j < arrr[i].length; j++) {
        // System.out.printf("%d ", arrr[i][j]);
        // }
        // System.out.println();
        // }
        // }

        // static String getType(Object o) {
        // return o.getClass().getSimpleName();
        lib.sayHi();

    }

}