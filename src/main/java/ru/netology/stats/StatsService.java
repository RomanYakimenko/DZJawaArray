package ru.netology.stats;

import java.util.Arrays;

public class StatsService {
    public long sumSales (long[] sales){
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;

        }
        return totalSale;
    }
    public long averageSale(long[] sales) {
        long totalSale = 0;
        for (long sale : sales){
            totalSale += sale;
        }
        long averageSale = totalSale / 12;
        return averageSale;
    }
    public int calcMonthMaximumSale(long[] sales){
        int monthMaximum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaximum]) {
                monthMaximum = i;
            }
        }
        return monthMaximum + 1;
    }
    public int calcMonthMinimumSale(long[] sales){
        int monthMinimum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinimum]){
                monthMinimum = i;
            }
        }
        return monthMinimum + 1;
    }
    public  int calcMonthsBellowAverage(long[] sales) {
        int counter = 0;
        long average = averageSale(sales);
        for (long sale : sales){
            if (sale < average){
                counter++;
            }
        }
        return counter;
    }
    public int calcMonthsHigherAverage(long[] sales){
        int counter = 0;
        long average = averageSale(sales);
        for (long sale : sales){
            if (sale > average){
                counter++;
            }
        }
        return counter;
    }
}
