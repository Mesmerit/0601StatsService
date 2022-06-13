import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void shouldFindSum(){
        StatsService statsService = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = statsService.sumSales(sales);
        long expected = 180;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldFindAverage(){
        StatsService statsService = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = statsService.averageSales(sales);
        long expected = 15;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldFindNumberMax(){
        StatsService statsService = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = statsService.numberOfMaxSalesMonth(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldFindNumberMin(){
        StatsService statsService = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = statsService.numberOfMinSalesMonth(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldFindLowAverage(){
        StatsService statsService = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = statsService.quantityOfMonthOfLowAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldFindHighAverage(){
        StatsService statsService = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = statsService.quantityOfMonthOfHighAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}
