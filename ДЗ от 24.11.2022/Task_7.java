// К калькулятору из предыдущего дз добавить логирование

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class Task_7 {
    private static Logger Logger = java.util.logging.Logger.getLogger(Task_7.class.getName());

    public static void main(String[] args) {

        double firstNumber, secondNumber, resultOperation;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        firstNumber = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        secondNumber = scanner.nextDouble();

        System.out.print("Введите знак операции (+, -, /, *, ^, %): ");

        char operationSign = scanner.next().charAt(0);
        scanner.close();

        switch (operationSign) {
            case '+':
                resultOperation = firstNumber + secondNumber;
                break;

            case '-':
                resultOperation = firstNumber - secondNumber;
                break;

            case '*':
                resultOperation = firstNumber * secondNumber;
                break;

            case '/':
                try {
                    resultOperation = firstNumber / secondNumber;
                } catch (Exception e) {
                    System.out.println("На ноль делить нельзя");
                }

            case '%':
                resultOperation = firstNumber % secondNumber;
                break;

            case '^':
                resultOperation = Math.pow(firstNumber, secondNumber);
                break;

            case 'Q':
                System.exit(0);

            default:
                System.out.printf("Вы ввели неверный знак операции");
                return;

        }
        System.out.println();

        Logger.log(Level.INFO, firstNumber + " " + operationSign + " " + secondNumber + " = " + resultOperation);

    }
}
