package pl.jlabs.ints;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class ChampionshipTest {

    private Championship championship;

    @Before
    public void setUp() {
        Map<MarathonRunner, Long> rawResults = DataProvider.manuallyCreatedRawResults();
        championship = new Championship(rawResults);
        //championship = new ExtChampionship(rawResults);
    }

    @Test
    public void checkResultList() {
        List<MarathonRunner> results = championship.getResults();

        int completedCount = 5;
        Assert.assertEquals(completedCount, results.size());

        MarathonRunner winner = new MarathonRunner("Mike", "Patton", 231);
        Assert.assertTrue(winner.equals(results.get(0)));
    }

    @Test
    public void checkMikeIsWinner() throws ResultNotFound {
        MarathonRunner winner = new MarathonRunner("Mike", "Patton", 231);
        boolean isWinner = championship.isWinner(winner);
        Assert.assertTrue(isWinner);
    }

    @Test
    public void checkIgyIsWinner() throws ResultNotFound {
        MarathonRunner runner = new MarathonRunner("Igy", "Pop", 433);
        boolean isWinner = championship.isWinner(runner);
        Assert.assertFalse(isWinner);
    }

    @Test(expected = ResultNotFound.class)
    public void checkJohnIsWinner() throws ResultNotFound {
        MarathonRunner runner = new MarathonRunner("John", "Coltrane", 222);
        boolean isWinner = championship.isWinner(runner);
        Assert.assertFalse(isWinner);
    }

}
