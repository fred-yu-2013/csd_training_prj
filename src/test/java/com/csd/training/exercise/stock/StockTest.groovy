package com.csd.training.exercise.stock

/**
 * Created by Thinkpad on 18-06-04.
 */
class StockTest extends spock.lang.Specification {

    def "进货初始化"() {
        given: ""

        when: ""
        Stock stock = new Stock()

        then: ""
        stock.getCount() == 0
    }

}
