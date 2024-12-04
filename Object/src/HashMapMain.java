import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args) {
        String text = "tomorrow is tomorrow and today is tomorrow";
        String[] words = text.split(" ");

        HashMap<String, Integer> counts = new HashMap<>();

        for (String word : words) {
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }
        System.out.println(counts);
    }
}
