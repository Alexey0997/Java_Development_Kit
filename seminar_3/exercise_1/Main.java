package ru.geekbrains.seminar_3.exercise_1;

public class Main {
    public static void main(String[] args){
        System.out.println(Calculator.sum(10, 9.5));          // Операция сложения.

        System.out.println(Calculator.subtract(7, 2.01));     // Операция вычитания.

        System.out.println(Calculator.multiply(10, 0.1));     // Операция умножения.

        System.out.println(Calculator.divide(12.1, 2));       // Операция деления.
        System.out.println(Calculator.divide(2, 0));          // Попытка деления на 0.
    }
}
