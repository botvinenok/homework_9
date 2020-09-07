package com.hillel.company;

import java.util.*;
import java.util.stream.Collectors;

public class Collections<T> {

    public  enum DayEnum{MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

    public void MapVehicle(){
        Map<String,Integer> vehicles = new HashMap<String, Integer>();
        vehicles.put("BMV", 5);
        vehicles.put("KIA", 10);
        for (Map.Entry<String, Integer> entry : vehicles.entrySet()) {
            System.out.println("Value = " + entry.getValue() + " | Key = " + entry.getKey());
        }
    }

    public int[] RandArray(int size, int beginBound, int endBound){
        return new Random().ints(size,beginBound,endBound).toArray();
    }

    public  int CountEvens(int arr []){
        int countEvens = 0;
        for (int numbver : arr){
            if (numbver % 2 == 0){
                ++countEvens;
            }
        }
        return countEvens;
    }

    public void DisplayArrOfString(T ... names){
        List <T> arrayNames = new ArrayList<T>();
        for (T name : names) {
            arrayNames.add(name);
        }
        for (T smthName : arrayNames) {
            System.out.print(smthName + " | ");
        }
    }


    public void DisplayLongestString(List<String> arrString ){

        List <String> sorted = arrString.stream()
                .filter(s -> s.length() == arrString
                        .stream().max(Comparator.comparingInt(String::length))
                        .orElse(null).length())
                .collect(Collectors.toList());

        System.out.println("\nThe longest word(s) in array is(are): " + Arrays.toString(sorted.toArray()));
    }

    public void DisplayMap(String [][] array){
        Map<String, String> fruits = new HashMap<>();
        for (String[] fruit : array){ fruits.put(fruit[0], fruit[1]); }

        fruits.forEach((key, value) -> System.out.println(key + " - " + value + ","));
    }

    public void DisplayVegetables(String [][] array){
        Map<String, String> fruits = new HashMap<>();
        for (String[] fruit : array){ fruits.put(fruit[0], fruit[1]); }

        Set<String> sorted =  fruits.entrySet().stream()
                .filter(e -> e.getValue().trim().toLowerCase().equals("vegetable"))
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        sorted.forEach(value -> System.out.println("Vegetable - " + value + ","));
    }

    public void CheckIsEnumToday(int numberOfDay){
        switch (numberOfDay){
            case (1):
                System.out.println("Today is " + DayEnum.SUNDAY);
                break;
            case (2):
                System.out.println("Today is " + DayEnum.MONDAY);
                break;
            case (3):
                System.out.println("Today is " + DayEnum.TUESDAY);
                break;
            case (4):
                System.out.println("Today is " + DayEnum.WEDNESDAY);
                break;
            case (5):
                System.out.println("Today is " + DayEnum.THURSDAY);
                break;
            case (6):
                System.out.println("Today is " + DayEnum.FRIDAY);
                break;
            case (7):
                System.out.println("Today is " + DayEnum.SATURDAY);
                break;
            default:
                System.out.println("Today is not your day!!" );
                break;

        }
    }


}
