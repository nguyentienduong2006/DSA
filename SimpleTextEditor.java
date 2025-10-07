import java.util.*;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        StringBuilder text = new StringBuilder();
        Stack<String> history = new Stack<>();

        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();
            switch (type) {
                case 1:
                    history.push(text.toString());
                    text.append(sc.next());
                    break;
                case 2:
                    history.push(text.toString());
                    int k = sc.nextInt();
                    text.delete(text.length() - k, text.length());
                    break;
                case 3:
                    System.out.println(text.charAt(sc.nextInt() - 1));
                    break;
                case 4:
                    text = new StringBuilder(history.pop());
                    break;
            }
        }
    }
}
