import java.util.HashMap;
import java.util.Map;

class Scrabble {
    private final String word;
    private static final Map<Integer,Integer> score = new HashMap<>(26);
    static {
        "AEIOULNRST".chars().forEach(c -> score.put(c, 1));
        "DG".chars().forEach(c -> score.put(c, 2));
        "BCMP".chars().forEach(c -> score.put(c, 3));
        "FHVWY".chars().forEach(c -> score.put(c, 4));
        "K".chars().forEach(c -> score.put(c, 5));
        "JX".chars().forEach(c -> score.put(c, 8));
        "QZ".chars().forEach(c -> score.put(c, 10));
    }

    Scrabble(String word) {
        this.word = word.toUpperCase();
    }

    int getScore() {
        return word.chars().reduce(0, (a, b) -> a + score.get(b));
    }

    public static void main(String[] args) {
        Scrabble scrabble = new Scrabble("Hello");
        System.out.println(scrabble.getScore()); // Outputs: 8
    }
}
