public class While {

    public static void main(String[] args) {

        int number = 0;

//        while (number < 20) {
//            System.out.println("Moja wartość to " + number + " i jestem mniejszy od 20");
//            number++;
//        }

        do {
            System.out.println("Moja wartość to " + number + " i jestem mniejszy od 20");
            number++;
        }
        while (number < 20);
    }
}
