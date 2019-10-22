package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер задания(1, 2 или 3): ");
        byte option = in.nextByte();
        switch (option) {
            case 1:
                Task1 one = new Task1();
                one.setStr("123 9 01 56789 2");
                System.out.println("Ваш массив: ");
                one.getStr();
                System.out.println("\nВведите номер подзадания:\n" +
                        "1 - Определение максимальной разрядности чисел последовательности\n" +
                        "2 - Найти числа, в шестнадцатеричном коде которых присутствуют буквы, и сформировать из них массив, отобразить сформированный массив\n" +
                        "3 - Первую цифру каждого числа заменить последней, а последнюю первой\n" +
                        "4 - Сформировать массив, значениями которого являются индексы чисел последовательности, равных последнему числу");
                byte option1 = in.nextByte();
                switch (option1) {
                    case 1:
                        one.maximumCapacity();
                        break;
                    case 2:
                        one.massivSlov();
                        break;
                    case 3:
                        String[] test = one.changeSymbols();
                        for (String num : test) { System.out.print(num + " "); }
                        break;
                    case 4:
                        char [] te_st = one.index_array();
                        for (char num : te_st) { System.out.print(num + " "); }
                        break;
                    default:
                        System.out.println("Введен несуществующий номер!");
                }
                break;
            case 2:
                Task2 two = new Task2("2 118");
                System.out.println("Ваш массив: ");
                two.getStr();
                System.out.println("\nВведите номер подзадания:\n" +
                        "1 - Замена чисел, имеющих в своем 16-ричном представлении буквы, на их 16-ричный код\n" +
                        "2 - Добваить сумму всех чисел в конец последовательности\n" +
                        "3 - Поменять местами первую и последнюю цифру во всех числах\n");
                byte option2 = in.nextByte();
                switch (option2) {
                    case 1:
                        two.swap16();
                        break;
                    case 2:
                        two.add_sum();
                        break;
                    case 3:
                        two.change_digits();
                        break;
                    default:
                        System.out.println("Введен несуществующий номер!");
                }
                break;
            case 3:
                Task3 three = new Task3();
                System.out.println("\nВведите номер подзадания:\n" +
                        "1 - Проверить то, что введенная строка является доменом второго уровня.\n" +
                        "2 - Заменить в тексте все доменные имена России: заменив ru на рус. \n");
                byte option3 = in.nextByte();
                switch (option3) {
                    case 1:
                        three.method_one();
                        break;
                    case 2:
                        three.method_two();
                        break;
                    default:
                        System.out.println("Введен несуществующий номер!");
                }
                break;
            default:
                System.out.println("Введен несуществующий номер!");
        }
    }
}
