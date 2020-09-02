package academy.learnprogramming;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean isCatPlayingStatus = false;
        if (summer) {
            if ((25 <= temperature) && (temperature <= 45)) {
                isCatPlayingStatus = true;
            }
        } else {
            if ((25 <= temperature) && (temperature <= 35)) {
                isCatPlayingStatus = true;
            }
        }
        return isCatPlayingStatus;
    }
}
