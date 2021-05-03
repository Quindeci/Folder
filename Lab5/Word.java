<<<<<<< HEAD
package lab5;
import java.util.ArrayList;

public class Word {
    private String word;

    ArrayList<Letter> letter = new ArrayList<Letter>();

    Word(String text) {
        this.word = text;
        ArrayList<Punctuation> punctuations = new ArrayList<Punctuation>();
        for (int j = 0; j < this.word.length(); j++) {
            if (this.word.charAt(j) == '-' || this.word.charAt(j) == ',') {
                punctuations.add(new Punctuation(text.charAt(j)));
            } else {
                this.letter.add(new Letter(text.charAt(j)));
            }

        }
    }
    protected String getWord() {
        return this.word;
    }
}
=======
package lab5;
import java.util.ArrayList;

public class Word {
    private String word;

    ArrayList<Letter> letter = new ArrayList<Letter>();

    Word(String text) {
        this.word = text;
        ArrayList<Punctuation> punctuations = new ArrayList<Punctuation>();
        for (int j = 0; j < this.word.length(); j++) {
            if (this.word.charAt(j) == '-' || this.word.charAt(j) == ',') {
                punctuations.add(new Punctuation(text.charAt(j)));
            } else {
                this.letter.add(new Letter(text.charAt(j)));
            }

        }
    }
    protected String getWord() {
        return this.word;
    }
}
>>>>>>> 5475da8e9b27a9b6fb08490f523efff360575ee0
