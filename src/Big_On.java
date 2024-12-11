//<> Big O: O(n)
//Write a method called printItems in Java.
//
//The purpose of this method is to print out a series of integer numbers, starting from 0 up to (but not including) a specified number.

public class Big_On {
    public static void printItems(int n) {
        for(int i = 0; i < n; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printItems(10);
    }
}