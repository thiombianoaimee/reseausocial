import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterfaceUtilisateur extends JFrame {
    private RéseauSocial reseau;

    public InterfaceUtilisateur(RéseauSocial reseau) {
        this.reseau = reseau;
        setTitle("Réseau Social");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Ajouter des composants UI ici...

        setVisible(true);
    }

    // Méthodes pour gérer les interactions...
}

public void ajouterAmi(Utilisateur utilisateur) throws Exception {
    if (amis.contains(utilisateur)) {
        throw new Exception("Ami déjà présent.");
    }
    // Ajouter l'ami...
}