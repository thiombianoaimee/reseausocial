
public class Notification {
    private String message;
    private Utilisateur destinataire;
    private boolean lue;

    public Notification(String message, Utilisateur destinataire) {
        this.message = message;
        this.destinataire = destinataire;
        this.lue = false;
    }

    // Getters et setters
    public String getMessage() {
        return message;
    }

    public Utilisateur getDestinataire() {
        return destinataire;
    }

    public boolean isLue() {
        return lue;
    }

    public void setLue(boolean lue) {
        this.lue=lue;
  }
}