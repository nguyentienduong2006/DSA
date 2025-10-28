public class insertIntoSorted {
    public void print(int[] arr) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public void insertIntoSorted(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                print(arr);
            }
            arr[j + 1] = key;
            print(arr);
        }
    }
}
