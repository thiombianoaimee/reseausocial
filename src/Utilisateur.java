import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utilisateur {
    private final String nom; // Champ final
    private final int age; // Champ final
    private final List<Utilisateur> amis; // Champ final
    private final List<Publication> publications; // Champ final

    public Utilisateur(String nom, int age) {
        this.nom = nom;
        this.age = age;
        this.amis = new ArrayList<>();
        this.publications = new ArrayList<>();
    }

    // Méthodes pour ajouter des amis, publier, etc.
    public void ajouterAmi(Utilisateur utilisateur) {
        if (!amis.contains(utilisateur) && !utilisateur.equals(this)) {
            amis.add(utilisateur);
            utilisateur.ajouterAmi(this); // Ajout réciproque
        }
    }

    public void publier(Publication publication) {
        publications.add(publication);
    }

    // Getters
    public String getNom() {
        return nom; // Méthode pour obtenir le nom
    }

    public int getAge() {
        return age; // Méthode pour obtenir l'âge
    }

    public List<Utilisateur> getAmis() {
        return Collections.unmodifiableList(amis); // Retourne une liste non modifiable
    }

    public List<Publication> getPublications() {
        return Collections.unmodifiableList(publications); // Retourne une liste non modifiable
    }
}
