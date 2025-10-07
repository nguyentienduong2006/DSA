import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; ++i) {
            int minIndex = i;
            for (int j = i + 1; j < n; ++j) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int tmp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = tmp;

            System.out.print("Step " + (i + 1) + ": ");
            for (int num : arr) {
                System.out.print(num);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.print("Sorted Arr: ");
        for (int num : arr) {
            System.out.print(num);
            System.out.print(" ");
        }
    }
}
