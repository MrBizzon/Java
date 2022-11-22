import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scan.nextInt();
        int multi = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " * ");
            multi *= i;
        }
		scan.close();
        System.out.print(" = " + multi);
    }
}