package com.csd.training.exercise.stock;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Thinkpad on 18-06-05.
 */
public class StockJUnitTest {

    @Test
    public void testInitialize() {
        Stock stock = new Stock();
        assertEquals(0, stock.getCount());
    }

}