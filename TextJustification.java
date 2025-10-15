
import java.util.*;

public class TextJustification {
    public static void main(String[] args) {
        String[] words = {"yash", "is", "a", "very", "nice", "and", "intelligent","boy."};
        int highestWidth = 15;

        List<String> result = fullJustify(words, highestWidth);

        for (String line : result) {
            System.out.println("\"" + line + "\"");
        }
    }

    public static List<String> fullJustify(String[] words, int highestWidth) {
        List<String> result = new ArrayList<>();
        int t = 0;

        while (t < words.length) {
            int m = t + 1;
            int lineLength = words[t].length();

            
            while (m < words.length && (lineLength + 1 + words[m].length()) <= highestWidth) {
                lineLength += 1 + words[m].length();
                m++;
            }

            int totalWords = m - t;
            int totalChars = 0;
            for (int k = t; k < m; k++) {
                totalChars += words[k].length();
            }

            int spaces = highestWidth - totalChars;
            StringBuilder line = new StringBuilder();

            
            if (m == words.length || totalWords == 1) {
                for (int k = t; k < m; k++) {
                    line.append(words[k]);
                    if (k < m - 1) line.append(" ");
                }
                
                while (line.length() < highestWidth) {
                    line.append(" ");
                }
            } else {
            
                int spaceBetween = spaces / (totalWords - 1);
                int extraSpaces = spaces % (totalWords - 1);

                for (int k = t; k < m; k++) {
                    line.append(words[k]);
                    if (k < m - 1) {
                        for (int s = 0; s < spaceBetween; s++) line.append(" ");
                        if (extraSpaces > 0) {
                            line.append(" ");
                            extraSpaces--;
                        }
                    }
                }
            }

            result.add(line.toString());
            t = m; 
        }

        return result;
    }
}