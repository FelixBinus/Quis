package quiz.menu_makanan;

public class Soto extends Makanan {
    private String name;
    private int harga;

    public Soto(String name, int harga) {
        this.name = name;
        this.harga = harga;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getHarga() {
        return this.harga;
    }

    public void food() {
        // Add your implementation for the food() method
    }
}
