public class For {

    public static void main(String[] args) {

        int number = 100;
        int i;
        int j;

//        //i specjalna zmienna strująca
//        for (i =0;i<number;i=i+2) {
//            System.out.println(i);
//        }

        System.out.println("###############################");
//
        // i specjalna zmienna sterująca
        for (j=0;j<number;j++) {
            if (j%5==0)
            System.out.println(j);
        }

    }

}
