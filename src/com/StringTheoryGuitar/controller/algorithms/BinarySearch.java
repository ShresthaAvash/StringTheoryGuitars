/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StringTheoryGuitar.controller.algorithms;
import com.StringTheoryGuitar.model.GuitarDetails;
import java.util.List;

/**
 *
 * @author 23048676 Avash Shrestha
 */
public class BinarySearch {
    public static int search(List<GuitarDetails> guitarList, String searchName) {
        int low = 0;
        int high = guitarList.size() - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            String midName = guitarList.get(mid).getName().toLowerCase();
            int comparison = midName.compareTo(searchName);
            
            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

}


