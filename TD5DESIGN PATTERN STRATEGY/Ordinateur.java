public class Ordinateur {
    private Stockage stockage;
    private StrategieStockage strategieStockage;

    public Ordinateur(Stockage stockage, StrategieStockage strategieStockage) {
        this.stockage = stockage;
        this.strategieStockage = strategieStockage;
    }

    public void changerStrategieStockage(StrategieStockage nouvelleStrategie) {
        this.strategieStockage = nouvelleStrategie;
    }

    public int calculerEspaceOccupe(int espaceLibre) {
        return strategieStockage.calculerEspaceOccupe(espaceLibre);
    }

    public int getCapaciteStockage() {
        return stockage.capaciteStockage();
    }
}
