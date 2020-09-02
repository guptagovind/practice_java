package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

        // Remember: default decimal data type is double in JAVA

        int myIntValue = 5;
        float myFloatValue = (float) 5.25; // Casting is required as default is double for decimal.
        float myFloatValue1 = 5.25f; // Prefer way is to add f at last to avoid casting
        double myDoubleValue = 5.25d;

        float printFloatValue1 = 5f / 2f; // Precision will be added on print output: 2.5
        double printDoubleValue = 5d; // Precision will be added on print output: 5.0

        // challenge: Convert a given number of pounds to kilograms;

        double numberInPound = 5d;
        double numberInKilo = numberInPound * 0.45359237d;
        System.out.println("numberInKilo " + numberInKilo);

        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(anotherNumber);


    }
}
