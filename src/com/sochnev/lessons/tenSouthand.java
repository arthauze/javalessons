package com.sochnev.lessons;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.
 *
 *
 * Требования:
 * 1. Программа не должна выводить текст на экран.
 * 2. Программа не должна считывать значения с клавиатуры.
 * 3. Класс Solution должен содержать только 5 методов.
 * 4. Метод insert10000(List list) должен вставлять 10 тысяч элементов в список.
 * 5. Метод get10000(List list) должен вызывать 10 тысяч раз get у списка.
 * 6. Метод set10000(List list) должен вызывать 10 тысяч раз set у списка.
 * 7. Метод remove10000(List list) должен удалять 10 тысяч элементов из списка.
 */


public class tenSouthand {
    public static void main(String[] args) throws Exception {

        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();

        System.out.println(getTimeMsOfInsert(arrayList));
        System.out.println(getTimeMsOfInsert(linkedList));

    }

    public static long getTimeMsOfInsert(List list) {
        Date zeroTime = new Date();

        long zerot = zeroTime.getTime();


        insert10000(list);
        get10000(list);


        Date timeend = new Date();
        long timefinish = timeend.getTime();

        long finish = timefinish - zerot;
        return finish;

        //напишите тут ваш код

    }
    public static void insert10000(List list) {
        for (int i = 0; i < 10000 ; i++) {
            list.add(i);

        }

    }

    public static void get10000(List list) {
        for (int i = 0; i < 10000 ; i++) {
            list.get(i);
        }

    }

    public static void set10000(List list) {

        for (int i = 0; i < 10000; i++) {
            list.set(0, "s");
        }

    }

    public static void remove10000(List list) {

        for (int i = 0; i < 10000 ; i++) {
           list.remove(i);
        }


    }

}
