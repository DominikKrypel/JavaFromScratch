import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Proszę wprowadzić pierwszą liczbę");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();

        System.out.println("Proszę wprowadzić drugą liczbę");
        int secondNumber = scanner.nextInt();

        int addition = firstNumber + secondNumber;
        int substraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
        int mod = firstNumber % secondNumber;

        System.out.println("Wynik dodawania " + addition);
        System.out.println("Wynik odejmowania  " + substraction);
        System.out.println("Wynik mnożenia " + multiplication);
        System.out.println("Wynik dzielenia " + division);
        System.out.println("Modulo  " + mod);
    }
}
