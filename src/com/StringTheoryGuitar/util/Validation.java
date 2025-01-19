/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StringTheoryGuitar.util;


import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author 23048676 Avash Shrestha
 */
public class Validation {
    // Validate Serial Number (must be unique and > 0)
    public static boolean isValidSN(int sn, JTable table) {
        if (sn <= 0) {
            return false;
        }
        

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            int existingSN = (int) model.getValueAt(i, 0); // Assuming the SN is in column 0
            if (existingSN == sn) {
                return false; // Duplicate SN found
            }
        }
        
        DefaultTableModel model1 = (DefaultTableModel) table.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            int existingSN = (int) model.getValueAt(i, 0); // Assuming the SN is in column 0
            if (existingSN == sn) {
                return false; // Duplicate SN found
            }
        }

        return true;
    }

    // Validate Guitar Model Name
    public static boolean isValidModelName(String modelName) {
        return modelName != null && !modelName.trim().isEmpty();
    }

    // Validate Price
    public static boolean isValidPrice(double price) {
        return price > 0; // Must be a positive number
    }
    
    public static boolean isValidQuantity(int Quantity) {
        return Quantity >= 0;
    }
}
