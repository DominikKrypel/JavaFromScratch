import java.util.Scanner;

public class CustomScanner {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Wprowadź swoje imię");
//        String name = scanner.nextLine();
//        System.out.println("Cześć " + name + " !");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź wybraną liczbę");
        int firstNumber = scanner.nextInt();
        int result = firstNumber * firstNumber;
        System.out.println("Kwadrat tej liczy to " + result);
    }
}
