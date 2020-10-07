package Homework_2.Task_1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator app = new Calculator();
        app.startCalculator();
    }

    public void startCalculator() {
        // здесь идет реализация операций калькулятора
        Scanner input = new Scanner(System.in);
        int i; // общая переменная
        double a, b, result; // переменные при работе с сложением/вычитанием/умножением
        int base, power, resultPower; // переменные при работе со степенью
        int n, resultFactorial; // переменные при работе с факториалом
        int[] f; // переменная при работе с факториалом

        System.out.println("Введите тип операции:");
        String typeValue = input.nextLine(); // переменная типа операции и считывание
        switch (typeValue) {
            case "Сложение":     // Если выбран тип операции "Сложение"
                System.out.println("Введите первое число:");
                a = input.nextDouble();
                System.out.println("Введите второе число:");
                b = input.nextDouble();

                result = a + b;
                System.out.println("Результат = " + result);
                break;

            case "Вычитание":      // Если выбран тип операции "Вычитание"
                System.out.println("Введите первое число:");
                a = input.nextDouble();
                System.out.println("Введите второе число:");
                b = input.nextDouble();

                result = a - b;
                System.out.println("Результат = " + result);
                break;

            case "Умножение":      // Если выбран тип операции "Умножение"
                System.out.println("Введите первое число:");
                a = input.nextDouble();
                System.out.println("Введите второе число:");
                b = input.nextDouble();

                result = a * b;
                System.out.println("Результат = " + result);
                break;

            case "Степень":      // Если выбран тип операции "Степень"
                System.out.println("Введите основание:");
                base = input.nextInt();
                System.out.println("Введите значение степени:");
                power = input.nextInt();

                resultPower = 1;
                for (i = 1; i <= power; i++) {
                    resultPower *= base;
                }
                System.out.println("Результат = " + resultPower);
                break;

            case "Факториал":      // Если выбран тип операции "Факториал"
                System.out.println("Введите значение факториала:");
                n = input.nextInt();

                resultFactorial = 1;
                for (i = 1; i <= n; i++) {
                    resultFactorial *= i;
                }
                System.out.println("Результат = " + resultFactorial);
                break;

            case "Фибоначчи":      // Если выбран тип операции "Фибоначчи"
                System.out.println("Введите количество чисел Фибоначчи:");
                n = input.nextInt();

                f = new int[n]; // создание и заполнения массива n-чисел Фибоначчи
                f[0] = 0;
                f[1] = 1;
                for (i = 2; i < n; ++i) {
                    f[i] = f[i - 1] + f[i - 2];
                }
                for (i = 0; i < n; ++i) { // вывод первых n чисел Фибоначчи
                    System.out.println("Число Фибоначчи [" + i + "] = " + f[i]);
                }
                break;

            default:    // Если введен неверный тип операции
                System.out.println("Введен неверный тип операции!");
        }
    }
}
