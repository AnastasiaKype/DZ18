public class SpeedGames2 {

    public static boolean isGreenLight = false;
    public static int MaxSpeed = 3;

    public static int[] speedCheckLosers(int[] players) {

        int sum = 0;

        for (int player : players) {
            if (player > MaxSpeed) {
                sum++;
            }

        }

        int[] speeds = new int[sum];
        int i = 0;
        for (int player : players) {
            if (player > MaxSpeed) {
                speeds[i] = player;
                i++;
            }

        }
        return speeds;

    }
}
