import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your rating");
        int mark = scanner.nextInt();
        if (mark >= 90 && mark <= 100)
        {
            System.out.println("Your grade is A.");
        } else if (mark >= 82 && mark <= 89) {
            System.out.println("Your grade is B.");
        }
        else if (mark >= 75 && mark <= 81) {
            System.out.println("Your grade is C.");
        }
        else if (mark >= 64 && mark <= 74) {
            System.out.println("Your grade is D.");
        }
        else if (mark >= 60 && mark <= 63) {
            System.out.println("Your grade is E.");
        }
        else if (mark >= 35 && mark <= 59) {
            System.out.println("Your Fx rating is with the option of retaking.");
        }
        else if (mark >= 1 && mark <= 34) {
            System.out.println("Your grade is F with mandatory retake.");
        }
        else {
            System.out.println("Don't mess around with that");
        }
    }
}
