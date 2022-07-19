public class Dog extends Animal {
    @Override
    public void sayHello() {
        System.out.println("I am the Dog, godbye");
    }

    @Override
    public void sayGodbye() {
        super.sayGodbye();
        System.out.println("Number of legs " + Legs);
    }
}
