public class Main {

    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;

        //Loop of all the numbers in the range.
        for (int i = 1; i <= 1000; ++i) {
            //numbers that are divisible by 3 and 5.
            if ((i % 3 == 0) && (i % 5 == 0)) {
                sum += i;
                System.out.println(i);
                counter++;
            }
            if (counter == 5) {
                break;
            }
        }
        System.out.println("Sum of the numbers is: " + sum);
    }
}
