package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        StringList stringList = new StringLisiIML();
        String[] list = {"a1", "a2","a3","a4","a5"};
        ((StringLisiIML) stringList).StringList(list);
        System.out.println("Начальный массив = ");
        System.out.println(((StringLisiIML) stringList).getArrList());
        System.out.println("Добавил " + stringList.add("a6"));
        System.out.println(((StringLisiIML) stringList).getArrList());
        int index = 4;
        System.out.println("Вставил элемент по индексу " + index + " = " + stringList.add(index, "a11"));
        System.out.println(((StringLisiIML) stringList).getArrList());
        System.out.println("Тут не понял, проделал тоже самое..." + index + " = " + stringList.set(index, "a11"));
        System.out.println(((StringLisiIML) stringList).getArrList());
        System.out.println("Нашел и удалил элемент = " + stringList.remove("a3"));
        System.out.println(((StringLisiIML) stringList).getArrList());
        int indexDel = 3;
        System.out.println("Нашел элемент по индексу =" + indexDel + " и удалил его. Удаленный элемент = " + stringList.remove(indexDel));
        System.out.println(((StringLisiIML) stringList).getArrList());
        String element = "a6";
        System.out.println("Индекс элемента " + element + " равен " + stringList.indexOf(element));
        System.out.println(((StringLisiIML) stringList).getArrList());
        System.out.println("Поиск этого же элемента с конца дал его индекс = " + stringList.lastIndexOf(element));
        System.out.println(((StringLisiIML) stringList).getArrList());
        int index2 = 2;
        System.out.println("По индексу = " +index2+ " лежит элемент " + stringList.get(index2));
        System.out.println(((StringLisiIML) stringList).getArrList());

        String[] arrList3 = {"a1", "a2", "a4", "a6"};
        System.out.println("Сравнение с " + Arrays.toString(arrList3) +" результат = "+ stringList.equals(arrList3));
        System.out.println("фактическое количество элементов = " + stringList.size());
        System.out.println(((StringLisiIML) stringList).getArrList());
        stringList.clear();
        System.out.println("Очистили : массив =" + ((StringLisiIML) stringList).getArrList());
    }
}