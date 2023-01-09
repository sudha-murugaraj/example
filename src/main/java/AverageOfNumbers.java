public class AverageOfNumbers {
    public static void main(String args[]) {
        //declaring variables
        int i, total;
        //declaring and defining an array
        int a[] = {2, 5, 7, 8, 9, 78, 67, 56, 87, 90};
        //declaring and assigning value to the variable nand total
        int n = 10;total = 0;
        //creating loop to iterate till the value of i is < n
        // and storing it into total
        for (i = 0; i < n; i++) {
            total = total + a[i];
        }
        //printing average after total/n
        System.out.println("Average ::" + total / (float) n);
    }
}

