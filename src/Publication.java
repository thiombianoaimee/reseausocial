import java.util.ArrayList;
import java.util.List;

public class Publication {
    private String contenu;
    private List<Commentaire> commentaires;

    public Publication(String contenu) {
        this.contenu = contenu;
        this.commentaires = new ArrayList<>();
    }

    public void ajouterCommentaire(Commentaire commentaire) {
        commentaires.add(commentaire);
    }

    public int getNombreCommentaires() {
        return commentaires.size();
    }

    // Getters et autres méthodes...
}