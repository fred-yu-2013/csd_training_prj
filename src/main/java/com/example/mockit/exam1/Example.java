package com.example.mockit.exam1;

/**
 * Created by Thinkpad on 18-06-05.
 */
public class Example {

    private DemoDao demoDao;

    public int getAjustedStock(int value) {
        return demoDao.queryStock(value) + 3;
    }
}
