import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class introTutorial {
    public static int introTutorial(int V, List<Integer> arr) {
        int low = 0;
        int high = arr.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) < V) {
                low = mid + 1;
            }
            else if (arr.get(mid) > V) {
                high = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
