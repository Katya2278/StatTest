package ru.netology.stats;

import java.util.Arrays;
import java.util.concurrent.RecursiveTask;

public class StatsService {
    public long peakSels(long[] sales) {
        long peakday = 0;
        for (long i = 0; i < sales.length; i++) {

            if (sales[(int) i] >= sales[(int) peakday]) {
                peakday = i;
            }
        }
        return peakday + 1;
    }

    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {

            totalSale += sale;
        }
        return totalSale;
    }

    public long average(long[] sales) {
        long totalSale = sum (sales);
        long averegeSale = totalSale / 12;
        return averegeSale;
    }
    public long minSels(long[] sales) {
       long minday = 0;
        for (long i = 0; i < sales.length; i++) {

            if (sales[(int) i] <= sales[(int) minday]) {
                minday = i;

            }
        }
        return minday + 1;
    }
    public long below (long[]sales) {
        long averageSale = average(sales);
        long counter = 0;
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }


    public long above (long[]sales) {
        long averageSale = average(sales);
        long counter = 0;
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;


    }
}