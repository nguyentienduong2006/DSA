import java.util.*;

public class insertMedian {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            addNumber(num, maxPQ, minPQ);
            rebalance(maxPQ, minPQ);
            System.out.printf("%.1f\n", getMedian(maxPQ, minPQ));
        }
    }

    private static void addNumber(int num, PriorityQueue<Integer> maxPQ, PriorityQueue<Integer> minPQ) {
        if (maxPQ.isEmpty() || num <= maxPQ.peek()) {
            maxPQ.add(num);
        } else {
            minPQ.add(num);
        }
    }

    private static void rebalance(PriorityQueue<Integer> maxPQ, PriorityQueue<Integer> minPQ) {
        if (maxPQ.size() > minPQ.size() + 1) {
            minPQ.add(maxPQ.poll());
        } else if (minPQ.size() > maxPQ.size() + 1) {
            maxPQ.add(minPQ.poll());
        }
    }

    private static double getMedian(PriorityQueue<Integer> maxPQ, PriorityQueue<Integer> minPQ) {
        if (maxPQ.size() == minPQ.size()) {
            return (maxPQ.peek() + minPQ.peek()) / 2.0;
        } else if (maxPQ.size() > minPQ.size()) {
            return maxPQ.peek();
        } else {
            return minPQ.peek();
        }
    }
}
