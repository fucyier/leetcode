import java.util.ArrayList;
import java.util.List;

public class Algorithms1408 {

    public static List<String> stringMatching(String[] words) {
        List<String> newList = new ArrayList<>();
        for (String word : words) {
            for (int i = 0; i < words.length; i++)
                if (words[i].length() != word.length() && words[i].contains(word) && !newList.contains(word))
                    newList.add(word);
        }
        return newList;
    }

    public static void main(String... args) {
        String[] words = {"mass", "as", "hero", "superhero"};
        System.out.println(stringMatching(words));
    }
}
