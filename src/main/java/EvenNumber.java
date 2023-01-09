public class EvenNumber {
    public static void main(String[] args) {
        //Initialize number of values
        int Num = 100;
        //printing Num value of 100
        System.out.print("Even Numbers from 1 to " + Num + " are: ");
        //create loop from 1 to 100
        for (int i = 1; i <= Num; i++) {
            //use if condition to check for remainder is 0
            if (i % 2 == 0) {
                //finally print condition satisfied value
                System.out.print(i + " ");

            }
        }


    }
}