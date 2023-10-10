public class PangramCheck {
    public static void main(String[] args) {
        String inputSentence = "The quick brown fox jumps over the lazy dog";
        boolean result = isPangram(inputSentence);
        if (result) {
            System.out.println("The input sentence is a pangram.");
        } else {
            System.out.println("The input sentence is not a pangram.");
        }
    }

    public static boolean isPangram(String sentence) {
        sentence = sentence.toLowerCase();
        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if ('a' <= c && c <= 'z') {
                alphabet[c - 'a'] = true;
            }
        }

        for (boolean letter : alphabet) {
            if (!letter) {
                return false;
            }
        }

        return true;
    }
}