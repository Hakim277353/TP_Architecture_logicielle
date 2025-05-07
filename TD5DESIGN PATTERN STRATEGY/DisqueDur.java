public class DisqueDur implements Stockage {
    private int capacite;

    public DisqueDur(int capacite) {
        this.capacite = capacite;
    }

    @Override
    public int capaciteStockage() {
        return capacite;
    }
}
