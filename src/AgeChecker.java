import java.util.Scanner;

public class AgeChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podać swój wiek");
        int age = scanner.nextInt();

        if (age < 18 && age >= 0){
            System.out.println("Nie możesz kupić alkoholu");
        } else if (age < 0){
            System.out.println("Został podany błędny wiek");
        }
        else {
            System.out.println("Twój wiek pozwala na zakup alkoholu");
        }
    }
}
