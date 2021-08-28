package ru.netology.stats;

public class StatsService {

    public long calcSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageSales(long[] sales) {
        long sum = calcSum(sales);
        return sum / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxSales = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxSales]) {
                maxSales = month;
            }
            month = month + 1;
        }
        return maxSales + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;

            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int numberOfTheMonthInWhichThereWasApeakInSales(long[] sales) {
        long average = averageSales(sales);
        int month = 0;
        for (long sale : sales) {
            if (sale > average) {
                month += 1;
            }
        }
        return month;
    }

    public int numberOfTheMonthInWhichThereWasAminimumOfSales(long[] sales) {
        long average = averageSales(sales);
        int month = 0;
        for (long sale : sales) {
            if (sale < average) {
                month += 1;
            }
        }
        return month;
    }
}