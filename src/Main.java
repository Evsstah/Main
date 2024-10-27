// Нечетный вариант

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите задание:");
            System.out.println("1. Задание 1");
            System.out.println("2. Задание 2");
            System.out.println("3. Задание 3");
            System.out.println("4. Задание 4");
            System.out.println("0. Выход");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    task1(scanner);
                    break;
                case 2:
                    task2(scanner);
                    break;
                case 3:
                    task3(scanner);
                    break;
                case 4:
                    task4(scanner);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
            }
        }
    }

    private static void task1(Scanner scanner) {
        Main n = new Main();
        // 1 Задание
        System.out.println("Решение 1 задания:\n");

        // Решение первой задачи
        System.out.println("1 задача:");
        System.out.println("Получение дробной части числа.");
        System.out.println("Введите дробное число:");
        double x = scanner.nextInt();
        System.out.printf("Ответ: " + "%.2f%n", n.fraction(x));

        // Решения третьей задачи


        // Решение пятой задачи
        System.out.println("\n5 задача:");
        System.out.println("Проверка: двузначное число или нет?");
        System.out.print("Введите число для проверки: ");
        int x1 = scanner.nextInt();
        System.out.println("Ответ: " + n.is2Digits(x1));

        // Решение седьмой задачи
        System.out.println("\n7 задача:");
        System.out.println("Проверка входа числа в диапазон. ");
        System.out.println("Введите левую границу диапазона:");
        int a = scanner.nextInt();
        System.out.println("Введите правую границу диапазона:");
        int b = scanner.nextInt();
        System.out.print("Введите число для проверки в этом диапазоне: ");
        int num = scanner.nextInt();
        System.out.println("Ответ: " + n.isInRange(a, b, num));


        // Решения девятой задачи
        System.out.println("\n9 задача:");
        System.out.println("Проверка равенства трех чисел.");
        System.out.println("Введите первое число:");
        int a1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b1 = scanner.nextInt();
        System.out.println("Введите третье число:");
        int c = scanner.nextInt();
        System.out.println("Ответ: " + n.isEqual(a1, b1, c));
    }

    private static void task2(Scanner scanner) {
        Main n = new Main();
        // 2 Задание
        System.out.println("\nРешение 2 задания:");

        // Решение первой задачи
        System.out.println("\n1 задача:");
        System.out.println("Получение модуля числа.");
        System.out.print("Введите число: ");
        int x = scanner.nextInt();
        System.out.println("Ответ: " + n.abs(x));

        // Решение третьей задачи
        System.out.println("\n3 задача:");
        System.out.println("Проверка: делится ли число на 3 или на 5?");
        System.out.print("Введите число для проверки: ");
        int x1 = scanner.nextInt();
        System.out.println("Ответ: " + n.is35(x1));

        // Решение пятой задачи
        System.out.println("\n5 задача:");
        System.out.println("Получение максимального числа из трех.");
        System.out.println("Введите первое число:");
        int x2 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int y = scanner.nextInt();
        System.out.println("Введите третье число:");
        int z = scanner.nextInt();
        System.out.println("Ответ: " + n.max3(x2, y, z));

        // Решение седьмой задачи
        System.out.println("\n7 задача:");
        System.out.println("Получение суммы двух чисел(если сумма в диапазоне 10-19, то выводится число 20).");
        System.out.print("Введите два числа для суммирования: ");
        int x3 = scanner.nextInt(), y1 = scanner.nextInt();
        System.out.println("Ответ: " + n.sum2(x3, y1));

        // Решение девятой задачи
        System.out.println("\n9 задача:");
        System.out.println("Получение дня недели по соответствующему числу.");
        System.out.print("Введите число: ");
        int x4 = scanner.nextInt();
        System.out.println("Ответ: " + n.day(x4));
    }

    private static void task3(Scanner scanner) {
        Main n = new Main();
        // 3 Задание
        System.out.println("\nРешение 3 задания:");

        // Решение первой задачи
        System.out.println("\n1 задача:");
        System.out.println("Получение строки чисел от 0 до x.");
        System.out.print("Введите число x: ");
        int x = scanner.nextInt();
        System.out.println("Ответ: " + n.listNums(x));

        // Решение третьей задачи
        System.out.println("\n3 задача:");
        System.out.println("Получение строки четных чисел от 0 до x.");
        System.out.print("Введите число x: ");
        int x1 = scanner.nextInt();
        System.out.println("Ответ: " + n.chet(x1));

        // Решение пятой задачи
        System.out.println("\n5 задача:");
        System.out.println("Получение количества знаков в числе x.");
        System.out.print("Введите число x: ");
        long x2 = scanner.nextInt();
        System.out.println("Ответ: " + n.numLen(x2));

        // Решение седьмой задачи
        System.out.println("\n7 задача:");
        System.out.println("Получение квадрата размерностью x*x.");
        System.out.print("Введите число x: ");
        int x3 = scanner.nextInt();
        n.square(x3);

        // Решение девятой задачи
        System.out.println("\n9 задача:");
        System.out.println("Получение треугольника из символов *.");
        System.out.print("Введите число x: ");
        int x4 = scanner.nextInt();
        n.rightTriangle(x4);
    }

    private static void task4(Scanner scanner) {
        Main n = new Main();
        // 4 Задание
        System.out.println("\nРешение 4 задания:\n");

        // Решение первой задачи
        System.out.println("\n1 задача:");
        System.out.println("Получение индекса первого вхождения числа в массив(если числа нет, то -1).");
        int[] arr_0 = {1, 2, 3, 4, 2, 2, 5};
        System.out.println("Массив:" + Arrays.toString(arr_0) + "\nОтвет: " + n.findFirst(arr_0, 2));

        // Решение третьей задачи
        System.out.println("\n3 задача:");
        System.out.println("Получение наибольшего числа из массива по модулю.");
        int[] arr_1 = {1, -2, -7, 4, 2, 2, 5};
        System.out.println("Массив:" + Arrays.toString(arr_1) + "\nОтвет: " + n.maxAbs(arr_1, -7));

        // Решение пятой задачи
        System.out.println("\n5 задача:");
        System.out.println("Получение нового массива со значениями двух данных массивов.");
        int[] arr_2 = {1, 2, 3, 4, 5};
        int[] ins = {7, 8, 9};
        int pos = 3;
        System.out.println("Массив 1:" + Arrays.toString(arr_2) + "\nМассив 2: " + Arrays.toString(ins) + "\nПозиция: " + pos + "\nОтвет: " + Arrays.toString(n.add(arr_2, ins, pos)));

        // Решение седьмой задачи
        System.out.println("\n7 задача:");
        System.out.println("Получение массива со значениями в обратном порядке.");
        int[] arr_3 = {1, 2, 3, 4, 5};
        System.out.println("Массив:" + Arrays.toString(arr_3) + "\nОтвет: " + Arrays.toString(n.reverseBack(arr_3)));

        // Решение девятой задачи
        System.out.println("\n9 задача:");
        int k = 2;
        System.out.println("Получение массива с индексами вхождений числа " + k + " в массив.");
        int[] arr_4 = {1, 2, 3, 8, 2, 2, 9};
        System.out.println("Массив:" + Arrays.toString(arr_4) + "\nОтвет: " + Arrays.toString(n.findAll(arr_4, k)));
    }


    // Методы для 1 Задания
    // 1.1
    // Метод для вычисления дробной части
    public double fraction(double x) {
        int integerX = (int)x;
        return x - integerX; // Вычисление дробной части путем вычитания целой части из дробного числа
    }

    // 1.3
    // Метод для преобразования символа в число


    // 1.5
    // Метод для проверки, является ли число двузначным
    public boolean is2Digits(int x1) {
        if ((x1 > 99 || x1 < 10) && (x1 < -99 || x1 > -10)) {
            return false;
        }
        return true;
    }

    // 1.7
    // Метод для проверки, находится ли число в указанном диапазоне
    public boolean isInRange(int a, int b, int num) {
        if (a < b && num >= a && num <= b) {
            return true;
        }else if(a > b && num <= a && num >= b){
            return true;
        }
        return false;
    }

    // 1.9
    // Метод для проверки равенства трех чисел
    public boolean isEqual(int a1, int b1, int c) {
        if (a1 == b1 && b1 == c) {
            return true;
        }
        return false;
    }

    // Методы для 2 Задания
    // 2.1
    // Метод для вычисления модуля числа
    public int abs(int x) {
        if (x >= 0){
            return x;
        }
        return x * -1;
    }

    // 2.3
    // Метод для проверки на деление на 3 или 5
    public boolean is35(int x1) {
        if (x1 % 3 == 0 && x1 % 5 != 0 || x1 % 3 != 0 && x1 % 5 == 0) {
            return true;
        }
        return false;
    }

    // 2.5
    // Метод для нахождения максимального числа
    public int max3(int x2, int y, int z) {
        if (x2 >= y && x2 >= z) {
            return x2;
        }else if (y >= x2 && y >= z) {
            return y;
        } else {
            return z;
        }
    }

    // 2.7
    // Метод для суммирования чисел с условием
    public int sum2(int x3, int y1) {
        int sum = x3 + y1;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }else{
            return sum;
        }
    }

    // 2.9
    // Метод для определения дня недели
    public String day(int x4) {
        switch (x4) {
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
            default:
                return "это не день недели";
        }
    }

    // Методы для 3 Задания
    // 3.1
    // Метод для получения строки чисел от 0 до x
    public String listNums(int x) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i <= x; i++) {
            if (i > 0) {
                str.append(" ");
            }
            str.append(i);
        }
        return str.toString();
    }

    // 3.3
    // Метод для получения строки четных чисел от 0 до x
    public String chet(int x1) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i <= x1; i += 2) {
            if (i > 0) {
                str.append(" ");
            }
            str.append(i);
        }
        return str.toString();
    }

    // 3.5
    // Метод для получения количества знаков в числе x
    public int numLen(long x2) {
        int count = 0;
        while (x2 != 0) {
            x2 = x2 / 10;
            count++;
        }
        return count;
    }

    // 3.7
    // Метод для получения квадрата размерностью x*x
    public void square(int x3){
        for (int i = 0; i < x3; i++) {
            for (int j = 0; j < x3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 3.9
    // Метод для получения треугольника из символов *
    public void rightTriangle(int x4) {
        for (int i = 1; i <= x4; i++) {
            // Вывод пробелов
            for (int j = 0; j < x4 - i; j++) {
                System.out.print("  ");
            }
            // Вывод звездочек
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Методы для 4 Задания
    // 4.1
    // Метод для получения индекса первого вхождения числа в массив
    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // 4.3
    // Метод для получения наибольшего числа из массива по модулю
    public int maxAbs(int[] arr, int x) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = arr[i] * -1;
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // 4.5
    // Метод для получения нового массива со значениями двух данных массивов
    public int[] add(int[] arr, int[] ins, int pos) {
        int[] new_arr = new int[arr.length + ins.length];
        for (int i = 0; i < arr.length; i++) {
            new_arr[i] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            new_arr[pos + i] = ins[i];
        }
        return new_arr;
    }

    // 4.7
    // Метод для получения массива со значениями в обратном порядке
    public int[] reverseBack(int[] arr) {
        int[] new_arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            new_arr[i] = arr[(arr.length - 1) - i];
        }
        return new_arr;
    }

    // 4.9
    // Метод для получения массива с индексами вхождений числа в массив
    public int[] findAll(int[] arr, int k) {
        int count = 0;
        int[] new_arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                new_arr[count++] = i;
            }
        }
        return new_arr;
    }
}
