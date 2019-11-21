/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.functionalinterfacesdemo;

import java.math.BigDecimal;

/**
 *
 * @author Yurii
 */
public class Good {
    Integer id;
    String title;
    BigDecimal price;

    public Good(Integer id, String title, BigDecimal price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Good{" + "id=" + id + ", title=" + title + ", price=" + price + '}';
    }
}
