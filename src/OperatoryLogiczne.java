public class OperatoryLogiczne {

    public static void main(String[] args) {

        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = true;
        boolean fourthValue = false ;

        /*
        *       && operator i
        *       || operator lub
        *       ! zaprzeczenie, negacja
        * */

        System.out.println(firstValue && secondValue); // false
        System.out.println(firstValue && thirdValue); // true
        System.out.println(firstValue || secondValue); // true
        System.out.println(secondValue || fourthValue); // false
        System.out.println(!firstValue); // false
        System.out.println(!secondValue); // true
        System.out.println(!(firstValue && secondValue)); // true

        boolean testFirstNumbers = 1 > 2;
        boolean testSecondNumbers = 2 > 1;
        boolean testThirdNumbers = 1 == 1;

        System.out.println("***************************************");

        System.out.println("pierwszy test: " + (testFirstNumbers && testSecondNumbers));
        System.out.println("drugi test: " + (testSecondNumbers && testThirdNumbers));
    }


}
