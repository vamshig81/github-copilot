package dev.gade.githubcopilot.utils;

public class MathUtils {

    int sum(int a, int b) {
        return a + b;
    }
 int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        return a / b;
    }

    public boolean isPolyndrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    //function to reverse a string using for loop
public String reverseString(String str) {
        char[] charArray = str.toCharArray();
        String reverse = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            reverse += charArray[i];
        }
        return reverse;
    }

}


