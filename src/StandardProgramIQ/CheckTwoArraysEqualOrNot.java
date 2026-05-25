package StandardProgramIQ;

import java.util.Arrays;

public class CheckTwoArraysEqualOrNot {

    private static boolean checkEqualityChar(char[] A, char[] B) {
        if (A.length != B.length) return false;
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < A.length; i++) {
            if (A[i] != B[i])
                return false;
        }
        return true;
    }


    private static boolean checkEqualityInteger(int[] a, int[] b) {
        if (a.length != b.length) return false;
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 6};
        int[] b = {5, 3, 6, 2, 4};

        boolean resultInteger = checkEqualityInteger(a, b);
        System.out.println(resultInteger);

        char[] A = {'b','a','c','d'};
        char[] B = {'c','d','e','a'};
        boolean resultChar = checkEqualityChar(A, B);
        System.out.println(resultChar);

    }
}
