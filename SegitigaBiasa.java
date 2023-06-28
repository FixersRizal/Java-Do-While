package Segitiga;

public class SegitigaBiasa {
    public static void main(String[] args) {

        int t = 9;
        do {
            t++;
        } while (false);

        int b = 1;
        do {
            int k = 1;
            do {
                System.out.print("* ");
                k++;
            } while (k <= b);

            System.out.println();
            b++;
        } while (b <= t);
    }
}
