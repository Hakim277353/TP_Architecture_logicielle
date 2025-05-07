public class StrategieCompression implements StrategieStockage {
    @Override
    public int calculerEspaceOccupe(int espaceLibre) {
        return (int)(espaceLibre * 0.8); // 20% compression
    }
}
