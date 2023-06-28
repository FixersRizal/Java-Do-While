package Segitiga;

public class PersegiPanjang {
    public static void main(String[] args) {

        int p = 9;
        int l = 9;

        do {
            p++;
            l++;
        } while (false);

        int b = 1;
        do {
            int k = 1;
            do {
                System.out.print("* ");
                k++;
            } while (k <= l);

            System.out.println();
            b++;
        } while (b <= p);
    }
}
