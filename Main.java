import java.util.*;

public class Main {

    static class Enseignant {
        String nom, prenom, matricule, matiere;
        public Enseignant(String pNom, String pPrenom, String pMatricule, String pMatiere) {
            nom = pNom;
            prenom = pPrenom;
            matricule = pMatricule;
            matiere = pMatiere;
        }
        public String toString() {
            return "Matricule: " + matricule + " | Nom: " + nom + " | Matiere: " + matiere;
        }
    }

    static class Cours {
        String nomCours;
        public Cours(String pNomCours) {
            nomCours = pNomCours;
        }
        public String toString() {
            return "Cours: " + nomCours;
        }
    }

    static class Etudiant {
        String nom, prenom, matricule, password;
        double moyenne;
        boolean aUneNote; // Permet de valider l'affichage de la moyenne

        public Etudiant(String pNom, String pPrenom, String pMatricule, String pPassword) {
            nom = pNom;
            prenom = pPrenom;
            matricule = pMatricule;
            password = pPassword;
            moyenne = 0;
            aUneNote = false; 
        }
        public String toString() {
            return "Matricule: " + matricule + " | Nom: " + nom + " | Prenom: " + prenom;
        }
    }

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        ArrayList<Etudiant> etudiants = new ArrayList<>();
        ArrayList<Enseignant> enseignants = new ArrayList<>();
        ArrayList<Cours> cours = new ArrayList<>();
        int compteurEtu = 1;
        int compteurEns = 1;
        int choix;

        do {
            System.out.println("\n===== CENTRE DE FORMATION =====");
            System.out.println("1. S'inscrire");
            System.out.println("2. Liste des cours");
            System.out.println("3. Suivi");
            System.out.println("4. Espace Enseignant");
            System.out.println("5. Espace Responsable");
            System.out.println("0. Quitter");
            System.out.print("Votre choix: ");
            choix = clavier.nextInt();
            clavier.nextLine();

            switch (choix) {

		// ================= PARTIE 2 : INSCRIPTION ETUDIANT =================
                case 1:
                    String nom, prenom, password;

                    do {
                        System.out.print("Nom: ");
                        nom = clavier.nextLine();
                        if (nom.trim().isEmpty()) System.out.println("[Erreur] Le nom ne peut pas etre vide.");
                    } while (nom.trim().isEmpty());

                    do {
                        System.out.print("Prenom: ");
                        prenom = clavier.nextLine();
                        if (prenom.trim().isEmpty()) System.out.println("[Erreur] Le prenom ne peut pas etre vide.");
                    } while (prenom.trim().isEmpty());

                    do {
                        System.out.print("Mot de passe: ");
                        password = clavier.nextLine();
                        if (password.trim().isEmpty()) System.out.println("[Erreur] Le mot de passe ne peut pas etre vide.");
                    } while (password.trim().isEmpty());

                    // Generation automatique du matricule etudiant
                    String matricule = "ETU00" + compteurEtu;
                    Etudiant newEtu = new Etudiant(nom, prenom, matricule, password);
                    etudiants.add(newEtu);
                    compteurEtu++;
                    System.out.println("\n=== Inscription validee ! ===");
                    System.out.println(newEtu);
                    break;


