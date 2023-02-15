import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість грибів");
        int kmushrooms = scanner.nextInt();
        if (( kmushrooms % 10 == 0 ) || (kmushrooms > 4 && kmushrooms <= 20) || (kmushrooms % 10 >= 5))
        {
            System.out.println("Ви знайшли в лісі " + kmushrooms + " грибів.");
        }
        else if (kmushrooms % 10 == 1) {
            System.out.println("Ви знайшли в лісі " + kmushrooms + " гриб.");
        }
        else if ((kmushrooms % 10 == 2) || (kmushrooms % 10 == 3) || (kmushrooms % 10 == 4)) {
            System.out.println("Ви знайшли в лісі " + kmushrooms + " гриба.");
        } else if (kmushrooms == 0 ) {
            System.out.println("Ви не знайшли жодного гриба.");
        }
        else {
            System.out.println("Така кількість грибів не можлива");
        }
    }
}