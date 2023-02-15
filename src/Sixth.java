import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        System.out.println("Write your number of the ticket");

        Scanner scan = new Scanner(System.in);
        String numTick;
        while (true) {
            numTick = scan.nextLine();
            if (numTick.length()==6) {
                break;
            } else {
                System.out.println("You didn't write 6 numbers");
            }
        }
        if (numTick.charAt(0)+numTick.charAt(1)+numTick.charAt(2) == numTick.charAt(3)+numTick.charAt(4)+numTick.charAt(5)){
            System.out.println("Wow, you are so lucky person");
        } else {
            System.out.println("Don't be upset, you are not unlucky person :(");
        }
    }
}
