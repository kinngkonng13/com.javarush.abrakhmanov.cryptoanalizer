import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        String pathToFileIn = "";
        String pathToFileOut = "";
        int shift = 0;
        int variable = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            variable = AppMain.printMenu(scanner);

            switch (variable) {
                case 1:
                    System.out.println("Введите адрес файла с которого будет считан текст");
                    pathToFileOut = scanner.nextLine();
                    System.out.println("Введите адрес файла в который будет записан текст");
                    pathToFileOut = scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Введите адрес файла с которого будет считан текст");
                    pathToFileOut = scanner.nextLine();
                    System.out.println("Введите адрес файла в который будет записан текст");
                    pathToFileOut = scanner.nextLine();

                    try {
                        do {
                            System.out.println("Введите ключ");
                            shift = Integer.parseInt(scanner.nextLine());
                        } while (shift < 0 || shift > 33);
                    } catch (NumberFormatException e) {
                        System.out.println("Вы ввели не цифру!");
                    }
                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("До свидания!");
                    System.exit(0);
            }
        }while (variable != 4);

    }

    public static int printMenu( Scanner scanner)
    {
        System.out.println("\t\t\t\tШИФР ЦЕЗАРЯ");
        System.out.println("Выберите действие:");
        System.out.println("1. Зашифровать текст");
        System.out.println("2. Расшифровать текст с помощью ключа");
        System.out.println("3. ");
        System.out.println("4. Выход");

        int variable = 0;
        try {
            do {
                variable = Integer.parseInt(scanner.nextLine());
            }while (variable < 1 || variable > 4);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Вы ввели не цифру!");
        }
        return variable;
    }
}
