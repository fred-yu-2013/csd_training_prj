package com.csd.training.exercise.stock

import org.junit.After
import org.junit.Before
import spock.lang.Specification

/**
 * Created by Thinkpad on 18-06-04.
 */
class StockTest extends Specification {

    private Stock stock

    @Before
    def setup() {
        stock = new Stock()
    }

    @After
    def tearDown() {
        stock.clearAll()
    }

    def "进货初始化"() {
        given: ""

        when: ""

        then: ""
        stock.getCount() == 0
    }

    def "进货进10台笔记本"() {
        given: "仓库为空"

        when: "引进2台笔记本"
        List<Notebook> notebooks = new ArrayList<>()
        for (int i = 0; i < 10; i++) {
            notebooks.add(new Notebook())
        }
        stock.pushInto(notebooks)

        then: "仓库有10台笔记本"
        stock.getCount() == 10
    }

}
