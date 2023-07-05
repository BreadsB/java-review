package org.breadsb;

import java.util.Arrays;
import java.util.Random;

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

    static class Numbers {
        static void getFirstDigitFromInt(int a) {

        }

        static void getFristDigitFromLong(int a) {

        }

        static void reduceLengthOfInt(int a) {

        }

        static int[] arrayFromInt(int a) {
            int[] arr = String.valueOf(a).chars().map(n->Character.getNumericValue(n)).toArray();
            return arr;
        }

        static StringBuilder stringBuilderFromInt(int a) {
            StringBuilder b = new StringBuilder().append(a);
            return b;
        }

        static void makeHelper() {
//            Create private method named as helper
//            If you want to pass from long to String
        }

        static void signum() {
            int signum1 = Long.signum(2525L);
            int signum2 = Long.signum(0L);
            int signum3 = Long.signum(-500L);
            System.out.println("This is example of using signum: " + signum1 + ", " + signum2 + ", " + signum3);
        }
    }

    public static String generateRandomLicenceNumbers(int groups, int charactersPerGroup) {
        StringBuilder result = new StringBuilder();

        Random random = new Random();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        for (int i = 0; i < groups; i++) {
            for (int j = 0; j < charactersPerGroup; j++) {
                int randomIndex = random.nextInt(characters.length());
                char randomChar = characters.charAt(randomIndex);
                result.append(randomChar);
            }

            if (i != groups - 1) {
                result.append("-");
            }
        }

        return result.toString();
    }
}