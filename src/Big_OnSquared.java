// Big O: O(n^2)
// This program defines a method called printItems in Java.
//
// The purpose of this method is to demonstrate a nested loop structure
// with a time complexity of O(n^2), where n represents the input size.

public class Big_OnSquared {
    public static void printItems(int n) {
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.println(i + " " + j);
            }
        }
    }

    public static void main(String[] args) {
        printItems(10);
    }
}