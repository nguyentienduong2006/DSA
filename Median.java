public class Median {
    static int findMedian(int[] arr, int low, int high, int k) {
        if (low == high)
            return arr[low];

        int pivotIndex = partition(arr, low, high);

        if (pivotIndex == k)
            return arr[pivotIndex];
        else if (pivotIndex > k)
            return findMedian(arr, low, pivotIndex - 1, k);
        else
            return findMedian(arr, pivotIndex + 1, high, k);
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
    //Do phuc tap
    //trung binh: O(n)
    //tot nhat: O(n)
    //te nhat: O(n^2)
}
