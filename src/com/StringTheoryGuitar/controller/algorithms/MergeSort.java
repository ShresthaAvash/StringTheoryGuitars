/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StringTheoryGuitar.controller.algorithms;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
/**
 *
 * @author 23048676 Avash Shrestha
 */
public class MergeSort {
        public static <T> void sort(List<T> list, Comparator<? super T> c) {
        if (list.size() > 1) {
            int mid = list.size() / 2;
            List<T> left = new ArrayList<>(list.subList(0, mid));
            List<T> right = new ArrayList<>(list.subList(mid, list.size()));

            sort(left, c);
            sort(right, c);

            merge(list, left, right, c);
        }
    }

    private static <T> void merge(List<T> list, List<T> left, List<T> right, Comparator<? super T> c) {
        int i = 0, j = 0, k = 0;
        while (i < left.size() && j < right.size()) {
            if (c.compare(left.get(i), right.get(j)) <= 0) {
                list.set(k++, left.get(i++));
            } else {
                list.set(k++, right.get(j++));
            }
        }
        while (i < left.size()) {
            list.set(k++, left.get(i++));
        }
        while (j < right.size()) {
            list.set(k++, right.get(j++));
        }
    }
}
