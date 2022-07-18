public class InterfaceTest implements SimpleInterface {

    String firstName;

        @Override
        public void readMeAName() {
            System.out.println("Testy interfejsu");
        }

        @Override
        public String giveMeAName(String name) {
            return name;
        }
}
