public class IntrukcjaWarunkowaElseIf {

    public static void main(String[] args) {

        int number = 2;

        if (number > 0){
            System.out.println("Liczba większa od zera");
        }
        else if (number < -10 ){
            System.out.println("liczba mniejsza od -10");
        }
        else if (number == 0) {
            System.out.println("licza równa 0");
        }
        else {
            System.out.println("Liczba w przedziale od 0 do -10");
        }
        //jeżeli wszystkie warunki sfailują to przechodzimy do elsa
    }
}
