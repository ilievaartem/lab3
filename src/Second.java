import java.util.Scanner;

public class Second {
    public static void main(String[] arg) {
        float a = 2;
        float b = 3;

        Scanner scan = new Scanner(System.in);
        System.out.println("You have thous numbers = " + a + " " + b);
        System.out.println("Enter the number that will be responsible for the action: " +
                "1 - it is addition; " +
                "2 - it is subtraction; " +
                "3 - it is multiplication; " +
                "4 - it is division.");
        int num = scan.nextInt();

        if (num < 1 || num > 4) {
            System.out.println("There is no such action here");
        } else if (num == 1) {
            System.out.println(a+b);
        }
        else if (num == 2) {
            System.out.println(a-b);
        }
        else if (num == 3) {
            System.out.println(a*b);
        }
        else if (num == 4) {
            System.out.println(a/b);
        }
    }
}