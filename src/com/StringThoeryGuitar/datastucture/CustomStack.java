/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StringThoeryGuitar.datastucture;

import java.util.LinkedList;

/**
 *
 * @author 23048676 Avash Shrestha
 */
public class CustomStack {
    private LinkedList<String> stack;
    private int capacity;

    public CustomStack(int capacity) {
        this.capacity = capacity;
        this.stack = new LinkedList<>();
    }

    public void push(String action) {
        if (stack.size() == capacity) {
            stack.removeLast(); // Remove the oldest element (bottom of the stack)
        }
        stack.addFirst(action); // Add to the top of the stack
    }

    public String pop() {
        if (isEmpty()) {
            return null; // Or throw an exception if you prefer
        }
        return stack.removeFirst();
    }

    public String peek() {
        if (isEmpty()) {
            return null; // Or throw an exception
        }
        return stack.getFirst();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    // Method to get all recent actions as a formatted string
    public String getRecentActions() {
        StringBuilder sb = new StringBuilder();
        for (String action : stack) {
            sb.append(action).append("\n");
        }
        return sb.toString();
    }
}
