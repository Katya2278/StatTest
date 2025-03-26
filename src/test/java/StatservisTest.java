import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatservisTest {
    @Test
    public void MonthofBigSales() {
        StatsService service = new StatsService();
        int[] sum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.peakSels(sum);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSumm() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = service.sum(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void averegetest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        long actual = service.average(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MonthofminSales() {
        StatsService service = new StatsService();
        int[] summ = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSels(summ);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowaverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.below(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveaveragemonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.above(sales);

        Assertions.assertEquals(expected, actual);
    }
}