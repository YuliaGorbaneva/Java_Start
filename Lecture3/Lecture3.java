package Lecture3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Lecture3 {
    /*
     * Тип Object
     * 
     * Тип данных Object – «всему голова»
     * Упаковка – любой тип можно положить в переменную типа Object
     * Распаковка – преобразование Object-переменной в нужный тип
     * Иерархия типов – любой тип «ниже» Object’а
     */

    // Тип данных
    public static void main(String[] args) {
        // Object o = 1;
        // GetType(o);
        // o = 1.2;
        // GetType(o);

        // var i = 1.0;
        // var j = 2.5;
        // System.out.println(Sum(i, j));

        /*
         * Массивы
         */

        // int[] a = new int[] { 1, 9 };
        // int[] b = new int[3];
        // System.arraycopy(a, 0, b, 0, a.length);
        // for (int k : a) {
        // System.out.print(k);
        // }
        // System.out.println();
        // for (int w : b) {
        // System.out.print(w);
        // }

        // int[] a = new int[] { 0, 9 };
        // for (int i : a) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // a = AddItem(a, 2);
        // a = AddItem(a, 3);
        // for (int j : a) {
        // System.out.print(j + " ");
        // }

        /*
         * Коллекции
         * Иурархия коллекций
         * Collection -> Set -> List -> Queue --> MAP
         */
        /*
         * ArrayList - Удобный массив.
         * List - пронумерованный набор элементовю
         * Пользователь этого интерфейса имеет точный контроль над тем, где в списке
         * вставляется каждый элемент
         * Пользователь может обращаться к элементам по их целочисленному
         * индексу(позиции в списке) и искать элементы в списке
         * 
         * Обращения ArrayList, LinkedList (Vector, Stack - устаревшие)
         */

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2809);
        for (Object o : list) {
            System.out.println(o);
        }

        /*
         * Функционал коллекций
         * add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
         * get(pos) – возвращает элемент из списка по указанной позиции
         * indexOf(item) – первое вхождение или -1
         * lastIndexOf(item) – последнее вхождение или -1
         * remove(pos) – удаление элемента на указанной позиции и его возвращение
         * set(int pos, T item) – gjvtoftn значение item элементу, который находится
         * на позиции pos
         * void sort(Comparator) – сортирует набор данных по правилу
         * subList(int start, int end) – получение набора данных от позиции start до end
         */

        int day = 29;
        int month = 9;
        int year = 1990;
        Integer[] date = { day, month, year };
        List<Integer> d = Arrays.asList(date);
        System.out.println(d);

        StringBuilder dayy = new StringBuilder("28");
        StringBuilder monthh = new StringBuilder("10");
        StringBuilder yearr = new StringBuilder("1991");
        StringBuilder[] datee = new StringBuilder[] { dayy, monthh, yearr };
        List<StringBuilder> dd = Arrays.asList(datee);
        System.out.println(dd);
        datee[1] = new StringBuilder("09");
        System.out.println(dd);

        /*
         * Функционал коллекций строчного типа данных
         * clear() – очистка списка
         * toString() – «конвертация» списка в строку
         * Arrays.asList – преобразует массив в список
         * containsAll(col) – проверяет включение всех элементов из col
         * removeAll(col) – удаляет элементы, имеющиеся в col
         * retainAll(col) – оставляет элементы, имеющиеся в col
         * toArray() – конвертация списка в массив Object’ов
         * toArray(type array) – конвертация списка в массив type
         * List.copyOf(col) – возвращает копию списка на основе имеющегося
         * List.of(item1, item2,...) – возвращает неизменяемый список
         */

        /*
         * Итерация
         */

        List<Integer> list11 = List.of(1, 12, 123, 1234, 12345);
        for (int item : list11) {
            System.out.println(item);
        }
        Iterator<Integer> col = list11.iterator();
        System.out.println();
        while (col.hasNext()) {
            System.out.println(col.next());
            // col.next();
            // col.remove();
        }

        /*
         * Получение итератора с целью более гибкой работы с данными URL
         * Интерфейс Iterator<E>. Итератор коллекцией. Iterator занимает место
         * Enumeration в Java Collections Framework. Итераторы отличаются от
         * перечислений двумя способами:
         * Итераторы позволяют вызывающей стороне удалять элементы из
         * базовой коллекции во время итерации с четко определенной
         * семантикой.
         * hasNext(), next(), remove()
         * ListIterator<E> URL
         * hasPrevious(), E previous(), nextIndex(), previousIndex(), set(E e), add(E e)
         */

    }

    /*
     * Добавление элементов в массив
     */

    public static int[] AddItem(int[] array, int item) {
        int length = array.length;
        int[] temp = new int[length + 1];
        System.arraycopy(array, 0, temp, 0, length);
        temp[length] = item;
        return temp;
    }

    private static Object Sum(Object i, Object j) {
        if (i instanceof Double && j instanceof Double) {
            return (Object) ((Double) i + (Double) j);
        } else if (i instanceof Integer && j instanceof Integer) {
            return (Object) ((Integer) i + (Integer) j);
        } else
            return 0;
    }

    private static void GetType(Object obj) {
        System.out.println(obj.getClass().getName());
    }
}
