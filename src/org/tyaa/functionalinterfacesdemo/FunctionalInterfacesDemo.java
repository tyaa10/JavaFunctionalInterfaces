/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.functionalinterfacesdemo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Yurii
 */
public class FunctionalInterfacesDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1
        // List<Integer> integers = new ArrayList<>();
        // integers.addAll(Arrays.asList(new Integer[] {12, -5, 0, 78, 100, 0, 8, 9, -1}));
        /*List<Integer> integers =
            Arrays.asList(new Integer[] {12, -5, 0, 78, 100, 0, 8, 9, -1});*/
        // MySort.sortInt(integers);
        // MySort.universalSort(integers, FunctionalInterfacesDemo::compareIntAsc);
        //2
        /*List<String> strings =
            Arrays.asList(new String[] {"John", "Bill", "Anna", "Yurii", "Boris"});
        MySort.universalSort(strings, new MyComparator() {
            @Override
            public Double compare(Object a, Object b) {
                return Double.valueOf(((String)b).compareTo((String)a));
            }
        });*/
        BigDecimal p1 = new BigDecimal(10.99);
        p1 = p1.setScale(2, RoundingMode.CEILING);
        BigDecimal p2 = new BigDecimal(500.05);
        p2 = p2.setScale(2, RoundingMode.CEILING);
        BigDecimal p3 = new BigDecimal(99.99);
        p3 = p3.setScale(2, RoundingMode.CEILING);
        List<Good> goods =
            Arrays.asList(new Good[] {
                new Good(1, "qwewre", p1),
                new Good(3, "fbgfhj", p2),
                new Good(2, "iutyur", p3),
                new Good(4, "ytrhrgbgbfdbg", p2),
            });
        MySort.universalSort(goods, (a, b) -> {
            return Double.valueOf(((Good)b).price.compareTo(((Good)a).price));
        });
        goods.forEach(System.out::println);
    }
    
    static Double compareIntAsc(Object a, Object b){
        return Double.valueOf((Integer)b - (Integer)a);
    }
}
