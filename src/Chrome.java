public class Chrome implements Webdriver {


    @Override
    public void get() {
        System.out.println("Otwieram przeglądarkę Chrome");
    }

    @Override
    public void findElement() {
        System.out.println("Wyszukuję element przy użyciu przeglądarki Chrome");
    }
}
