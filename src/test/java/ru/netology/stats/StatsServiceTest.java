package ru.netology.stats;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    public void testSumm(){
        StatsService service= new StatsService();
        int []sales ={8, 15, 13, 15, 17, 20};
        int expectedDay = 88;
        int actualDay = service.peakSels(sales);

Assertions.assertEquals(expectedDay,actualDay);
}}