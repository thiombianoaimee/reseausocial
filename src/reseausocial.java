import java.util.ArrayList;
import java.util.List;

public class RéseauSocial {
    private List<Utilisateur> utilisateurs;

    public RéseauSocial() {
        utilisateurs = new ArrayList<>();
    }

    public void ajouterUtilisateur(Utilisateur utilisateur) {
        utilisateurs.add(utilisateur);
    }

    public Utilisateur rechercherUtilisateur(String nom) {
        for (Utilisateur u : utilisateurs) {
            if (u.getNom().equalsIgnoreCase(nom)) {
                return u;
            }
        }
        return null; // Non trouvé
    }

    // Autres méthodes pour gérer les relations d’amitié...
}