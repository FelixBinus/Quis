package quiz.menu_makanan;

public class Mie extends Makanan {
    private String[] namamie;
    private int[] harga;

    public Mie(String[] namamie, int[] harga) {
        this.namamie = namamie;
        this.harga = harga;
    }

    @Override
    public String getName() {
        return ""; // Replace with your logic to get the appropriate name
    }

    @Override
    public int getHarga() {
        return 0; // Replace with your logic to get the appropriate price
    }

    public void food() {
        // Add your implementation for the food() method
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < namamie.length; i++) {
            sb.append("Mie: ").append(namamie[i]).append(", Harga: ").append(harga[i]).append("\n");
        }
        return sb.toString();
    }
}
