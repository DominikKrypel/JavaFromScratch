public class OperatoryMatematyczne {

    public static void main(String[] args) {

        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;


        int addition = firstNumber + secondNumber;
        int substraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        float division = thirdNumber / secondNumber;
        int mod = secondNumber % firstNumber;

        System.out.println(addition); // 10
        System.out.println(substraction); // -2
        System.out.println(multiplication); // 24
        System.out.println(division); //
        System.out.println(mod);

        System.out.println("----------------");

        firstNumber += secondNumber;
        System.out.println(firstNumber);

    }
}
