public class Calculator {

    public int addition (int firstNumber, int secondNumber) {
        return  firstNumber + secondNumber;
    }

    public void substraction (int firstNumber, int secondNumber) {
        int substraction = firstNumber - secondNumber;
        System.out.println("Wynik odejmowania  " + substraction);
    }

    public void multiplication (int firstNumber, int secondNumber) {
        int multiplication = firstNumber * secondNumber;
        System.out.println("Wynik mnożenia " + multiplication);

    }

    public void division (int firstNumber, int secondNumber) {
        int division = firstNumber / secondNumber;
        System.out.println("Wynik dzielenia " + division);
    }

    public void mod (int firstNumber, int secondNumber) {
        int mod = firstNumber % secondNumber;
        System.out.println("Modulo  " + mod);
    }
}
