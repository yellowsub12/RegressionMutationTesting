package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        char[] charArray = "✩✩✩ABC✐✐✐".toCharArray();
        Character[] charObjectArray = new Character[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            charObjectArray[i] = charArray[i];
        }
        Quick.sort(charObjectArray);
        System.out.println(Arrays.toString(charObjectArray));
    }


}