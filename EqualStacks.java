import java.util.*;

public class EqualStacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();

        Stack<Integer> s1 = readStack(sc, n1);
        Stack<Integer> s2 = readStack(sc, n2);
        Stack<Integer> s3 = readStack(sc, n3);

        int h1 = sum(s1), h2 = sum(s2), h3 = sum(s3);

        while (!(h1 == h2 && h2 == h3)) {
            if (h1 >= h2 && h1 >= h3) h1 -= s1.pop();
            else if (h2 >= h1 && h2 >= h3) h2 -= s2.pop();
            else h3 -= s3.pop();
        }

        System.out.println(h1);
    }

    static Stack<Integer> readStack(Scanner sc, int n) {
        Stack<Integer> s = new Stack<>();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int i = n - 1; i >= 0; i--) s.push(arr[i]);
        return s;
    }

    static int sum(Stack<Integer> s) {
        int sum = 0;
        for (int x : s) sum += x;
        return sum;
    }
}
