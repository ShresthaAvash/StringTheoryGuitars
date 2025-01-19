/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StringTheoryGuitar.controller.algorithms;

/**
 *
 * @author 23048676 Avash Shrestha
 */
import java.util.Comparator;
import java.util.List;
public class SelectionSort {

        public static <T> void sort(List<T> list, Comparator<? super T> c) {
            int n = list.size();
            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (c.compare(list.get(j), list.get(minIndex)) < 0) {
                        minIndex = j;
                    }
                }
                T temp = list.get(minIndex);
                list.set(minIndex, list.get(i));
                list.set(i, temp);
            }
        }
}
