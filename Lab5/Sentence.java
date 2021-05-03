<<<<<<< HEAD
package lab5;
import java.util.ArrayList;

public class Sentence {
    protected String sentenc;
    ArrayList<Word> word = new ArrayList<Word>();

    Sentence(String txt) {
        this.sentenc = txt;


        for (String word_iter : this.sentenc.split(" ")) {
            this.word.add(new Word(word_iter));

        }
    }
}
=======
package lab5;
import java.util.ArrayList;

public class Sentence {
    protected String sentenc;
    ArrayList<Word> word = new ArrayList<Word>();

    Sentence(String txt) {
        this.sentenc = txt;


        for (String word_iter : this.sentenc.split(" ")) {
            this.word.add(new Word(word_iter));

        }
    }
}
>>>>>>> 5475da8e9b27a9b6fb08490f523efff360575ee0
