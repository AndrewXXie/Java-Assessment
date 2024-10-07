import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // Creating Methods
    static void introduce() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {

        // Integer
        int myInt = 2;
        System.out.println(myInt);

        // Character
        char myLetter = 'A';
        System.out.println(myLetter);

        // Boolean
        boolean myBool = true;
        System.out.println(myBool);

        // Double
        double myDouble = 1.2;
        System.out.println(myDouble);

        // Float
        float myFloatNum = 22.99f;
        System.out.println(myFloatNum);

        // String
        String myString;
        myString = "Hello";
        System.out.println(myString);

        // ARRAYS

        int[] myArray = {1, 3, 7, 81, -3, 59, 23, 42};

        // Printing Through Arrays

        for (int i : myArray) {
            System.out.println(i);
        }

        // Invoking Methods

        introduce();
    }
}


