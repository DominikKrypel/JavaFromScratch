public class Person {

        String name;
        int age;

        public Person(){

        }

        public Person(String name, int age) {
                this.name = name;
                this.age = age;
        }

        public void eat() {
                System.out.println("I like pizza " + name);
        }

        public void walk() {
                System.out.println("I like walking  ");
        }


}
