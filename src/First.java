import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть номер місяця");
        int month = scanner.nextInt();
        if (month <= 12 && month >= 1) {
            if (month == 12 || month <= 2) {
                System.out.println("Це зима");
            } else if (month >= 3 && month <= 5) {
                System.out.println("Це весна");
            } else if (month >= 6 && month <= 8) {
                System.out.println("Це літо");
            } else if (month >= 9 && month <= 11) {
                System.out.println("Це осінь");
            }
        }
        else {
            System.out.println("Такого місяця не існує");
        }
    }
}