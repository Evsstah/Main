// Нечетный вариант

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main n = new Main();
        // 1 Задание
        System.out.println("Решение 1 задания:\n");

        // Решение первой задачи
        System.out.println("1 задача:");
        double x = 5.25;
        System.out.println("Получение дробной части числа " + x + ".");
        System.out.printf("Ответ: " + "%.2f%n", n.fraction(x)); // Оставляем только 2 знака после запятой

        // Решения третьей задачи
        System.out.println("\n3 задача:");
        System.out.println("Получение числа из символа.");
        System.out.println("Ответ: " + n.charToNum());

        // Решение пятой задачи
        System.out.println("\n5 задача:");
        System.out.println("Проверка: двузначное число или нет?");
        System.out.println("Ответ: " + n.is2Digits());

        // Решение седьмой задачи
        System.out.println("\n7 задача:");
        System.out.println("Проверка входа числа в диапазон. ");
        System.out.println("Ответ: " + n.isInRange());


        // Решения девятой задачи
        System.out.println("\n9 задача:");
        System.out.println("Проверка равенства трех чисел.");
        System.out.println("Ответ: " + n.isEqual());

        // 2 Задание
        System.out.println("\nРешение 2 задания:");

        // Решение первой задачи
        System.out.println("\n1 задача:");
        System.out.println("Получение модуля числа.");
        System.out.println("Ответ: " + n.abs());

        // Решение третьей задачи
        System.out.println("\n3 задача:");
        System.out.println("Проверка: делится ли число на 3 или на 5?");
        System.out.println("Ответ: " + n.is35());

        // Решение пятой задачи
        System.out.println("\n5 задача:");
        System.out.println("Получение максимального числа из трех.");
        System.out.println("Ответ: " + n.max3());

        // Решение седьмой задачи
        System.out.println("\n7 задача:");
        System.out.println("Получение суммы двух чисел(если сумма в диапазоне 10-19, то выводится число 20).");
        System.out.println("Ответ: " + n.sum2());

        // Решение девятой задачи
        System.out.println("\n9 задача:");
        System.out.println("Получение дня недели по соответствующему числу.");
        int s = 9;
        System.out.println("Число: " + s);
        System.out.println("Ответ: " + n.day(s));

        // 3 Задание
        System.out.println("\nРешение 3 задания:");

        // Решение первой задачи
        System.out.println("\n1 задача:");
        System.out.println("Получение строки чисел от 0 до x.");
        System.out.println("Ответ: " + n.listNums());

        // Решение третьей задачи
        System.out.println("\n3 задача:");
        System.out.println("Получение строки четных чисел от 0 до x.");
        System.out.println("Ответ: " + n.chet());

        // Решение пятой задачи
        System.out.println("\n5 задача:");
        System.out.println("Получение количества знаков в числе x.");
        System.out.println("Ответ: " + n.numLen());

        // Решение седьмой задачи
        System.out.println("\n7 задача:");
        System.out.println("Получение квадрата размерностью x*x.");
        n.square();

        // Решение девятой задачи
        System.out.println("\n9 задача:");
        System.out.println("Получение треугольника из символов *.");
        n.rightTriangle();

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
    // Метод для вычисления дробной части
    public double fraction(double x) {
        int integerX = (int)x;
        return x - integerX; // Вычисление дробной части путем вычитания целой части из дробного числа
    }

    // Метод для преобразования символа в число
    public int charToNum(){
        return 0;
    }

    // Метод для проверки, является ли число двузначным
    public boolean is2Digits() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число для проверки: ");
        int x = scan.nextInt();
        if ((x > 99 || x < 10) && (x < -99 || x > -10)) {
            return false;
        }
        return true;
    }

    // Метод для проверки, находится ли число в указанном диапазоне
    public boolean isInRange() {
        Scanner scan = new Scanner(System.in);
        int a = 2, b = 15;
        System.out.println("Левая граница диапазона: " + a);
        System.out.println("Правая граница диапазона: " + b);
        System.out.print("Введите число для проверки в этом диапазоне: ");
        int num = scan.nextInt();
        if (a < b && num >= a && num <= b) {
            return true;
        }else if(a > b && num <= a && num >= b){
            return true;
        }
        return false;
    }

    // Метод для проверки равенства трех чисел
    public boolean isEqual() {
        Scanner scan = new Scanner(System.in);
        int a = 3, b = 3, c = 3;
        System.out.println("Первое число: " + a);
        System.out.println("Второе число: " + b);
        System.out.println("Третье число: " + c);
        if (a == b && b == c) {
            return true;
        }
        return false;
    }

    // Методы для 2 Задания
    // Метод для вычисления модуля числа
    public int abs() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = scan.nextInt();
        if (x >= 0){
            return x;
        }
        return x * -1;
    }

    // Метод для проверки на деление на 3 или 5
    public boolean is35() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число для проверки: ");
        int x = scan.nextInt();
        if (x % 3 == 0 && x % 5 != 0 || x % 3 != 0 && x % 5 == 0) {
            return true;
        }
        return false;
    }

    // Метод для нахождения максимального числа
    public int max3() {
        int x = 5, y = 7, z = 7;
        System.out.println("Числа: " + x + "," + y + "," + z );
        if (x >= y && x >= z) {
            return x;
        }else if (y >= x && y >= z) {
            return y;
        } else {
            return z;
        }
    }

    // Метод для суммирования чисел с условием
    public int sum2() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите два числа для суммирования: ");
        int x = scan.nextInt(), y = scan.nextInt();
        int sum = x + y;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }else{
            return sum;
        }
    }

    // Метод для определения дня недели
    public String day(int s) {
        switch (s) {
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
    // Метод для получения строки чисел от 0 до x
    public String listNums() {
        StringBuilder str = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число x: ");
        int x = scan.nextInt();
        for (int i = 0; i <= x; i++) {
            if (i > 0) {
                str.append(" ");
            }
            str.append(i);
        }
        return str.toString();
    }

    // Метод для получения строки четных чисел от 0 до x
    public String chet() {
        StringBuilder str = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число x: ");
        int x = scan.nextInt();
        for (int i = 0; i <= x; i += 2) {
            if (i > 0) {
                str.append(" ");
            }
            str.append(i);
        }
        return str.toString();
    }

    // Метод для получения количества знаков в числе x
    public int numLen() {
        StringBuilder str = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число x: ");
        long x = scan.nextInt();
        int count = 0;
        while (x != 0) {
            x = x / 10;
            count++;
        }
        return count;
    }

    // Метод для получения квадрата размерностью x*x
    public void square(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число x: ");
        int x = scan.nextInt();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // Метод для получения треугольника из символов *
    public void rightTriangle() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число x: ");
        int x = scan.nextInt();
        for (int i = 1; i <= x; i++) {
            // Вывод пробелов
            for (int j = 0; j < x - i; j++) {
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
    // Метод для получения индекса первого вхождения числа в массив
    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

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

    // Метод для получения массива со значениями в обратном порядке
    public int[] reverseBack(int[] arr) {
        int[] new_arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            new_arr[i] = arr[(arr.length - 1) - i];
        }
        return new_arr;
    }

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
