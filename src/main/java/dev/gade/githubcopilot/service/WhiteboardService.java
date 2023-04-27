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

}
