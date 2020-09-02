package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        // String is not a primitive data type. it is immutable.
        String myString = "This is a string";
        System.out.println("my string is equal to " + myString);

        myString = myString + ", and this is more.";
        System.out.println("my string is equal to " + myString);

        myString = myString + " \u00A9 2019";
        System.out.println("my string is equal to " + myString); // my string is equal to This is a string, and this is more © 2019

        String numberString = "250.55";
        numberString = numberString + "49.55";
        System.out.println(numberString); // 250.5549.55

        String lastString = "10";
        int myInt = 50;

        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString); // 1050


    }
}
