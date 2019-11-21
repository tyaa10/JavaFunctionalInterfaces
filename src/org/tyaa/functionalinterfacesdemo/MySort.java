/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.functionalinterfacesdemo;

import java.util.List;

/**
 *
 * @author Yurii
 */
public class MySort {
    
    public static void sortInt(List<Integer> _integers) {
        boolean sorted = false;
        do {
            sorted = true;
            for (int i = 0; i < _integers.size() - 1; i++) {
                if (_integers.get(i) < _integers.get(i + 1)) {
                    Integer tmp = _integers.get(i);
                    _integers.set(i, _integers.get(i + 1));
                    _integers.set(i + 1, tmp);
                    sorted = false;
                }
            }
        } while (!sorted);
    }
    
    public static void universalSort(List _items, MyComparator _mc) {
        boolean sorted = false;
        do {
            sorted = true;
            for (int i = 0; i < _items.size() - 1; i++) {
                if (_mc.compare(_items.get(i), _items.get(i + 1)) < 0) {
                    Object tmp = _items.get(i);
                    _items.set(i, _items.get(i + 1));
                    _items.set(i + 1, tmp);
                    sorted = false;
                }
            }
        } while (!sorted);
    }
}
