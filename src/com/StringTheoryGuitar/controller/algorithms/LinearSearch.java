/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StringTheoryGuitar.controller.algorithms;
import com.StringTheoryGuitar.model.GuitarDetails;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author PC
 */
public class LinearSearch {

    public static List<GuitarDetails> search(List<GuitarDetails> list, String searchTerm) {
        List<GuitarDetails> found = new ArrayList<>();
        for (GuitarDetails guitar : list) {
            // Case-insensitive search
            if (guitar.getName().toLowerCase().contains(searchTerm)
                    || guitar.getBrand().toLowerCase().contains(searchTerm)
                    || guitar.getType().toLowerCase().contains(searchTerm)
                    || String.valueOf(guitar.getSn()).contains(searchTerm)) {
                found.add(guitar);
            }
        }
        return found;
    }
}
