/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StringTheoryGuitar.controller.algorithms;
import com.StringTheoryGuitar.model.GuitarDetails;
import java.util.List;

/**
 *
 * @author PC
 */
public class BinarySearch {
    public static int search(List<GuitarDetails> list, String name) {
        int l = 0;
        int r = list.size() - 1;
        name = name.toLowerCase(); // Convert search string to lowercase

        while (l <= r) {
            int m = l + (r - l) / 2;
            String midName = list.get(m).getName().toLowerCase(); // Convert model name to lowercase

            // Check for an exact match
            if (midName.equals(name)) {
                return m;
            }

            // If the search string is lexicographically greater, ignore the left half
            if (midName.compareTo(name) < 0) {
                l = m + 1;
            }
            // If the search string is lexicographically smaller, ignore the right half
            else {
                r = m - 1;
            }
        }

        return -1; // Not found
    }
}


