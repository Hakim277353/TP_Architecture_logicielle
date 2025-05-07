import java.util.ArrayList;
import java.util.List;

public class ParcOrdinateurs {
    private List<Ordinateur> ordinateurs;

    public ParcOrdinateurs() {
        this.ordinateurs = new ArrayList<>();
    }

    public void ajouterOrdinateur(Ordinateur ordinateur) {
        ordinateurs.add(ordinateur);
    }

    public List<Ordinateur> getOrdinateurs() {
        return ordinateurs;
    }
}
