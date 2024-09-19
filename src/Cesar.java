import java.io.IOException;
import java.util.ArrayList;

public class Cesar {
    private static int shift;
    private String filePathIn;
    private static String filePathOut;
    private static ArrayList <Character> text;
    private static ArrayList <Character> cipher = new ArrayList<>();

    public Cesar(int shift, String filePathIn, String filePathOut) throws IOException {
        this.shift = shift;
        this.filePathIn = filePathIn;
        text = FileManager.readTextFromFile(filePathIn);
        this.filePathOut = filePathOut;
    }

    public void coder() {
        cipher.clear();
        for (Character character : text) {
            for (int i = 0; i < Alphabet.ALPHABET.length; i++) {
                {
                    if (character == Alphabet.ALPHABET[i]) {
                        if (i + shift >= 0)
                            cipher.add(Alphabet.ALPHABET[(i + shift) % Alphabet.ALPHABET.length]);
                        else
                            cipher.add(Alphabet.ALPHABET[(i + shift + Alphabet.ALPHABET.length) % Alphabet.ALPHABET.length]);
                    }
                }
            }
        }
        FileManager.writeTextToFile(filePathOut, cipher);
    }
    public void decoder()
    {
        cipher.clear();
        for (Character character : text) {
            for (int i = 0; i < Alphabet.ALPHABET.length; i++) {
                {
                    if (character == Alphabet.ALPHABET[i]) {
                        if (i - shift >= 0)
                            cipher.add(Alphabet.ALPHABET[(i - shift) % Alphabet.ALPHABET.length]);
                        else
                            cipher.add(Alphabet.ALPHABET[(i - shift + Alphabet.ALPHABET.length) % Alphabet.ALPHABET.length]);
                    }
                }
            }
        }
        FileManager.writeTextToFile(filePathOut, cipher);
    }
}
