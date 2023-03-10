package org.breadsb;

import java.util.Arrays;

public class Addons {

    static class ArrayLearning {

        void resizeArrayUsingCopyOf() {
//        Resize array, remove last index
            int[] arr = new int[] {7, 5, 7, 10, 4};
            int[] result = Arrays.copyOf(arr, arr.length-1);
            System.out.println(result);
        }

        void resizeArrayUsingSystemArrayCopy() {
            int[] arr = new int[] {7, 5, 7, 10, 4};
            int[] result = new int[arr.length-1];
            System.arraycopy(arr,1, result, 0, result.length);
            System.out.println(result);
        }

        void resizeArrayUsingCopyOfRange() {
            int[] arr = new int[] {7, 5, 7, 10, 4};
            int[] result = Arrays.copyOfRange(arr, 1, arr.length);
            System.out.println(result);
        }

        void resizeArrayUsingObjectClone() {
            int[] arr = new int[] {7, 5, 7, 10, 4};
            int[] result = arr.clone();
            System.out.println(result);
        }
    }

    static class Strings {

        static void convertStringToByteArray(String s) {
            byte[] bArr = s.getBytes();
            System.out.println(bArr);
            System.out.println(Arrays.toString(bArr));
        }

        static void usingNewFunctions() {
            String s = "aaaaa";
            s.getBytes(); // What for is getBytes, where can i use it?
            s.intern(); // What is intern for?
//            s.getChars();
        }

    }
}
