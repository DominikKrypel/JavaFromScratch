public class InkrementacjaDekrementacja {

    public static void main(String[] args) {

        int a = 0;
        System.out.println("Wartość pierwsza a " + a);

        int b = a++;
        System.out.println("Wartość druga a " + a);
        System.out.println("Wartość b " + b);

        int c = ++a;
        System.out.println("Wartość trzecia a " + a);
        System.out.println("Wartość c " + c);
    }
}
