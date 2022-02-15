public class SpeedsGames {

    public static boolean isGreenLight = false;
    public static int MaxSpeed = 3;

    public static int speedCheckMas(int[] players) {


        int sum = 0;

        for (int player : players) {
            if (player > MaxSpeed) {
                sum++;
            }
        }
        return sum;
    }
}


