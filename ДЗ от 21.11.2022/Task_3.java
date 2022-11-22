import java.util.Scanner;

public class Task_3 {
	public static void main(String[] args) {

		double firstNumber, secondNumber;
		double resultOperation;
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите первое число: ");
		firstNumber = scan.nextDouble();

		System.out.print("Введите второе число: ");
		secondNumber = scan.nextDouble();

		System.out.print("Введите знак операции (+, -, /, *, ^, %): ");

		char operationSign = scan.next().charAt(0);
		scan.close();
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
				resultOperation = firstNumber / secondNumber;
				break;

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

		System.out.println(firstNumber + " " + operationSign + " " + secondNumber + " = " + resultOperation);

	}
}
