import java.time.LocalDateTime;

public class message {
    private final String contenu;
    private final Utilisateur expediteur;
    private final Utilisateur destinataire;
    private final LocalDateTime dateEnvoi;

    public message(String contenu, Utilisateur expediteur, Utilisateur destinataire) {
        this.contenu = contenu;
        this.expediteur = expediteur;
        this.destinataire = destinataire;
        this.dateEnvoi = LocalDateTime.now();
    }

    // Getters et setters
    public String getContenu() {
        return contenu;
    }

    public Utilisateur getExpediteur() {
        return expediteur;
    }

    public Utilisateur getDestinataire() {
        return destinataire;
    }

    public LocalDateTime getDateEnvoi() {
        return dateEnvoi;
 }
}