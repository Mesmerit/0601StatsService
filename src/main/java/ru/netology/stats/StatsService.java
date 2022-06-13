package ru.netology.stats;

public class StatsService {
    public long sumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum / sales.length;
    }

    public int numberOfMaxSalesMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int numberOfMinSalesMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int quantityOfMonthOfLowAverage(int[] sales) {
        int averageSales = averageSales(sales);
        int tmp = 0;
        for (int sale : sales) {
            if (sale < averageSales) {
                tmp++;
            }
        }
        return tmp;
    }

    public int quantityOfMonthOfHighAverage(int[] sales) {
        int averageSales = averageSales(sales);
        int tmp = 0;
        for (int sale : sales) {
            if (sale > averageSales) {
                tmp++;
            }
        }
        return tmp;
    }
}