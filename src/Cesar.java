import java.util.ArrayList;

public class Cesar {
    private static int shift;
    private String filePathIn;
    private static String filePathOut;
    private static ArrayList <Character> text;
    private static ArrayList <Character> cipher = new ArrayList<>();

    public Cesar(int shift, String filePathIn, String filePathOut)
    {
        this.shift = shift;
        this.filePathIn = filePathIn;
        text = FileManager.readTextFromFile(filePathIn);
        this.filePathOut = filePathOut;
    }

    public void coder() {
        for (Character character : text) {
            for (int i = 0; i < Alphabet.ALPHABET.length; i++) {

                {
                    if (character == Alphabet.ALPHABET[i]) {
                        cipher.add (Alphabet.ALPHABET[(i + shift) % Alphabet.ALPHABET.length]);
                    }
                }
            }
        }
        FileManager.writeTextToFile(filePathOut, cipher);
    }
    public void decoder()
    {

    }
}
