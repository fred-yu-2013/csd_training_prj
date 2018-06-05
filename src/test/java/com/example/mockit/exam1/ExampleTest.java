package com.example.mockit.exam1;

import org.junit.Test;
import mockit.*;

import static org.junit.Assert.*;

/**
 * 例子演示了JMocketit如何使用
 * Created by Thinkpad on 18-06-06.
 */
public class ExampleTest {

    /**
     * 待测试对象
     */
    @Tested
    private Example example;

    /**
     * 准备一个用来注入的对象，会自动注入到example里，只有一个DemoDao的特定实例demoDao被MOCK掉
     */
    @Injectable
    private DemoDao demoDao;

    @Test
    public void test() {
        // 1. 准备Mock的操作
        new Expectations() {{
            demoDao.queryStock(2);
            result = 5;
            demoDao.queryStock(4);
            result = 7;
        }};

        // 2. 测试待测试的类，依赖的demoDao会被第一步的设置mock掉
        assertEquals(8, example.getAjustedStock(2));
        assertEquals(10, example.getAjustedStock(4));

        // 3. 检验mock对象demoDao是否分别被调用了1次
        new Verifications() {{
            demoDao.queryStock(2);
            times = 1;
            demoDao.queryStock(4);
            times = 1;
        }};
    }

}