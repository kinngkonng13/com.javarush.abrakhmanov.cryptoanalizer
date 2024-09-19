import java.io.IOException;
import java.util.ArrayList;

public class Cesar {
    private static int shift;
    private static String filePathIn;
    private static String filePathOut;
    private static ArrayList <Character> text;
    private static ArrayList <Character> cipher = new ArrayList<>();

    public static void setShift(int shift) {
        Cesar.shift = shift;
    }

    public static void setFilePathIn(String filePathIn) {
        Cesar.filePathIn = filePathIn;
    }

    public static void setFilePathOut(String filePathOut) {
        Cesar.filePathOut = filePathOut;
    }

    public static void coder(){
        try{
            text = FileManager.readTextFromFile(filePathIn);
        }
        catch (IOException e)
        {
            System.out.println("ОШИБКА!");
        }
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
        try {
            FileManager.writeTextToFile(filePathOut, cipher);
        }
        catch (IOException e)
        {
            System.out.println("ОШИБКА!");
        }
    }
    public static void decoder(){
        try{
            text = FileManager.readTextFromFile(filePathIn);
        }
        catch (IOException e)
        {
            System.out.println("ОШИБКА!");
        }
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
        try
        {
            FileManager.writeTextToFile(filePathOut, cipher);
        }catch (IOException e)
        {
            System.out.println("ОШИБКА");
        }
    }
}
