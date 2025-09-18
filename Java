import java.util.Scanner;              // Подключаем класс Scanner для ввода

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Создаём объект Scanner
        System.out.print("Введите размер массива: "); // Просим ввести размер
        int n = sc.nextInt();                 // Читаем размер массива

        int[] arr = new int[n];              // Создаём массив длины n
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {        // Цикл ввода элементов
            arr[i] = sc.nextInt();           // Читаем очередной элемент
        }

        int count = 0;                       // Счётчик отрицательных чисел
        for (int x : arr) {                  // Перебираем элементы массива
            if (x < 0) count++;              // Если число отрицательное, увеличиваем счётчик
        }

        System.out.println("Количество отрицательных чисел: " + count); // Вывод результата
    }
}


import java.util.ArrayList;            // Подключаем ArrayList
import java.util.List;                 // Подключаем интерфейс List

public class Task2 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(); // Создаём список чисел
        nums.add(10);                           // Добавляем элементы
        nums.add(20);
        nums.add(-5);
        nums.add(15);

        int sum = 0;                            // Переменная для суммы
        for (int x : nums) {                    // Перебираем элементы списка
            sum += x;                           // Прибавляем каждый элемент
        }

        System.out.println("Сумма элементов списка: " + sum); // Вывод суммы
    }
}


