package com.hillel.company;



import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public enum Levelss  { FIRST, EIGHTY, THOUSANDS }

    public static void main(String[] args) {

        Collections col = new Collections();
        String[] words = {"1234567", "12345678", "12345678","123456", "123456789asfaf", "asfsfdsfdsfsfsdfdsfsf", "asfsfdsfdsfsfsdfdsfsf", "asfsfdsfdsfsfsdfdsfsf"};

        String [][] fruits = {{"banana", "fruit"}, {"banana", "fruit"}, {"pineapple", "fruit"},{"melon", "vegetable"},
                 {"cranberry", "berry"}, {"apple", "fruit"}, {"iris", "flower"}, {"potato", "vegetable"}, {"carrot", "vegetable"}};

        //region Task1
        List <Integer> list1 = new ArrayList();
        for (int i = 0; i < 10; i++){ list1.add(i); }
        System.out.println(Arrays.toString(list1.toArray()));
        //endregion

        //region Task2
        Levelss in = Levelss.EIGHTY;
        System.out.println(in);
        //endregion

        //region Task3
        col.MapVehicle();
        //endregion

        //region Task4
        int [] arr = col.RandArray(15, 0, 10);
        System.out.println("We found " + col.CountEvens(arr)
                + " even elements in \narray = " + Arrays.toString(arr));
        //endregion

        //region Task5
        col.DisplayArrOfString("Gena", "Genya", "Vasya", "Serg" );
        //endregion

        //region Task6
        System.out.println();
        List<String> names = Arrays.asList(words);
        col.DisplayLongestString(names);
        //endregion

        //region Task7
        System.out.println();
        col.DisplayMap(fruits);
        //endregion

        //region Task8
        System.out.println();
        col.DisplayVegetables(fruits);
        //endregion

        //region Task9
        System.out.println();
        List<Integer> arrSecond = Arrays.stream(col.RandArray(100, 0, 10))
                .boxed().collect(Collectors.toList());
        HashSet <Integer> unique = new HashSet<Integer>();
        unique.addAll(arrSecond);
        //endregion

        //region Task10
        System.out.println();
        col.CheckIsEnumToday(2);
        //endregion

    }
}
