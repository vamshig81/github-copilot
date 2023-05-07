package dev.gade.githubcopilot.service;

public class WhiteboardService {
    //is polyndrome?
    public boolean isPolyndrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    //method will remove any sub string from a string
    public String removeSubString(String str, String subStr) {
        return str.replaceAll(subStr, "");
    }

    public String removeSubString2(String str, String subStr) {
        return str.replace(subStr, "");
    }
    //write a method that will return the number of words in a string
    public int countWords(String str) {
        return str.split(" ").length;
    }

    //write fibonacci series
    public int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //write a method that will return the number of vowels in

}
