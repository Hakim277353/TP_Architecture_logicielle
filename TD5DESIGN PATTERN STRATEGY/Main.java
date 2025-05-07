public class Main {
    public static void main(String[] args) {
        // Create storage devices
        Stockage disqueDur = new DisqueDur(1000);
        Stockage ssd = new SSD(500);

        // Create storage strategies
        StrategieStockage compression = new StrategieCompression();
        StrategieStockage sansCompression = new StrategieSansCompression();

        // Create computers with different configurations
        Ordinateur ordi1 = new Ordinateur(disqueDur, compression);
        Ordinateur ordi2 = new Ordinateur(ssd, sansCompression);

        // Create computer park and add computers
        ParcOrdinateurs parc = new ParcOrdinateurs();
        parc.ajouterOrdinateur(ordi1);
        parc.ajouterOrdinateur(ordi2);

        // Test storage calculations
        System.out.println("Ordi1 espace occupé: " + ordi1.calculerEspaceOccupe(100));
        System.out.println("Ordi2 espace occupé: " + ordi2.calculerEspaceOccupe(100));

        // Change strategy for ordi1
        ordi1.changerStrategieStockage(sansCompression);
        System.out.println("Ordi1 espace occupé après changement: " + ordi1.calculerEspaceOccupe(100));
    }
}
