public class TabliceZadania {

    public static void main(String[] args) {

//        int i;
//
//        for (i = 0;i<100;i++){
//            if (i % 3 == 0) {
//                System.out.println(i);
//            }
//        }

        int[] numbers = new int[] {1,2,3,4,5};
        for (int i=0;i<(numbers.length/2);i++) {
            int temp = numbers[i];                          //1
            numbers[i] = numbers[numbers.length-1-i];       // 1 ->
            numbers[numbers.length-1-i] = temp;
            System.out.println("iteracja numer" + i);
        }

        for (int i=0;i<(numbers.length);i++) {
            System.out.println(numbers[i]);
        }
    }
}
