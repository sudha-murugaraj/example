//import java.util.Arrays;

public class NumReverse {
    public static void main(String[] args) {
        //declareing and defing values to the array
        Integer[] intArray = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        //print array starting from first element
        System.out.println("inorder");
        //creatin a loopt to iterate till array legth
        for (int i = 0; i < intArray.length; i++)
            System.out.print(intArray[i] + "  ");

        // System.out.println();

        //print array starting from last element
        System.out.println("reverse order:");
        //create loop to decrease the array lenth
        for (int i = intArray.length - 1; i >= 0; i--)
            System.out.print(intArray[i] + "  ");
    }
}



