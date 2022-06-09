public class AutoTest {

    public static void main(String[] args) {

        Auto mercedes = new Auto();
        mercedes.przebieg = 20000;
        mercedes.marka = "KIA";
        mercedes.model= "Sportage";
        mercedes.rok = 2021;

        System.out.println("Przebieg " + mercedes.przebieg);
        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        Auto audi = new Auto();
        audi.marka = "Audi";
        audi.model = "A5";
        audi.rok = 2020;
        audi.przebieg = 0;

        audi.info();

        Auto noName = new Auto();
        noName.jedz();
        noName.hamuj();
        noName.info();


    }

}
