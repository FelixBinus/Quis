import java.util.Scanner;
import quiz.menu_makanan.Mie;
import quiz.menu_makanan.Soto;
import quiz.menu_minuman.Dingin;
import quiz.menu_minuman.Panas;

public class Main {
    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);
        System.out.println("          Restaurant");
        System.out.println("      ====================");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");

        int input = choice.nextInt();

        switch (input) {
            case 1:
                String[] namamie = {"Mie Goreng", "Mie Rebus", "Mie Ayam"};
                int[] hargaMie = {10, 15, 200};
                Mie mie = new Mie(namamie, hargaMie);
                Soto soto = new Soto("Soto Ayam", 8);

                System.out.println(mie);
                break;
            case 2:
                String[] namadingin = {"Es Jeruk", "Es Buah", "Jus Alpukat"};
                int[] hargaDingin = {10, 15, 200};
                Dingin dingin = new Dingin(namadingin[0], hargaDingin[0]);
                Panas panas = new Panas("Teh Panas", 5);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
