package ru.netology.stats;

public class StatsService {
    // метод для подсчета суммы всех продаж
    public long calculateTotalSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    // метод для расчета средней суммы продаж в месяц
    public double calculateAverageSales(long[] sales) {
        long total = calculateTotalSales(sales);
        return (double) total / sales.length;
    }

    // метод для поиска номера месяца с пиком продаж
    public int findMonthWithMaxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    // метод для поиска номера месяца с минимальными продажами
    public int findMonthWithMinSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    // метод для подсчета количества месяцев с продажами ниже среднего
    public int countMonthsBelowAverage(long[] sales) {
        double average = calculateAverageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    // метод для подсчета количества месяцев с продажами выше среднего
    public int countMonthsAboveAverage(long[] sales) {
        double average = calculateAverageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}
