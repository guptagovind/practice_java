package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // char take 2 bytes or 16 bits value due to unicode storage.
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar); // 'D'
        System.out.println(myUnicodeChar); // 'D'
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;

    }
}
