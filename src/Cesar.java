import java.util.ArrayList;

public class Cesar {
    private int shift;
    String filePathIn;
    String filePathOut;
    ArrayList <Character> cipher;

    public Cesar(int shift, String filePathIn, String filePathOut)
    {
        this.shift = shift;
        this.filePathIn = filePathIn;
        cipher = FileManager.readTextFromFile(filePathIn);
        this.filePathOut = filePathOut;
    }

    public static void coder()
    {

    }

}
