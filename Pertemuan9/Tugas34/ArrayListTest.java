package Tugas34;

/*
 * Nama File : ArrayListTest.java
 * Nama : Muhammad Azka Subhan
 * NIM : 24060123130086
 */


import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();

        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");

        strings.remove("praktikum");

        for (String s : strings) {
            System.out.print(s+" ");
        }
    }
}
