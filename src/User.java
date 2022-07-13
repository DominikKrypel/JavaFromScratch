public class User {

    public String name;
    public String password;

    public User(){
        System.out.println("Hello z konstruktora");
    }

    public User(String name, String password){
        this.name = name;
        this.password = password;

        System.out.println("Imie z this");

    }

    public void sayHello(String name) {
        System.out.println("My name is " + name);
    }
}