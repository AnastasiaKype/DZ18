import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpeedsGamesTest {

    @Test
    public void speedCheck1() {
        SpeedsGames.isGreenLight = false;

        int[] players = {5, 0, 2};

        int expected = 3;
        int actual = SpeedsGames.speedCheckMas(players);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void speedCheck2() {
        SpeedsGames.isGreenLight = false;

        int[] players = {5, 0, 2};

        int[] expected = {5,0,2};
        int[] actual = SpeedGames2.speedCheckLosers(players);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void speedCheck3() {
        SpeedsGames.isGreenLight = false;

        int[] players = {5, 0, 2};

        int[] expected = {5,0, 2};
        int[] actual = SpeedGames3.speedCheckWin(players);

        Assertions.assertArrayEquals(expected, actual);

    }

}
