package com.driver;

// Task 1: Class A with a method meth
class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

// Task 2: Class B which extends class A
class B extends A {
    // Task 4: Overriding meth in class B
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        // Task 3: Creating an object of class B and calling meth
        B objB = new B();
        
        // Task 5: Calling the overridden method meth
        System.out.println(objB.meth());  // Output: Method is overridden in Extended class B
    }
}
