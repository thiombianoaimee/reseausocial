import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReseauSocial reseau = new ReseauSocial();
        Scanner scanner = new Scanner(System.in);

        // Exemple d'ajout d'utilisateurs
        Utilisateur alice = new Utilisateur("Alice", 25);
        Utilisateur bob = new Utilisateur("Bob", 30);
        reseau.ajouterUtilisateur(alice);
        reseau.ajouterUtilisateur(bob);

        // Interface utilisateur simple
        while (true) {
            System.out.println("1. Ajouter un utilisateur");
            System.out.println("2. Rechercher un utilisateur");
            System.out.println("3. Envoyer un message privé");
            System.out.println("4. Lire les messages reçus");
            System.out.println("5. Quitter");
            int choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la nouvelle ligne

            if (choix == 1) {
                System.out.print("Nom: ");
                String nom = scanner.nextLine();
                System.out.print("Âge: ");
                int age = scanner.nextInt();
                scanner.nextLine(); // Consommer la nouvelle ligne
                Utilisateur utilisateur = new Utilisateur(nom, age);
                reseau.ajouterUtilisateur(utilisateur);
                System.out.println("Utilisateur ajouté.");
            } else if (choix == 2) {
                System.out.print("Nom: ");
                String nom = scanner.nextLine();
                Utilisateur utilisateur = reseau.rechercherUtilisateurParNom(nom);
                if (utilisateur != null) {
                    System.out.println("Utilisateur trouvé: " + utilisateur.getNom() + ", Âge: " + utilisateur.getAge());
                } else {
                    System.out.println("Utilisateur non trouvé.");
                }
            } else if (choix == 3) {
                System.out.print("Nom de l'expéditeur: ");
                String nomExpediteur = scanner.nextLine();
                Utilisateur expediteur = reseau.rechercherUtilisateurParNom(nomExpediteur);
                if (expediteur != null) {
                    System.out.print("Nom du destinataire: ");
                    String nomDestinataire = scanner.nextLine();
                    Utilisateur destinataire = reseau.rechercherUtilisateurParNom(nomDestinataire);
                    if (destinataire != null) {
                        System.out.print("Contenu du message: ");
                        String contenu = scanner.nextLine();
                        Message message = new Message(contenu, expediteur, destinataire);
                        expediteur.envoyerMessage(message);
                        System.out.println("Message envoyé.");
                    } else {
                        System.out.println("Destinataire non trouvé.");
                    }
                } else {
                    System.out.println("Expéditeur non trouvé.");
                }
            } else if (choix == 4) {
                System.out.print("Nom de l'utilisateur: ");
                String nom = scanner.nextLine();
                Utilisateur utilisateur = reseau.rechercherUtilisateurParNom(nom);
                if (utilisateur != null) {
                    System.out.println("Messages reçus par " + utilisateur.getNom() + ":");
                    for (Message message : utilisateur.getMessagesRecus()) {
                        System.out.println("De " + message.getExpediteur().getNom() + ": " + message.getContenu());
                    }
                } else {
                    System.out.println("Utilisateur non trouvé.");
                }
            } else if (choix == 5) {
                break;
            }
        }

        scanner.close();
}
}
