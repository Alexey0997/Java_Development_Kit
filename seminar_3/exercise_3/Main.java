package ru.geekbrains.seminar_3.exercise_3;

public class Main {
    public static void main(String[] args){
        Pair<Integer, String> person1 = new Pair<>(1, "Алмазов Андрей");
        Pair<Integer, String> person2 = new Pair<>(2, "Белазов Борис");
        Pair<Integer, String> person3 = new Pair<>(3, "Вагонов Виктор");
        System.out.println("\nСПИСОК СТУДЕНТОВ:");
        System.out.println(person1 + "\n" + person2 + "\n" + person3);
    }
}
