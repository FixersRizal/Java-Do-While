package Segitiga;

public class SegitigaKebalik {
    public static void main(String[] args) {

        int t = 9;
        do {
            t++;
        } while (false);

        int b = t;
        do {
            int k = 1;
            do {
                System.out.print("* ");
                k++;
            } while (k <= b);

            System.out.println();
            b--;
        } while (b >= 1);
    }
}
