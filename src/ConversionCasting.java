public class ConversionCasting {

    public static void main(String[] args) {

        int a = 2;
        double b = 23.0;

        double c = a/b;
        System.out.println(c);

        int d = a/(int)b;
        System.out.println(d);
    }

    Webdriver firefoxDriver = new Firefox();

    Firefox driver = (Firefox) firefoxDriver;



}
