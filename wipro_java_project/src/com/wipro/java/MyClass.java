/**
 * 
 */
package com.wipro.java;

/**
 * 
 */
class MyClass {
    int num = 5;

 

    public void changeValue(int num) {
        this.num = num;
    }

    
    public static void main(String[] args) {
        MyClass obj = new MyClass(); // Create an object for MyClass
        obj.changeValue(10); // Change the value for num
        System.out.println(obj.num); // Print the num
    }
}
