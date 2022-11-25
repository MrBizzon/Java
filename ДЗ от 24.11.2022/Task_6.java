// Реализуйте алгоритм сортировки пузырьком числового массива, результат запишите в лог-файл.

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task_6 {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleMethod(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);
            }
        }

        if (n - 1 > 1) {
            bubbleMethod(arr, n - 1);
        }
    }

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Введите размер массива: ");
            int size = input.nextInt();
            int arr[] = new int[size];
            System.out.println("Введите построчно числа: ");
            for (int i = 0; i < size; i++) {
                arr[i] = input.nextInt();
            }

            System.out.println();
            System.out.println("=============Вывод в консоль=============");
            System.out.println(Arrays.toString(arr));
            System.out.println();
            System.out.println("======Логируем в файл log.txt======");
            Path path = Paths.get("log.txt");
            try {
                String str = Arrays.toString(arr);
                byte[] bs = str.getBytes();
                Path writtenFilePath = Files.write(path, bs);
                System.out.println("Содержимое записанно в файл:\n" + new String(Files.readAllBytes(writtenFilePath)));
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println();
            }
        }
    }
}
