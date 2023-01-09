public class ArrayReverse {
    public static void ArrayReversing(int[] arr) {
        //creating for loop to iterate till the i value is 0
        for (int i = arr.length - 1; i >= 0; i--) {
            //print array value
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //declaring and defining an array
        int[] arr ={1, 2, 3, 4, 5};
        //creating oject for a class
        ArrayReverse arrobj = new ArrayReverse();
        //calling method using object
        arrobj.ArrayReversing(arr);
    }
}

