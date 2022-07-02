import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        System.out.println("Proszę wprowadzić pierwszą liczbę");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();

        System.out.println("Proszę wprowadzić drugą liczbę");
        int secondNumber = scanner.nextInt();

        Calculator calculator = new Calculator();
        System.out.println("Test przypadku dodawania " + calculator.addition(firstNumber, secondNumber));;
        calculator.substraction(firstNumber, secondNumber);
        calculator.multiplication(firstNumber, secondNumber);
        calculator.division(firstNumber, secondNumber);
        calculator.mod(firstNumber, secondNumber);
    }
}
