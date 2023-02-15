import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість грибів");
        int kmushrooms = scanner.nextInt();
        if ( kmushrooms > 4)
        {
            System.out.println("Ви знайшли в лісі " + kmushrooms + " грибів.");
        }
        else if (kmushrooms == 1) {
            System.out.println("Ви знайшли в лісі " + kmushrooms + " гриб.");
        }
        else if (kmushrooms == 2 || kmushrooms == 3 || kmushrooms == 4) {
            System.out.println("Ви знайшли в лісі " + kmushrooms + " гриба.");
        } else if (kmushrooms == 0 ) {
            System.out.println("Ви не знайшли жодного гриба.");
        }
        else {
            System.out.println("Така кількість грибів не можлива");
        }
    }
}