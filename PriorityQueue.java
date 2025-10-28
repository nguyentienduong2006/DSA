class PriorityQueue {
    private int[] arr;
    private int size;
    private int capacity;

    public PriorityQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
    }

    public void insert(int x) {
        if (size == capacity) {
            System.out.println("Full!");
            return;
        }
        arr[size++] = x;
    }

    public int deleteMin() {
        if (size == 0) {
            System.out.println("Empty!");
            return -1;
        }

        int minIndex = 0;
        for (int i = 1; i < size; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        int minVal = arr[minIndex];
        arr[minIndex] = arr[size - 1];
        size--;
        return minVal;
    }

    public void printQueue() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
