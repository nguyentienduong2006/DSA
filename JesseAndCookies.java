import java.util.*;

public class JesseAndCookies {

    public static int cookies(int k, List<Integer> A) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(A);
        int operations = 0;

        while (pq.size() > 1 && pq.peek() < k) {
            int m1 = pq.poll();
            int m2 = pq.poll();
            int newSweet = m1 + 2 * m2;
            pq.add(newSweet);
            operations++;
        }

        if (pq.peek() != null && pq.peek() >= k)
            return operations;
        else
            return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        List<Integer> cookies = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            cookies.add(scanner.nextInt());
        }

        int result = cookies(K, cookies);
        System.out.println(result);
    }
}
