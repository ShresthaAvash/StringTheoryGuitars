/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StringTheoryGuitar.controller.algorithms;

import java.util.Comparator;
import java.util.List;

/**
 *
 * @author 23048676 Avash Shrestha
 */
public class InsertionSort {
    public static <T> void sort(List<T> list, Comparator<? super T> c) {
        for (int i = 1; i < list.size(); i++) {
            T key = list.get(i);
            int j = i - 1;
            while (j >= 0 && c.compare(list.get(j), key) > 0) {
                list.set(j + 1, list.get(j));
                j = j - 1;
            }
            list.set(j + 1, key);
        }
    }
}
