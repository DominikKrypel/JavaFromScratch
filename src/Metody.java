public class Metody {


    public void sumaLiczb() {
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result = result + i;
        }
        System.out.println("Suma dodanych liczb wynosi " + result);
    }

    int liczba;

    public void sumaLiczbPodanych(int liczba) {
        int result = 0;

        this.liczba = liczba;

        for (int i = 0; i < liczba; i++) {
            result = result + i;
        }
        System.out.println("Suma dodanych liczb wynosi " + result);
    }

    public int pobierzLiczbę() {
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result = result + i;
        }
//        System.out.println("Suma dodanych liczb wynosi " + result);
        return result;
    }

    public int add(int firstNumber, int secondNumber) {
        System.out.println("Suma to " + (firstNumber + secondNumber));
        return firstNumber + secondNumber;
    }
}
