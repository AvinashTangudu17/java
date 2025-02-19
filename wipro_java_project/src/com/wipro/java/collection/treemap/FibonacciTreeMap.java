package com.wipro.java.collection.treemap;

import java.util.Scanner;
import java.util.TreeMap;

public class FibonacciTreeMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        scanner.close();
        
        TreeMap<Integer, Integer> fibonacciMap = generateFibonacci(n);
        
        System.out.println("Fibonacci Series stored in TreeMap:");
        for (Integer key : fibonacciMap.keySet()) {
            System.out.println("Term " + key + ": " + fibonacciMap.get(key));
        }
    }
    
    public static TreeMap<Integer, Integer> generateFibonacci(int n) {

        TreeMap<Integer, Integer> map = new TreeMap<>();
        int a = 0, b = 1;
        
        for (int i = 1; i <= n; i++) {
            map.put(i, a);
            int next = a + b;
            a = b;
            b = next;
        }
        
        return map;
    }
}

