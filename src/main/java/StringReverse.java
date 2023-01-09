/*public class Stringreverse {
    public static void main(String[] args) {
        String[] s=;
        for (int i = 0; i < s.length()-1; i--) {
            //String revstring = "";
             //revstring = revstring + s.charAt(i);
            System.out.println(+s);


        }
    }
}
*/

public class StringReverse {
    public static void main(String[] args) {
        // declaration of variable assigning string
        String InputString = "Good morning ";
        //creating object for stringbuilder class
        StringBuilder input1 = new StringBuilder();
        //appending the inputstring to the object
        input1.append(InputString);
        //using reverse() method
        input1.reverse();
        //printing the reversed string
        System.out.println(input1);
    }
}
