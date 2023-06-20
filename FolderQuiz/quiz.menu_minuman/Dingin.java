package quiz.menu_minuman;

public class Dingin extends Minuman {
    private String name;
    private int harga;

    public Dingin(String name, int harga) {
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

    public void drinks() {
        // Add your implementation for the drinks() method
    }
}
