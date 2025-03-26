package ru.netology.stats;

import java.util.Arrays;
import java.util.concurrent.RecursiveTask;

public class StatsService {
    public int peakSels(int[] sales) {
        int peakday = 0;
        for (int i = 0; i < sales.length; i++) {

            if (sales[i] >= sales[(int) peakday]) {
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
    public int minSels(int[] sales) {
        int minday = 0;
        for (int i = 0; i < sales.length; i++) {

            if (sales[i] <= sales[(int) minday]) {
                minday = i;
            }
        }
        return minday + 1;
    }
    public int below (long[]sales) {
        long averageSale = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }


    public int above (long[]sales) {
        long averageSale = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;


    }
}