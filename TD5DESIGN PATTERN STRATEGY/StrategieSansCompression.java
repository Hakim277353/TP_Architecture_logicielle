public class StrategieSansCompression implements StrategieStockage {
    @Override
    public int calculerEspaceOccupe(int espaceLibre) {
        return espaceLibre; // No compression
    }
}
