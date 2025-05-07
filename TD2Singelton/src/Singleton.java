public class Singleton {

    public static void main(String[] args){
        Logger logger = Logger.getInstance();

        logger.log("Début de l'application");
        logger.log("Les 2 LIG sont paresseux");
        logger.log("Cours AL: Singleton");
        logger.log("Fin de l'application");

        logger.close();
    }
}
