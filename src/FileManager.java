import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.nio.file.Files.createFile;
import static java.nio.file.Files.exists;

public class FileManager {

    //Считывание с файла
    public static ArrayList<Character> readTextFromFile(String filePath) throws IOException {
        ArrayList<Character> inputList = new ArrayList<>();

        Path path = Paths.get(filePath);
        if (exists(path))
        {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path.toFile()))) {
                int c;
                while ((c = bufferedReader.read()) != -1) {
                    inputList.add((char) c);
                }
            } catch (IOException e) {
                System.out.println("ОШИБКА!!!");
            }
        }
        else {
            Path pathNew = createFile(path);
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathNew.toFile()))) {
                int c;
                while ((c = bufferedReader.read()) != -1) {
                    inputList.add((char) c);
                }
            } catch (IOException e) {
                System.out.println("ОШИБКА!!!");
            }
        }

        return inputList;
    }

    // Запись в файл
    public static void writeTextToFile(String filePath, ArrayList<Character> list) throws IOException {
        Path path = Paths.get(filePath);
        if (exists(path))
        {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(path.toFile()))) {
                for (Character c : list) {
                    writer.write(c);
                }
            } catch (IOException e) {
                System.out.println("ОШИБКА!");
            }
        }
        else
        {
            Path pathNew = createFile(path);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathNew.toFile()))) {
                for (Character c : list) {
                    writer.write(c);
                }
            } catch (IOException e) {
                System.out.println("ОШИБКА!");
            }
        }
    }
}
