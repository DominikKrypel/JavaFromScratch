public class Firefox implements Webdriver {


    @Override
    public void get() {
        System.out.println("Otwieram przeglądarkę Firefox");
    }

    @Override
    public void findElement() {
        System.out.println("Wyszukuję element przy użyciu przegądarki Firefox");
    }
}
