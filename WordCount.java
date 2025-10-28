import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> words = new ArrayList<>();
        List<Integer> counts = new ArrayList<>();

        while (sc.hasNext()) {
            String word = sc.next().toLowerCase().replaceAll("[^a-z0-9]", "");
            if (word.isEmpty()) continue;

            int index = words.indexOf(word);
            if (index == -1) {
                words.add(word);
                counts.add(1);
            } else {
                counts.set(index, counts.get(index) + 1);
            }
        }

        List<String> sorted = new ArrayList<>(words);
        Collections.sort(sorted);

        for (String w : sorted) {
            int idx = words.indexOf(w);
            System.out.println(w + " " + counts.get(idx));
        }
    }
}
