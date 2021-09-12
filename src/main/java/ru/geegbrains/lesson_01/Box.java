package ru.geegbrains.lesson_01;

import java.util.ArrayList;
import java.util.Arrays;

public class Box <T extends Fruit> {
    private ArrayList<T> list;

    public Box(T...arr){
        list = new ArrayList<T>(Arrays.asList(arr));
    }

    public float getWeight(){
        if (list.size() == 0) return 0.0f;
        return list.get(0).getWeight() * list.size();
    }

    public void addFruit(T fruit){
        list.add(fruit);
    }

    public void addFruid(T... fruit){
        for (int i = 0; i < fruit.length; i++) {
            list.add(fruit[i]);
        }
    }
    // метод сравнения
    public boolean compare(Box another){
        return Math.abs(this.getWeight() - another.getWeight()) < 0.00001;
    }
    // метода пересыпания
    public void transference(Box<? super T> another){
        another.list.addAll(this.list);
        this.list.clear();
    }

}
