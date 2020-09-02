package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        long miles = SpeedConverter.toMilesPerHour(75.114);
        System.out.println(miles);
        SpeedConverter.printConversion(1.56);

        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);

        System.out.println(BarkingDog.shouldWakeUp(true, 1));
        System.out.println(BarkingDog.shouldWakeUp(false, 2));
        System.out.println(BarkingDog.shouldWakeUp(true, 8));
        System.out.println(BarkingDog.shouldWakeUp(true, -1));

    }
}
