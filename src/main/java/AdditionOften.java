public class AdditionOften {
    public static void main(String[] args) {
        //declaring and initializing the variables
        int totalnumbers = 10, sum = 0;
        //create a for loop from 0 to the totalnumbers
        for (int i = 0; i < totalnumbers; i++) {
            //add i value with the sum value and store in sum
            sum = sum + i;
        }
        //printing the added values of ten numbers
        System.out.printf("sum of 10 numbers :" + sum);
    }
}
