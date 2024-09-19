import java.util.Scanner;

public class BruteForce {
    public static void decoding()
    {
        Scanner scanner = new Scanner(System.in);
        int shift = 0;
        int variable = 0;

        System.out.println("Введите адрес файла с которого будет считан текст");
        String pathIn = scanner.nextLine();
        System.out.println("Введите адрес файла в который будет записан текст");
        String pathOut = scanner.nextLine();

        while (true)
        {
            Cesar.setShift(shift);
            Cesar.setFilePathIn(pathIn);
            Cesar.setFilePathOut(pathOut);

            Cesar.decoder();
            System.out.println("Метод ХУЙНЯ");
            try {
                do {
                    System.out.println("Правильно ли расшифрован текст?\n1. Да\n2. Нет");
                    variable = Integer.parseInt(scanner.nextLine());
                } while (variable < 1 || variable > 2);
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не цифру! Программа перезапускается!");
            }
            if (variable == 1) break;
            else shift++;
        }
    }
}
