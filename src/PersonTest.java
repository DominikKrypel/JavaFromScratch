public class PersonTest {

    public static void main(String[] args) {

        Person footballer = new Person("Tadeusz", 45);
            footballer.eat();


        Teatcher adam = new Teatcher("Geniusz", 55);
//        adam.name = "Adam";
//        adam.age = 45;
//        adam.sayHello();
//        adam.playTeatching();

        adam.superClass();

        Footballer adam2 = new Footballer("Zofia", 33);
        adam2.superClass();
    }
}
