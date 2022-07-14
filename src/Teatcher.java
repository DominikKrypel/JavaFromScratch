public class Teatcher extends Person {


    public String name;
    public int age;

    public Teatcher(){
    }

    public Teatcher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void playTeatching() {
        System.out.println("I like play games");
    }

    public void sayHello () {
        System.out.println("My name is " + name);
        System.out.println("I am " + " years old");
    }

    public void superClass() {
        System.out.println("Jestem z klasy podrzędnej");
    }

    public void eat() {
        System.out.println("I like snak's " + name);
    }


}
