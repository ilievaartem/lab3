public class Seventh {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 3;
        int d = 4;

        if (a>b && b>c && c>d){
            System.out.println(Math.pow(a, 2));
            System.out.println(Math.pow(b, 2));
            System.out.println(Math.pow(c, 2));
            System.out.println(Math.pow(d, 2));
        } else if (a<b && b<c && c<d) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
        } else {
            System.out.println(a*10);
            System.out.println(b*10);
            System.out.println(c*10);
            System.out.println(d*10);
        }
    }
}
