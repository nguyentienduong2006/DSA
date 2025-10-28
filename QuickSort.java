import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class QuickSort {
    public void print(int[] arr) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void partition(int[] ar) {
        int pivot = ar[0];
        int[] left = new int[ar.length];
        int[] right = new int[ar.length];
        int l = 0, r = 0;

        for (int i = 1; i < ar.length; i++) {
            if (ar[i] < pivot)
                left[l++] = ar[i];
            else
                right[r++] = ar[i];
        }

        int[] result = new int[ar.length];
        int idx = 0;

        for (int i = 0; i < l; i++) result[idx++] = left[i];
        result[idx++] = pivot;
        for (int i = 0; i < r; i++) result[idx++] = right[i];

        print(result);
    }

}
