import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService statsService = new StatsService();

        long sumSalarys = statsService.sumSales(sales);
        System.out.println(sumSalarys);

        int averageSales = statsService.averageSales(sales);
        System.out.println(averageSales);

        int numberOfMaxSalesMonth = statsService.numberOfMaxSalesMonth(sales);
        System.out.println(numberOfMaxSalesMonth);

        int numberOfMinSalesMonth = statsService.numberOfMinSalesMonth(sales);
        System.out.println(numberOfMinSalesMonth);

        int quantityOfMonthOfLowAverage = statsService.quantityOfMonthOfLowAverage(sales);
        System.out.println(quantityOfMonthOfLowAverage);

        int quantityOfMonthOfHighAverage = statsService.quantityOfMonthOfHighAverage(sales);
        System.out.println(quantityOfMonthOfHighAverage);
    }
}
