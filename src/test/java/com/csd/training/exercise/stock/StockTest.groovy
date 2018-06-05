package com.csd.training.exercise.stock

import spock.lang.Specification

/**
 * Created by Thinkpad on 18-06-04.
 */
class StockTest extends Specification {

    def "进货初始化"() {
        given: ""

        when: ""
        Stock stock = new Stock()

        then: ""
        stock.getCount() == 0
    }

    def "进货"() {
        given: ""

        when: ""
        Stock stock = new Stock()

        then: ""
        stock.getCount() == 0
    }

}
