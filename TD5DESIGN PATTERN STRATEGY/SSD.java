public class SSD implements Stockage {
    private int capacite;

    public SSD(int capacite) {
        this.capacite = capacite;
    }

    @Override
    public int capaciteStockage() {
        return capacite;
    }
}
