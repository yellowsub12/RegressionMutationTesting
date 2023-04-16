package com.app;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Quick3wayTests {

    @Test
    public void Test1(){
        char[] charArray = "SPOILAGE".toCharArray();
        Character[] charObjectArray = new Character[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            charObjectArray[i] = charArray[i];
        }
        Quick3way.sort(charObjectArray);
        assertEquals(Arrays.toString(charObjectArray),"[A, E, G, I, L, O, P, S]");
    }

    @Test
    public void Test2(){
        char[] charArray = "".toCharArray();
        Character[] charObjectArray = new Character[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            charObjectArray[i] = charArray[i];
        }
        Quick3way.sort(charObjectArray);
        assertEquals(Arrays.toString(charObjectArray),"[]");
    }

    @Test
    public void Test3(){
        char[] charArray = "SPOOOOOOILAGE".toCharArray();
        Character[] charObjectArray = new Character[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            charObjectArray[i] = charArray[i];
        }
        Quick3way.sort(charObjectArray);
        assertEquals(Arrays.toString(charObjectArray),"[A, E, G, I, L, O, O, O, O, O, O, P, S]");
    }

    @Test
    public void Test4(){
        char[] charArray = "     ".toCharArray();
        Character[] charObjectArray = new Character[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            charObjectArray[i] = charArray[i];
        }
        Quick3way.sort(charObjectArray);
        assertEquals(Arrays.toString(charObjectArray),"[ ,  ,  ,  ,  ]");
    }

    @Test
    public void Test5(){
        char[] charArray = "        S P O ILAGE".toCharArray();
        Character[] charObjectArray = new Character[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            charObjectArray[i] = charArray[i];
        }
        Quick3way.sort(charObjectArray);
        assertEquals(Arrays.toString(charObjectArray),"[ ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  , A, E, G, I, L, O, P, S]");
    }

    @Test
    public void Test6(){
        char[] charArray = "A".toCharArray();
        Character[] charObjectArray = new Character[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            charObjectArray[i] = charArray[i];
        }
        Quick3way.sort(charObjectArray);
        assertEquals(Arrays.toString(charObjectArray),"[A]");
    }

    @Test
    public void Test7(){
        char[] charArray = " A   A  B".toCharArray();
        Character[] charObjectArray = new Character[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            charObjectArray[i] = charArray[i];
        }
        Quick3way.sort(charObjectArray);
        assertEquals(Arrays.toString(charObjectArray),"[ ,  ,  ,  ,  ,  , A, A, B]");
    }

    @Test
    public void Test8(){
        char[] charArray = "AA".toCharArray();
        Character[] charObjectArray = new Character[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            charObjectArray[i] = charArray[i];
        }
        Quick3way.sort(charObjectArray);
        assertEquals(Arrays.toString(charObjectArray),"[A, A]");
    }

    @Test
    public void Test9(){
        char[] charArray = "1512512515ABADSDASDAD".toCharArray();
        Character[] charObjectArray = new Character[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            charObjectArray[i] = charArray[i];
        }
        Quick3way.sort(charObjectArray);
        assertEquals(Arrays.toString(charObjectArray),"[1, 1, 1, 1, 2, 2, 5, 5, 5, 5, A, A, A, A, B, D, D, D, D, S, S]");
    }


    @Test
    public void Test10(){
        char[] charArray = "✩✩✩ABC✐✐✐".toCharArray();
        Character[] charObjectArray = new Character[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            charObjectArray[i] = charArray[i];
        }
        Quick3way.sort(charObjectArray);
        assertEquals(Arrays.toString(charObjectArray),"[A, B, C, ✐, ✐, ✐, ✩, ✩, ✩]");
    }
}
