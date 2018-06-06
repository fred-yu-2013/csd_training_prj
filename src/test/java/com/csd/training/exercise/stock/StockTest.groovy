package com.csd.training.exercise.stock

import org.junit.After
import org.junit.Before
import spock.lang.Specification

/**
 * Created by Thinkpad on 18-06-04.
 */
class StockTest extends Specification {

    private Stock stock

    def setup() {
        stock = new Stock()
    }

    def cleanup() {
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

    def "进货进1台具体的笔记本"() {
        given: "准备一台笔记本"
        Notebook notebook = new Notebook()
        String brand = Notebook.BRAND_APPLE
        String model = "Mac"
        String serialNumber = "SN20180606"
        int price = 15000
        notebook.setBrand(brand)
        notebook.setModel(model)
        notebook.setSerialNumber(serialNumber)
        notebook.setPrice(price)

        when: "存到仓库里"
        stock.pushIntoOne(notebook)

        then: "确认仓库里面仅有添加的那台"
        stock.getCount() == 1
        List<Notebook> notebooks = stock.getAll()
        notebooks.size() == 1
        notebook.getBrand() == brand
        notebook.getModel() == model
        notebook.getSerialNumber() == serialNumber
        notebook.getPrice() == price
    }

}
