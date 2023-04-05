package dev.gade.githubcopilot.utils;

public class WhiteBoardService {

    //is polindrome?
    public boolean isPolyndrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
