public class Auto {

    public String marka;
    public String model;
    public Integer rok;
    public Integer przebieg;

    public void jedz() {
        System.out.println("jedź!");
    }

    public void hamuj() {
        System.out.println("Hamuj");
    }

    public void info() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rok: " + rok);
        System.out.println("Przebieg: " + przebieg);
    }
}
