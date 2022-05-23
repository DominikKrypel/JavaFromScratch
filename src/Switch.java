public class Switch {

    public static void main(String[] args) {

        String danie = "Kebab";

        switch (danie) {
            case "Pizza":
                System.out.println(" Cena to 22 zł");
                break;
            case "Kebab":
                System.out.println(" Cena to 24 zł");
                break;
            case "Makaron":
                System.out.println(" Cena to 28 zł");
                break;
            case "Hot dog":
                System.out.println(" Cena to 33 zł");
                break;
            default:
                System.out.println("Nie mamy takiego dania w karcie");
        }

    }

}
