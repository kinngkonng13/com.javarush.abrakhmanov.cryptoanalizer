import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    //Считывание с файла
    public static ArrayList<Character> readTextFromFile(String filePath){
        ArrayList<Character> inputList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            int c;
            while ((c = bufferedReader.read()) != -1) {
                inputList.add((char) c);
            }
        } catch (IOException e) {
            System.out.println("ОШИБКА!!!");
        }
        return inputList;
    }

    // Запись в файл
    public static void writeTextToFile(String filePath, ArrayList<Character> list){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Character c : list) {
                writer.write(c);
            }
        } catch (IOException e) {
            System.out.println("ОШИБКА!");
        }
    }
}
