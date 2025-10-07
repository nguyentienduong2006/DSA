import java.util.*;

public class MyQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();
            switch (type) {
                case 1:
                    int x = sc.nextInt();
                    stack1.push(x);
                    break;

                case 2:
                    if (stack2.isEmpty()) {
                        while (!stack1.isEmpty()) {
                            stack2.push(stack1.pop());
                        }
                    }
                    if (!stack2.isEmpty()) stack2.pop();
                    break;

                case 3:
                    if (stack2.isEmpty()) {
                        while (!stack1.isEmpty()) {
                            stack2.push(stack1.pop());
                        }
                    }
                    if (!stack2.isEmpty())
                        System.out.println(stack2.peek());
                    break;
            }
        }
        sc.close();
    }
}
