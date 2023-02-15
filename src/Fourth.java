public class Fourth {
    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        int c = 6;
        if ((a < c && a > b) || (a < b && a > c))
        {
            System.out.println(a + " - Середнє число");
        }
        else if ((b < c && b > a) || (b < a && b > c)) {
            System.out.println(b + " - Середнє число");
        }
        else if ((c < b && c > a) || (c < a && c > b)) {
            System.out.println(c + " - Середнє число");
        }
        else {
            System.out.println("Немає середнього числа");
        }
    }
}
