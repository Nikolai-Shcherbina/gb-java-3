package ru.geegbrains.lesson_01;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Nikolai Shcherbina
 */

public class Main<T> {
    
    // метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа)
    void swapsTwoElements(T[] arr, int a, int b) {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private static <T> ArrayList<T> convertToList(T[] arr) {
        return new ArrayList<T>(Arrays.asList(arr));
    }

    // метод, который преобразует массив в ArrayList
    public static void main(String[] args) {
        String[] arrayStr = {"One", "Two", "Three", "Four", "Five"};

        Main<String> ob1 = new Main<>();
        ob1.swapsTwoElements(arrayStr, 0, 2);
        System.out.println(Arrays.toString(arrayStr));

        ArrayList<String> b = convertToList(arrayStr);
        b.add("Hello");
        System.out.println(b);
    }

}
