package com.javarush.task.task08.task0824;

import java.util.*;

/*
Собираем семейство
*/

public class Solution4 {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> family = new ArrayList<Human>();
        family.add(new Human("Grandfather1", true, 65, new ArrayList<>()));
        family.add(new Human("Grandfather2", true, 63, new ArrayList<>()));
        family.add(new Human("Grandmother1", false, 62, new ArrayList<>()));
        family.add(new Human("Grandmother2", false, 60, new ArrayList<>()));
        family.add(new Human("mother", false, 35, new ArrayList<>()));
        family.add(new Human("father", true, 40, new ArrayList<>()));
        family.add(new Human("son", true, 15, new ArrayList<>()));
        family.add(new Human("daughter1", false, 10, new ArrayList<>()));
        family.add(new Human("daughter2", false, 5, new ArrayList<>()));
        family.get(0).children.add(family.get(4));
        family.get(2).children.add(family.get(4));
        family.get(1).children.add(family.get(5));
        family.get(3).children.add(family.get(5));
        family.get(4).children.add(family.get(6));
        family.get(4).children.add(family.get(7));
        family.get(4).children.add(family.get(8));
        family.get(5).children = family.get(4).children;
        for (Human human : family) {
            System.out.println(human);
        }

    }

    public static class Human {
        //напишите тут ваш код
        private String name;
        private boolean gender;
        private int age;
        private ArrayList<Human> children;

        public Human(String name, boolean gender, int age, ArrayList<Human> children) {
            this.name = name;
            this.gender = gender;
            this.age = age;
//            this.children = children;
            this.children = new ArrayList<>();
        }



        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.gender ? "мужской" : "женский");
            text += ", возраст: " + this.age;
//
            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
