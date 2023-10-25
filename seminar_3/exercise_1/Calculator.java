package ru.geekbrains.seminar_3.exercise_1;

/*
 * Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
 * sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа
 * (но необязательно разного между собой), над которыми должна быть произведена операция.
 */
public class Calculator {

    /**
     * Метод sum использует обобщенное программирование для суммирования двух чисел, являющихся подклассами Number.
     * Он работает путем преобразования обоих чисел в double и затем суммирования их.
     * @param num1 - первое число.
     * @param num2 - второе число.
     * @return - сумма двух чисел типа double.
     * @param <T> - тип параметра, ограниченный классом Number.
     */
    public static <T extends Number> double sum(T num1, T num2){
        return num1.doubleValue() + num2.doubleValue();
    }

    public static <T extends Number> double subtract(T num1, T num2){
        return num1.doubleValue() - num2.doubleValue();
    }
    public static <T extends Number> double multiply(T num1, T num2){
        return num1.doubleValue() * num2.doubleValue();
    }

    public static <T extends Number> double divide(T num1, T num2){
        if (num2.doubleValue() == 0){
            throw new ArithmeticException("Деление на ноль не допустимо!");
        }
        return num1.doubleValue() / num2.doubleValue();
    }
}
